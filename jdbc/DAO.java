package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conexao;

	public int incluir(String sql, Object... atributos) {

		try {
			PreparedStatement stmt = getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			addAtributos(stmt, atributos);

			if (stmt.executeUpdate() > 0) {
				ResultSet result = stmt.getGeneratedKeys();

				if (result.next()) {
					return result.getInt(1);
				}
			}
			return -1;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private void addAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {

		int index = 1;
		for (Object atributo : atributos) {
			if (atributo instanceof String) {
				stmt.setString(index, (String) atributo);
			} else if (atributo instanceof Integer) {
				stmt.setInt(index, (Integer) atributo);
			}
			index++;
		}
	}

	private Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) {
				return conexao;
			}
		} catch (SQLException e) {

		}

		conexao = FabricaConexao.getConnection();
		return conexao;
	}

}

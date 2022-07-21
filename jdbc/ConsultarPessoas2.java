package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner enter = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConnection();
		List<Pessoa> pessoas = new ArrayList<>();
		
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		System.out.print("Pesquise: ");
		String search = enter.nextLine();
		
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + search + "%");
		ResultSet result = stmt.executeQuery();
		
		while (result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for (Pessoa p: pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}
		
		enter.close();
		stmt.close();
		conexao.close();
	}
}

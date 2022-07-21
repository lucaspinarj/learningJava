package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoas {

	public static void main(String[] args) throws SQLException {

		List<Pessoa> pessoas = new ArrayList<>();
		Connection conexao = FabricaConexao.getConnection();
		Scanner enter = new Scanner(System.in);

		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?;";

		System.out.print("Digite novo nome: ");
		String name = enter.nextLine();
		
		System.out.print("Digite o código em que se encontra: ");
		int id = enter.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, name);
		stmt.setInt(2, id);
		stmt.execute();

		System.out.println("\nUpdate feito com sucesso\n");

		ResultSet result = stmt.executeQuery("SELECT * FROM pessoas;");

		while (result.next()) {
			int codigo = result.getInt("codigo");
			String nome = result.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		System.out.println("Lista: ");
		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}

		enter.close();
		stmt.close();
		conexao.close();

	}
}

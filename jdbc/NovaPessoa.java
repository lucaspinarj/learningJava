package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		String nome = enter.nextLine();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		Connection conexao = FabricaConexao.getConnection();
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pessoa incluída com sucesso!");
		
		conexao.close();
		enter.close();
	}
}

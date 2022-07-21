package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.print("Informe o código: ");
		int codigo = enter.nextInt();
		
		Connection conexao = FabricaConexao.getConnection();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		
		if (contador > 0) {
			System.out.println("Pessoa excluída com sucesso!");
		} else {
			System.out.println("Nada aconteceu!");
		}
		
		System.out.println("Linhas afetadas: " + contador);
		
		enter.close();
		conexao.close();
	}
}

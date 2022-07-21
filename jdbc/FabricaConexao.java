package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

	public static Connection getConnection() {
		try {
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
			final String name = prop.getProperty("banco.usuario");
			final String password = prop.getProperty("banco.senha");
			
			return DriverManager.getConnection(url, name, password);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "conexao.properties";
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}
}

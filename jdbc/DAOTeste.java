package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		dao.incluir(sql, "João da Silva");
		dao.incluir(sql, "Ana Coelho");
		dao.incluir(sql, "Tupac Silva");
		
		System.out.print("Nomes incluídos com sucesso!");
	}
}

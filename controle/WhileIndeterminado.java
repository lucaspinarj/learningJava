package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		// Desafiadoooo!!
		
		Scanner entrada = new Scanner(System.in);
		
		String x = "";
		System.out.println("Desabafe!");
		while (!x.equalsIgnoreCase("sair")) {
			x = entrada.nextLine();
		}
		
		entrada.close();
	}
}

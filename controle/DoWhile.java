package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		// if(...) sentença ou {}
		// while(...) sentença; ou {}
		// for(...; ...; ...) sentença; ou {}
		
		// do sentença ou{} while(...);
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		do {
			System.out.println("diga as palavras mágicas");
			System.out.println("quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("obrigado!");
		
		entrada.close();
		
		
	}
}

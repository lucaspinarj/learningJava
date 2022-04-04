package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		// nota valida 10 a 0
		// armazenar todas as notas no total
		// media de todas as notas
		// -1 sai do programa

		Scanner k = new Scanner(System.in);

		double nota = 0;
		double total = 0;
		int contador = 0;

		while (nota != -1) {
			
			System.out.println("digite uma nota [ou -1 p/ sair]:");
			nota = k.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				
				total += nota;
				contador++;
			} else if(nota != -1) System.out.println("nota inválida");
		}
		
		double media = total/contador;
		System.out.println("a média é" + media);
		
		
		k.close();

	}
}

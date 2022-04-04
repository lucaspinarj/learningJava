package controle.exercicios;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = k.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Este número é par!");
		} else System.out.println("Este número é ímpar!");
		
		k.close();
	}
}

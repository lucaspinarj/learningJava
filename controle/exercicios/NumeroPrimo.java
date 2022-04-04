package controle.exercicios;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {

		Scanner k = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = k.nextInt();
		int div = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				div++;
			}
		}

		if (div == 2) {
			System.out.println("Este número é PRIMO");
		} else
			System.out.println("Este número NÃO é primo");

		k.close();
	}
}

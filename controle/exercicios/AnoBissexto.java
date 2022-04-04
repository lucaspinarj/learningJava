package controle.exercicios;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = k.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("Este é um ano bissexto!");
		} else System.out.println("Este NÃO é um ano bissexto");
		
		k.close();
	}
}

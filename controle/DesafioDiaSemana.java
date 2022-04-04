package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		// Terça -> 3
		// Segunda -> 2
		// Sábado -> 7

		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String dia = k.nextLine().toLowerCase().replace("á", "a").replace("ç", "c");
		
		//equals ignore case
		
		int x = 0;
		if (dia.equals("segunda")) {
			x = 2;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("terca")) {
			x = 3;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("quarta")) {
			x = 4;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("quinta")) {
			x = 5;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("sexta")) {
			x = 6;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("sabado")) {
			x = 7;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else if (dia.equals("domingo")) {
			x = 1;
			System.out.println("Esse é o " + x + "˚ dia da semana");
		} else {
			System.out.println("dia inválido");
		}
		
		
		k.close();
		
	}
}

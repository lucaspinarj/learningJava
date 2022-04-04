package controle.exercicios;

import java.util.Scanner;

public class Escola {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("Digite a 1a nota: ");
		double nota1 = k.nextDouble();
		
		System.out.print("Digite a 2a nota: ");
		double nota2 = k.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		System.out.println("\nA média do aluno é: " + media);
		System.out.println();
		
		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media < 7.0 && media > 4.0) {
			System.out.println("Recuperação");
		} else System.out.println("Reprovado");
		
		k.close();
	}
}

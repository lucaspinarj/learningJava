package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {

//		quantas notas vc quer informar?
//		array 5 posições (??)
//		primeiro laço for para armazenar notas
//		foreach para somar e apresentar a media

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja informar? ");
		int qt = entrada.nextInt();
		
		double[] nota = new double[qt];
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite a nota " + (i+1) + ":");
			nota[i] = entrada.nextDouble();
		}
		
		System.out.println("As notas desse aluno foram: " + Arrays.toString(nota));
		
		double soma = 0;
		for(double total: nota) {
			soma += total;
		}
		
		double media = soma / qt;
		
		System.out.println("Sua média foi " + media);
		

		entrada.close();

	}
}

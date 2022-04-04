package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasdaTurma = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int a = 0; a < notasdaTurma.length; a++) {
			for (int n = 0; n < notasdaTurma[a].length; n++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", (n+1), (a+1));
				notasdaTurma[a][n] = entrada.nextDouble();
				total += notasdaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é " + media);
		
		for(double[] notasDoAluno: notasdaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			
		}
		
		entrada.close();
	}
}

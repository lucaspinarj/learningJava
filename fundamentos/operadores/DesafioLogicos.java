package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// 1 trabalho, TV 32 e sorvete
		// 2 trabalhos, TV 50 e sorvete
		// nenhum trabalho, sem sorvete, saudavel
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Trabalho na terça foi feito?(S/N)");
		String t = k.nextLine().toUpperCase();
		
		boolean t1 = t.equals("S")?true:false;
		System.out.println(t1 + "\n");
		
		System.out.println("Trabalho na quinta foi feito?(S/N)");
		String q = k.nextLine().toUpperCase();
		
		boolean q1 = q.equals("S")?true:false;
		System.out.println(q1 + "\n");
		
		String tv32 = t1 ^ q1?"TV 32":"Ficaremos em casa!";
		String tv50 = t1 && q1?"TV 50":tv32;
		String sorvete = t1 || q1?"Comprou sorvete":"Ficou mais saudável";		
		
		
		System.out.println(tv50 + "\n\n" + sorvete);
		
				
		k.close();
		
	}
}

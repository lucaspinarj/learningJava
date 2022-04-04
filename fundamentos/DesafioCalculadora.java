package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// ler num1
		// ler num2
		// + - * / %
		
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("Digite o 1˚ numero: ");
		String x = k.nextLine().replace(",", ".");
		
		System.out.print("Digite o 2˚ numero: ");
		String y = k.nextLine().replace(",", ".");
		
		
		System.out.println("Digite a operação desejada");
		System.out.print("[ + ] [ - ] [ * ] [ / ] [ % ]\n");
		String z = k.next();
		
		Double x1 = Double.parseDouble(x);
		Double y1 = Double.parseDouble(y);
		
		double z1 = 0;
		z1 = z.equals("+")?(x1 + y1):z1;
		z1 = z.equals("-")?(x1 - y1):z1;
		z1 = z.equals("*")?(x1 * y1):z1;
		z1 = z.equals("/")?(x1 / y1):z1;
		z1 = z.equals("%")?(x1 % y1):z1;
		
		System.out.println("Seu resultado será: " + z1);
		
		k.close();
	}
}

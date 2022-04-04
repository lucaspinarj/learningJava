package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		// scanner, 3 strings, salarios, media, flexibilidade com virgula ou ponto
		
		Scanner k = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário: ");
		String x1 = k.nextLine()
				.replace(",", ".");
		
		System.out.println("Digite o segundo salário: ");
		String x2 = k.nextLine()
				.replace(",", ".");
		
		System.out.println("Digite o terceiro salário: ");
		String x3 = k.nextLine()
				.replace(",", ".");
		
		double s1 = Double.parseDouble(x1);
		double s2 = Double.parseDouble(x2);
		double s3 = Double.parseDouble(x3);
		
		double media = (s1 + s2 + s3) / 3;
		
		System.out.println("A média do salário desse funcionário é " + media);
		
		k.close();
	}
}

package fundamentos.operadores;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		int a1 = (int) Math.pow(6 * (3 + 2), 2);
		int a2 = 3 * 2;
		
		System.out.print(a1 + "/" + a2);
		
		int a0 = a1 / a2;

		System.out.println(" = " + a0);
		
		
		int b1 = (int) Math.pow((1 - 5) * (2 - 7), (2));
		int b2 = (int) Math.pow(2, 2);
		
		System.out.print(b1 + "/" + b2);
		
		int b0 = b1 / b2;
		
		System.out.println(" = " + b0);
		
		
		int c1 = (int) Math.pow((a0 - b0), (3));
		int c2 = (int) Math.pow(10, 3);
		
		System.out.printf("\n(%d - %d)ˆ3 / 10ˆ3",a0, b0);

		System.out.println("\n" + (a0 - b0) + "ˆ3 / 10ˆ3");
		
		int c0 = c1 / c2;
		
		System.out.println(c0);
		
	}
}

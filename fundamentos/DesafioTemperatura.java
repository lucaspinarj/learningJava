package fundamentos;

public class DesafioTemperatura {

	public static void main(String[] args) {
		
		// (F - 32) x 5/9 = C
		
		final double y = 5/9.0;
		final double x = -32;
		
		double faren = 86;
		double celsius = (faren + x) * y;
		
		System.out.println("A temperatura em Celsius é: " + celsius + "˚C");
	}
}

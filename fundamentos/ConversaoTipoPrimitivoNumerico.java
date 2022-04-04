package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1.12345678888888; //implicita
		System.out.println(a);
		
		float b = (float) 1.12345678888888; //explicita: cast
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; //explicita: cast
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;
		System.out.println(f);
	}
}

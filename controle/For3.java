package controle;

public class For3 {

	public static void main(String[] args) {
		
//		int i;
//		for(i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		System.out.println("Saiu do laço");
//		System.out.println(i);
//		
//		//
//		
//		for(int a = 0; a < 10; a++) {
//			System.out.println(a);
//		}
//		int a = 0;
//		System.out.println("Saiu do laço");
//		System.out.println(a);
		
		for(int i = 0; i < 10; i++) {
			for( int j = 0; j < 10; j++) {
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		
	}
}

package pi;

import java.util.Scanner;

public class CalcPi {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter number of terms:");
		double term = keyboard.nextDouble();
		
		/*
		 * pi = 4/1 + (-4/3) + 4/5 + (-4/7) + (4/9) .....
		 */
		
		int num = 1;
		double pi = 0.0;
		
		for (int i = 0; i <= term; i++) {
			double currentTerm = 0.0;
			if(i % 2 == 0) {
				currentTerm = (double) 4/num;
			} else {
				currentTerm = (double) -4/num;
			}
			num += 2;
			pi += currentTerm;
			System.out.println(pi);
		}
		
		System.out.println("\n-- Acabou :D --");
		
		keyboard.close();
		
	}
}

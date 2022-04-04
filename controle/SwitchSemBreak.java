package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		// if(boolean) ...
		// while (boolean) ...
		// for (;boolean;) ...
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei bassai-dai...");
		case "marrom":
			System.out.println("sei o tekki shodan");
		case "roxa":
			System.out.println("sei o heian godan");
		case "verde":
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
//			break;
//		default:
//			System.out.println("não sei de nada");
		}
		System.out.println("\nFim!\n");
		
		int idade = 3;
		switch (idade) { 
		case 3:
			System.out.println("sabe programar");
		case 2:
			System.out.println("sabe falar");
		case 1:
			System.out.println("sabe andar");
		case 0: 
			System.out.println("sabe respirar");
			
			
		}
		
	}
}

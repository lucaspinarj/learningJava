package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Lucas", 99.8);
		
		Comida c1 = new Comida("Arroz", 0.180);
		Comida c2 = new Comida("Feijão", 0.300);
		
		System.out.println(p.nome + " tem " + p.peso + "kgs");
		
		p.Comer(c1);
		
		System.out.println(p.nome + " comeu arroz e ficou com " + p.peso + "kgs");
		
		p.Comer(c2);
		
		System.out.println(p.nome + " comeu feijão e ficou com " + p.peso + "kgs");
		
		p.Comer(c1);
		p.Comer(c2);
		
		System.out.println(p.nome + " comeu arroz e feijão e ficou com " + p.peso + "kgs");
	}
}

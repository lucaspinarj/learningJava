package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida ingrediente1 = new Arroz(0.25);
		Comida ingrediente2 = new Feijao(0.180);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		
		System.out.println();
		System.out.println(convidado.getPeso());
		
		Comida sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println();
		System.out.println(convidado.getPeso());
		
		
		
	}
}

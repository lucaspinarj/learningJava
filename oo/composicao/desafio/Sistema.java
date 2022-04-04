package oo.composicao.desafio;

public class Sistema {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Lucas");
		
		Compra c1 = new Compra();
		c1.addItem("Caneta", 5, 10);
		
		Compra c2 = new Compra();
		c2.addItem("Borracha", 10, 10);
		
		cliente.AddCompra(c1);
		cliente.AddCompra(c2);
		
		System.out.println(cliente.getAllC());
		
	}
}

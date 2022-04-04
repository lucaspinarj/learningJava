package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	List<Compra> compra = new ArrayList<>();
	
	void AddCompra(Compra compra) {
		this.compra.add(compra);
	}
	
	double getAllC() {
		double total = 0;
		
		for (Compra compra: compra) {
			total += compra.getValue();
		}
		return total;
	}
}

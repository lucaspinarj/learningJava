package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	List<Item> itens = new ArrayList<>();
	
	void addItem(String nome, double preco, int qtde) {
		Produto produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
	
	void addItem(Produto produto, int qtde) {
		itens.add(new Item(produto, qtde));
	}
	

	double getValue() {
		double total = 0;
		
		for (Item item: itens) {
			total += (item.produto.preco * item.qtde);
		}
		return total;
	}
	
}

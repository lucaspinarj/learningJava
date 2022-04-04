package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
//		segredo
//		facoDentroDecasa
//		formaDeFalar
//		todosSabem
		
		Ana mae = new Ana();
		
//		System.out.println(mae.segredo);
//		System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar);
		System.out.println(mae.todosSabem);
		System.out.println(todosSabem);
		System.out.println(new Ana().todosSabem);
	}

}

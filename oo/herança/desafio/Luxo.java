package oo.herança.desafio;

public interface Luxo {

	boolean Ar();
	
	default int velocidadeDoAr() {
		return 1;
	}
}

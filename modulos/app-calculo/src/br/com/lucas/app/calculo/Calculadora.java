package br.com.lucas.app.calculo;

import br.com.lucas.app.calculo.interno.OperacoesAritmeticas;
import br.com.lucas.app.logging.Logger;

public class Calculadora {

	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return operacoesAritmeticas.soma(nums);
	}
	
	
	
}

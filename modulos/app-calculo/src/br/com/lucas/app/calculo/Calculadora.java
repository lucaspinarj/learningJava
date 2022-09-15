package br.com.lucas.app.calculo;

import br.com.lucas.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	private OperacoesAritmeticas operacoesAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		return operacoesAritmeticas.soma(nums);
	}
}

package br.com.lucas.app.financeiro;

import java.lang.reflect.Field;

import br.com.lucas.app.calculo.Calculadora;
import br.com.lucas.app.calculo.interno.OperacoesAritmeticas;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));

		OperacoesAritmeticas op = new OperacoesAritmeticas();
		System.out.println(op.soma(4, 5, 6));

		try {
			Field fieldId = Calculadora.class.getDeclaredFields()[0];

			fieldId.setAccessible(true);

			System.out.println(fieldId.get(calc));

			fieldId.set(calc, "def");

			System.out.println(fieldId.get(calc));

			fieldId.setAccessible(false);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

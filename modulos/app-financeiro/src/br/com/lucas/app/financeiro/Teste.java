package br.com.lucas.app.financeiro;

import java.util.ServiceLoader;

import br.com.lucas.app.Calculadora;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader.load(Calculadora.class)
										.findFirst()
										.get();
		System.out.println(calc.soma(2, 3, 4));

//		OperacoesAritmeticas op = new OperacoesAritmeticas();
//		System.out.println(op.soma(4, 5, 6));

//		try {
//			Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//
//			fieldId.setAccessible(true);
//
//			System.out.println(fieldId.get(calc));
//
//			fieldId.set(calc, "def");
//
//			System.out.println(fieldId.get(calc));
//
//			fieldId.setAccessible(false);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}

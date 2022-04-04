package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

@SuppressWarnings("unused")
public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal >= 2500 (8,5%) / < 2500 (isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		UnaryOperator<Double> desconto = n -> n * (1 - p.desconto);
		
		Double desconto1 = desconto.apply(p.preco);
		System.out.printf("iPad com desconto = %.2f",desconto1);
		
		UnaryOperator<Double> tax = n -> (n >= 2500) ? ((n * 0.085) + n) : n;
		
		Double tax1 = desconto.andThen(tax).apply(p.preco);
		System.out.printf("\niPad com desconto e com taxas = %.2f", tax1);
		
		UnaryOperator<Double> shipment = n -> (n >= 3000) ? (n + 100) : (n + 50);
		
		Double shipment1 = desconto.andThen(tax).andThen(shipment).apply(p.preco);
		System.out.printf("\niPad com desconto, com taxas e com frete = %.2f", shipment1);
		
		Double redondo = Math.round(shipment1 * 100.0)/100.0;
		String valor = Double.toString(redondo);
		
		System.out.println("\nProduto online com valor de R$" + valor.replace(".", ","));
		
//		Function<Produto, Double> precoFinal =
//				prod -> prod.preco * (1 - prod.desconto);
//		UnaryOperator<Double> impostoMunicipal =
//				preco -> preco >= 2500 ? preco * 1.085 : preco;
//		UnaryOperator<Double> frete = 
//				preco -> preco >= 3000 ? preco + 100 : preco + 50;
//		UnaryOperator<Double> arredondar = 
//				preco -> Double.parseDouble(String.format("%.2f", preco));
//		Function<Double, String> formatar = 
//				preco -> ("R$" + preco).replace(".", ",");
//		
//		String preco = precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p);
//		System.out.println("O preço final é " + preco);
	}
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class DesafioFilter1 {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("VW", 150000.00, 2014);
		Carro c2 = new Carro("BMW", 630000.00, 2018);
		Carro c3 = new Carro("Porshe", 500000.00, 2010);
		Carro c4 = new Carro("Ferrari", 700000.00, 2020);
		Carro c5 = new Carro("Citroen", 95000.00, 2009);
		
		List<Carro> todos = Arrays.asList(c1, c2, c3, c4, c5);
		
		Consumer<Object> print = System.out::println;
		
		Predicate<Carro> caro = c -> c.preco >= 500000;
		Predicate<Carro> ano = c -> c.ano >= 2010;
		
		Function<Carro, String> seguro = c -> "O carro " + c.nome + " está segurado";
		
		todos.stream()
			.filter(caro)
			.filter(ano)
			.map(seguro)
			.forEach(print);
		
	}
}

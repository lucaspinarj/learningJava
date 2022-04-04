package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//import java.util.function.Consumer;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
//		Consumer<Object> print = System.out::println;

		System.out.println("Usando for tradicional...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}

		System.out.println("\nUsando foreach...");
		for (String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nUsando Iterator...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nUsando Stream...");
		Stream<String> stream = aprovados.stream();
//		stream.forEach(print); // laço interno!
		stream.forEach(System.out::println);
	}
}

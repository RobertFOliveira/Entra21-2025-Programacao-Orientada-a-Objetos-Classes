package exemplo2ArrayListOrdemElementos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Exemplo2ArrayListOrdemElementos {

	public static void main(String[] args) {
		// 2) Crie uma ArrayList e inverta a ordem dos elementos

		List<String> listaNomes = new ArrayList<>();

		listaNomes.add("José");
		listaNomes.add("Maria");
		listaNomes.add("Babi");
		listaNomes.add("João");
		listaNomes.add("Jaco");
		listaNomes.add("Alice");

		// Lista Original
		System.out.println("Lista original: " + listaNomes);

		// Inversão da Lista
		Collections.reverse(listaNomes);
		// Lista invertida
		System.out.println("Lista invertida: " + listaNomes);

		// listaNomes.sort(null); // Ordena a lista em ordem crescente
		// listaNomes.sort(Collections.reverseOrder()); // Ordena a lista em ordem
		// decrescente

		System.out.println(listaNomes);
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println(listaNomes.get(i));
		}
	}

}

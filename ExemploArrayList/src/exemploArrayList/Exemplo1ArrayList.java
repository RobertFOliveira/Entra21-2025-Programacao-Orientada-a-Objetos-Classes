package exemploArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exemplo1ArrayList {

	public static void main(String[] args) {
		
		// Exercícios de Array List
		// 1) Coloque 5 elementos em uma Array List e ordene-os


		List<Double> listaNotas = new ArrayList<>();
		
		listaNotas.add(10.72);
		listaNotas.add(6.76);
		listaNotas.add(85.12);
		listaNotas.add(77.3);
		listaNotas.add(77.7);
		
		listaNotas.sort(null);
		
		System.out.println(listaNotas);
		
		
	}

}

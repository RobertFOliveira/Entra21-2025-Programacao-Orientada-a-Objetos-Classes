package exemplo4ArrayListAlgoritmo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 4) Faça um algoritmo que descubra se uma Array List possui o número que o usuário entrou.
		// Imprima também o seu índice

		List<Integer> lista = new ArrayList<>();
		
		lista.add(10);
		lista.add(6);
		lista.add(85);
		lista.add(77);
		lista.add(73);

		Scanner input = new Scanner(System.in);
		
		System.out.print("Insira um valor: ");
		int valor = input.nextInt();
		
		int indice = lista.indexOf(valor);
		
		if (indice != -1) {
			System.out.print("O elemento está no índice: " + indice);
		}
		else {
			System.out.println("Elemento não está na lista.");
		}
	}

}

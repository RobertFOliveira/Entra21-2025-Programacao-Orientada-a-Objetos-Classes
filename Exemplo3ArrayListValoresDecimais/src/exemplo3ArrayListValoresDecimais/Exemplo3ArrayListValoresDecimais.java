package exemplo3ArrayListValoresDecimais;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exemplo3ArrayListValoresDecimais {

	public static void main(String[] args) {
		// 3)
		// Crie uma Array List
		// O usuário vai colocando valores decimais até ele colocar o número 0.
		// Calcular:
		// a) Qual o menor número
		// b) Qual o maior número
		// c) Calcular a média

		List<Double> listaDecimal = new ArrayList<>();

		Scanner input = new Scanner(System.in);

		System.out.print("Insira o valor: ");

		double valor = input.nextDouble();

		while (valor != 0) {
			listaDecimal.add(valor);
			System.out.print("Insira o valor: ");
			valor = input.nextDouble();
		}

		System.out.println(Collections.max(listaDecimal));

		System.out.println(Collections.min(listaDecimal));

		double soma = 0;
		for (int i = 0; i < listaDecimal.size(); i++) {
			soma += listaDecimal.get(i);
		}
		double media = soma / listaDecimal.size();

		System.out.println("A media foi de: " + media);
	}

}

package projetoClassesObjetosIRPF;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;


public class App {

	
	public static void main(String[] args) {

		NumberFormat formatoBR = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		// TODO Auto-generated method stub
		// Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME,
		// CPF, UF (RS, PR e SC) e RENDA ANUAL.
		// EX: Nome: João da Silva
		// CPF: 123.456.789-00
		// UF: PR
		// RendaAnual: R$40.000
		// Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
		// Nível de Renda Anual Alíquota
		// 0 a 4.000 0%
		// 4.001 a 9.000 5,8%
		// 9.001 a 25.000 15%
		// 25.001 a 35.000 27,5%
		// acima de 35.000 30%
		// Sendo assim, deve-se calcular o imposto a pagar do seguinte modo:
		// Imposto a pagar = Renda Anual * Alíquota
		// Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
		// Calcule:
		// a) Quem mais paga imposto.
		// b) Quem menos paga imposto.
		// c) Qual o total de imposto pago entre os 5 contribuintes?
		Contribuinte A = new Contribuinte("João Silva", "12345678915", "SC", 20000);
		Contribuinte B = new Contribuinte("José Silva", "98765432116", "MG", 40000);
		Contribuinte C = new Contribuinte("Maria Lima", "45612378920", "SP", 4500);
		Contribuinte D = new Contribuinte("Baltazar Bento", "78912345620", "RJ", 9000);
		Contribuinte E = new Contribuinte("Aristoteles Gaia", "15975346850", "RS", 12000);

		// 			// Declaração contribuintes no vetor
		// Irpf[] irpfs = { contribuinteA, contribuinteB, contribuinteC, contribuinteD, contribuinteE };
		
		Contribuinte vetor[] = { A, B, C, D, E };

		// a) Quem mais paga imposto.

		double maiorImposto = 0;
		Contribuinte contribuinteMaiorImposto = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImpostoDeRenda() > maiorImposto) {
				maiorImposto = vetor[i].calcularImpostoDeRenda();
				contribuinteMaiorImposto = vetor[i];
			}
		}

		System.out.println("O contribuinte que paga o maior imposto foi: " + contribuinteMaiorImposto);
		
		// b) Quem menos paga imposto.
		
		double menorImposto = Double.MAX_VALUE;
		Contribuinte contribuinteMenorImposto = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularImpostoDeRenda() < menorImposto) {
				menorImposto = vetor[i].calcularImpostoDeRenda();
				contribuinteMenorImposto = vetor[i];
			}
		}

		System.out.println("O contribuinte que paga o menor imposto foi: " + contribuinteMenorImposto);

		// Total de imposto pago
		double totalImposto = 0;
		for (int i = 0; i < vetor.length; i++) {
			totalImposto += vetor[i].calcularImpostoDeRenda();
		}
		System.out.println("O total de imposto arrecadado foi de: " + formatoBR.format(totalImposto));
	}

	
}

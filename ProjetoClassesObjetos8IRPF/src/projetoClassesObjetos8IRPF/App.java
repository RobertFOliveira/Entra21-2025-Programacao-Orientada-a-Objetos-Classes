package projetoClassesObjetos8IRPF;

import java.text.NumberFormat;
import java.time.LocalTime;
import java.util.Locale;

public class App {

	public static void main(String[] args) {
		// Locale do Brasil para usar vírgula como separador decimal
		NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

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

		Irpf contribuinteA = new Irpf("João Silva", "123.456.789-15", "SC", 20000);
		Irpf contribuinteB = new Irpf("José Silva", "987.654.321-16", "MG", 40000);
		Irpf contribuinteC = new Irpf("Maria Lima", "456.123.789-20", "São Paulo", 4500);
		Irpf contribuinteD = new Irpf("Baltazar Bento", "789.123.456-20", "RJ", 9000);
		Irpf contribuinteE = new Irpf("Aristoteles Gaia", "159.753.468-50", "RS", 12000);

		// Declaração contribuintes no vetor
		Irpf[] irpfs = { contribuinteA, contribuinteB, contribuinteC, contribuinteD, contribuinteE };

		// Variáveis
		// a) Quem mais paga imposto.

		// calculo imposto de renda

		double maiorImposto = Double.MIN_VALUE;
		double menorImposto = Double.MAX_VALUE;
		double totalImposto = 0;

		Irpf quemMaisPaga = null;
		Irpf quemMenosPaga = null;

		// c) Qual o total de imposto pago entre os 5 contribuintes?
		for (int i = 0; i < irpfs.length; i++) {
			double imposto = irpfs[i].calcularImposto();
			totalImposto += imposto;

			if (imposto > maiorImposto) {
				maiorImposto = imposto;
				quemMaisPaga = irpfs[i];
			}
			// b) Quem menos paga imposto.

			if (imposto < menorImposto) {
				menorImposto = imposto;
				quemMenosPaga = irpfs[i];
			}

		}

		System.out.println(
				"Contribuinte que mais paga imposto: " + quemMaisPaga.getNome() + " - " + nf.format(maiorImposto));
		System.out.println(
				"Contribuinte que menos paga imposto: " + quemMenosPaga.getNome() + " - R$ " + nf.format(menorImposto));
		System.out.println("Total de impostos pagos pelos 5 contribuintes foi de R$ " + nf.format(totalImposto));

	}
}

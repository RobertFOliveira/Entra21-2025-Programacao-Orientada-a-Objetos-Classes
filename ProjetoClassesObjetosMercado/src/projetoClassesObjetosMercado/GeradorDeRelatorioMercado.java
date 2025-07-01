package projetoClassesObjetosMercado;

import java.text.NumberFormat;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Iterator;
import java.util.Locale;

public class GeradorDeRelatorioMercado {

	public void exibirRelatorio(Mercado mercado) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println("\nUnidade: " + mercado.nome);

		double totalMacas = mercado.nMacasVendAno * mercado.valorMacas;
		double totalLaranjas = mercado.nLaranjasVendAno * mercado.valorLaranjas;

		System.out.println("\nUnidade: " + mercado.nome);
		System.out.println("Quantidade de Maçãs vendidas por ano: " + mercado.nMacasVendAno + " | Valor unitário: R$ "
				+ formato.format(mercado.valorMacas) + " | Total: R$ " + formato.format(totalMacas));

		System.out.println("Quantidade de Laranjas vendidas por ano: " + mercado.nLaranjasVendAno
				+ " | Valor unitário: R$ " + formato.format(mercado.valorLaranjas) + " | Total: R$ " + formato.format(totalLaranjas));

	}

	public void maiorReceitaVendasMacas(Mercado[] mercados) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		Mercado maior = mercados[0];
		double maiorReceitaMacas = maior.nMacasVendAno * maior.valorMacas;

		for (int i = 0; i < mercados.length; i++) {
			double receitaAtual = mercados[i].nMacasVendAno * mercados[i].valorMacas;
			if (receitaAtual > maiorReceitaMacas) {
				maior = mercados[i];
				maiorReceitaMacas = receitaAtual;
			}
		}
		System.out.println("\n==> Loja com maior receita em vendas de maçãs:");
		System.out.println("Unidade: " + maior.nome);
		System.out.println("Receita com maçãs: R$" + formato.format(maiorReceitaMacas));
	}

	public void maiorReceitaVendasLaranjas(Mercado[] mercados) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		Mercado maior = mercados[0];
		double maiorReceitaLaranjas = maior.nLaranjasVendAno * maior.valorLaranjas;

		for (int i = 0; i < mercados.length; i++) {
			double receitaAtual = mercados[i].nLaranjasVendAno * mercados[i].valorLaranjas;
			if (receitaAtual > maiorReceitaLaranjas) {
				maior = mercados[i];
				maiorReceitaLaranjas = receitaAtual;
			}
		}
		System.out.println("\n==> Loja com maior receita em vendas de laranjas:");
		System.out.println("Unidade: " + maior.nome);
		System.out.println("Receita com laranjas: R$" + formato.format(maiorReceitaLaranjas));
	}
	
	public void maiorReceitaMercado(Mercado[] mercados) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		Mercado maior = mercados[0];
		double maiorTotal = mercados[0].calcularFaturamentoTotal();
		
		for (int i = 1; i < mercados.length; i++) {
			double totalAtual = mercados[i].calcularFaturamentoTotal();
			if (totalAtual > maiorTotal) {
				maiorTotal = totalAtual;
				maior = mercados[i];
			}
		}
		System.out.println("\nLoja com maior receita total: ");
		System.out.println("Unidade: " + maior.nome);
		System.out.println("Receita total: " + formato.format(maiorTotal));
	}
	
	public void menorReceitaMercado(Mercado[] mercados) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		Mercado menor = mercados[0];
		double menorTotal = mercados[0].calcularFaturamentoTotal();
		
		for (int i = 1; i < mercados.length; i++) {
			double totalAtual = mercados[i].calcularFaturamentoTotal();
			if (totalAtual < menorTotal) {
				menorTotal = totalAtual;
				menor = mercados[i];
			}
		}
		System.out.println("\n[D] Loja com MENOR RECEITA TOTAL:");
	    System.out.println("Unidade: " + menor.nome);
	    System.out.println("Receita Total: " + formato.format(menorTotal));
	}
	
	public void receitaIntermediaria(Mercado[] mercados) {
	    NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	    // Cria um vetor auxiliar com os mercados ordenados por receita total
	    Mercado[] copia = mercados.clone();
	    
	    // Ordena usando bubble sort (simples)
	    for (int i = 0; i < copia.length - 1; i++) {
	        for (int j = i + 1; j < copia.length; j++) {
	            if (copia[i].calcularFaturamentoTotal() > copia[j].calcularFaturamentoTotal()) {
	                Mercado temp = copia[i];
	                copia[i] = copia[j];
	                copia[j] = temp;
	            }
	        }
	    }

	    Mercado doMeio = copia[1];

	    System.out.println("\n[E] Loja com RECEITA INTERMEDIÁRIA:");
	    System.out.println("Unidade: " + doMeio.nome);
	    System.out.println("Receita Total: " + formato.format(doMeio.calcularFaturamentoTotal()));
	}

	public void compararReceitaFranquiaMacasLaranjas(Mercado[] mercados) {
	    NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

	    double totalMacas = 0;
	    double totalLaranjas = 0;

	    for (Mercado mercado : mercados) {
	        totalMacas += mercado.calcularFaturamentoMacas();
	        totalLaranjas += mercado.calcularFaturamentoLaranjas();
	    }

	    System.out.println("\n[F] Receita TOTAL da franquia:");
	    System.out.println("→ Receita com maçãs: " + formato.format(totalMacas));
	    System.out.println("→ Receita com laranjas: " + formato.format(totalLaranjas));

	    if (totalMacas > totalLaranjas) {
	        System.out.println("Resultado: Maçãs geraram mais receita.");
	    } else if (totalLaranjas > totalMacas) {
	        System.out.println("Resultado: Laranjas geraram mais receita.");
	    } else {
	        System.out.println("Resultado: Receita igual para maçãs e laranjas.");
	    }
	}

}

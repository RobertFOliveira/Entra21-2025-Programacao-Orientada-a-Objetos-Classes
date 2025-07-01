package projetoClassesObjetos7Mercados;

import java.text.NumberFormat;
import java.util.Locale;


public class GeradorDeRelatorioMercados {

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

	
}

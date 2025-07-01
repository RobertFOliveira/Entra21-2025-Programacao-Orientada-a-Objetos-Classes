package projetoClassesObjetos8Mercado;

public class Mercado {
	String nome;
	int nMacasVendAno;
	int valorMacas;
	int nLaranjasVendAno;
	int valorLaranjas;

	public double calcularFaturamentoMacas() {
		return nMacasVendAno * valorMacas;
	}

	public double calcularFaturamentoLaranjas() {
		return nLaranjasVendAno * valorLaranjas;
	}

	public double calcularFaturamentoTotal() {
		return calcularFaturamentoMacas() + calcularFaturamentoLaranjas();
	}

}

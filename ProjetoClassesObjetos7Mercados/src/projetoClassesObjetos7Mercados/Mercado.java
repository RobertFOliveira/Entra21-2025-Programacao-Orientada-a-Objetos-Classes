package projetoClassesObjetos7Mercados;


public class Mercado {

	
	
	public Mercado(String nome, int nMacasVendAno, int valorMacas, int nLaranjasVendAno, int valorLaranjas,
			int qtdMacasVendidas, double precoMacas, int qtdLaranjasVendidas, double precoLaranjas) {
		super();
		this.nome = nome;
		this.nMacasVendAno = nMacasVendAno;
		this.valorMacas = valorMacas;
		this.nLaranjasVendAno = nLaranjasVendAno;
		this.valorLaranjas = valorLaranjas;
		this.qtdMacasVendidas = qtdMacasVendidas;
		this.precoMacas = precoMacas;
		this.qtdLaranjasVendidas = qtdLaranjasVendidas;
		this.precoLaranjas = precoLaranjas;
	}
	String nome;
	int nMacasVendAno;
	int valorMacas;
	int nLaranjasVendAno;
	int valorLaranjas;
	
	int qtdMacasVendidas;
	double precoMacas;
	int qtdLaranjasVendidas;
	double precoLaranjas;

	public double calcularReceitaMacas() {
		return qtdMacasVendidas * valorMacas;
	}
	
	public double calcularReceitaLaranjas() {
		return qtdLaranjasVendidas * valorLaranjas;
	}
	public double calcularReceitaTotal() {
		return calcularReceitaMacas() + calcularReceitaLaranjas();
	}
	
	

}

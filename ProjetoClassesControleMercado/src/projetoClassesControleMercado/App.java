package projetoClassesControleMercado;

public class App {

	public static void main(String[] args) {
	
		Mercado unidadeDeBlumenau = new Mercado("ArmazemBlu", 1500, 3, 3000,5);
		
		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nome = "ArmazémVille";
		unidadeDeJoinville.nMacasVendAno = 2000;
		unidadeDeJoinville.valorMacas = 3;
		unidadeDeJoinville.nLaranjasVendAno = 5000;
		unidadeDeJoinville.valorLaranjas = 6;

		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nome = "ArmazémFloripa";
		unidadeDeFlorianopolis.nMacasVendAno = 3000;
		unidadeDeFlorianopolis.valorMacas = 4;
		unidadeDeFlorianopolis.nLaranjasVendAno = 4000;
		unidadeDeFlorianopolis.valorLaranjas = 7;
		
		Mercado vetor[] = {unidadeDeBlumenau, unidadeDeFlorianopolis, unidadeDeJoinville};
	}

}

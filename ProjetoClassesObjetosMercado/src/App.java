
public class App {

	
	public static void main(String[] args) {
		System.out.println("Executando corretamente!");
		
		Mercado unidadeDeBlumenau = new Mercado();
		unidadeDeBlumenau.nome = "ArmazémBlu";
		unidadeDeBlumenau.nMacasVendAno = 1500;
		unidadeDeBlumenau.valorMacas = 3;
		unidadeDeBlumenau.nLaranjasVendAno = 3000;
		unidadeDeBlumenau.valorLaranjas = 5;

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

		// Criar instância da classe de relatório
		GeradorDeRelatorioMercado relatorio = new GeradorDeRelatorioMercado();

		System.out.println("=== RELATÓRIO DE VENDAS ANUAL ===");
		relatorio.exibirRelatorio(unidadeDeBlumenau);
		relatorio.exibirRelatorio(unidadeDeJoinville);
		relatorio.exibirRelatorio(unidadeDeFlorianopolis);

        // Criar vetor com as unidades e chamar método para maior receita com maçãs
		Mercado[] unidades = { unidadeDeBlumenau, unidadeDeJoinville, unidadeDeFlorianopolis };
		
		relatorio.maiorReceitaVendasMacas(unidades);    // A
		relatorio.maiorReceitaVendasLaranjas(unidades); // B
		relatorio.maiorReceitaMercado(unidades);        // C

		relatorio.menorReceitaMercado(unidades);        // D
		relatorio.receitaIntermediaria(unidades);       // E
		relatorio.compararReceitaFranquiaMacasLaranjas(unidades); // F

		
	}

}

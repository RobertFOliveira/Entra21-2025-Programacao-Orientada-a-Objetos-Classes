package projetoClassesObjetos7Mercados;


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
					
			// Quem teve a maior receita vendendo maças
			double maiorReceitaMacas = Double.MIN_VALUE;
			Mercado mercadoMaiorReceitaMacas = null;
			for(int i = 0; i < vetor.length; i++) {
				if (vetor[i].calcularReceitaMacas() > maiorReceitaMacas) {
					maiorReceitaMacas = vetor[i].calcularReceitaMacas();
					mercadoMaiorReceitaMacas = vetor[1];
				}
			}
			
			System.out.println("O mercado que mais teve receita com a venda de maças foi: " + mercadoMaiorReceitaMacas.nome);
			
			
			// Quem teve a maior receita vendendo Laranjas
			double maiorReceitaLaranjas = Double.MIN_VALUE;
			Mercado mercadoMaiorReceitaLaranjas = null;
			for(int i = 0; i < vetor.length; i++) {
				if (vetor[i].calcularReceitaLaranjas() > maiorReceitaLaranjas) {
					maiorReceitaLaranjas = vetor[i].calcularReceitaLaranjas();
					mercadoMaiorReceitaLaranjas = vetor[1];
				}
			}
			
			System.out.println("O mercado que mais teve receita com a venda de maças foi: " + mercadoMaiorReceitaLaranjas.nome);
			
			// Quem teve a maior receita total
			double maiorReceitaTotal = Double.MIN_VALUE;
			Mercado mercadoMaiorReceitaTotal = null;
			for(int i = 0; i < vetor.length; i++) {
				if (vetor[i].calcularReceitaTotal() > maiorReceitaTotal) {
					maiorReceitaTotal = vetor[i].calcularReceitaTotal();
					mercadoMaiorReceitaTotal = vetor[1];
				}
			}
			System.out.println("Maior receita total: " + mercadoMaiorReceitaTotal.nome);
			
			// Qual das lojas ficou no meio em termos de receita
			
			double maiorValorTotal = Double.MIN_VALUE;
			
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i].calcularReceitaTotal() > maiorReceitaTotal) {
					maiorReceitaTotal = vetor[i].calcularReceitaTotal();
				}
			}
			double segundoMaiorValor = Double.MIN_VALUE;
			Mercado mercadadoSegundoMaior = null;
			for (int i = 0; i < vetor.length; i++) {
				if (vetor[i].calcularReceitaTotal() > segundoMaiorValor && vetor[i].) {
				segundoMaiorValor = vetor[i].calcularReceitaTotal();
				
				}
			}
			

		// Criar instância da classe de relatório
		//	GeradorDeRelatorioMercados relatorio = new GeradorDeRelatorioMercados();

		//	System.out.println("=== RELATÓRIO DE VENDAS ANUAL ===");
		//	relatorio.exibirRelatorio(unidadeDeBlumenau);
		//	relatorio.exibirRelatorio(unidadeDeJoinville);
		//	relatorio.exibirRelatorio(unidadeDeFlorianopolis);


	}

}

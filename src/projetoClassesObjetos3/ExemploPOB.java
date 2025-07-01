package projetoClassesObjetos3;

public class ExemploPOB {

	public static void main(String[] args) {
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
		RelatorioMercado relatorio = new RelatorioMercado();

		System.out.println("=== RELATÓRIO DE VENDAS ANUAL ===");
		relatorio.exibirRelatorio(unidadeDeBlumenau);
		relatorio.exibirRelatorio(unidadeDeJoinville);
		relatorio.exibirRelatorio(unidadeDeFlorianopolis);

		// System.out.println("===RELATÓRIO===");
		// System.out.println("\nUnidade: " + unidadeDeBlumenau.nome);
		// System.out.println("Quantidade de Maças vendidas por ano: " +
		// unidadeDeBlumenau.nMacasVendAno + " no valor de: R$ " +
		// unidadeDeBlumenau.nMacasVendAno);
		// System.out.println("Quantidade de Laranjas vendidas por ano: " +
		// unidadeDeBlumenau.nLaranjasVendAno + " no valor de: R$ " +
		// unidadeDeBlumenau.valorLaranjas);

		// System.out.println("\nUnidade: " + unidadeDeJoinville.nome);
		// System.out.println("Quantidade de Maças vendidas por ano: " +
		// unidadeDeJoinville.nMacasVendAno + " no valor de: R$ " +
		// unidadeDeJoinville.nMacasVendAno);
		// System.out.println("Quantidade de Laranjas vendidas por ano: " +
		// unidadeDeJoinville.nLaranjasVendAno + " no valor de: R$ " +
		// unidadeDeJoinville.valorLaranjas);

		// System.out.println("\nUnidade: " + unidadeDeFlorianopolis.nome);
		// System.out.println("Quantidade de Maças vendidas por ano: " +
		// unidadeDeFlorianopolis.nMacasVendAno + " no valor de: R$ " +
		// unidadeDeFlorianopolis.nMacasVendAno);
		// System.out.println("Quantidade de Laranjas vendidas por ano: " +
		// unidadeDeFlorianopolis.nLaranjasVendAno + " no valor de: R$ " +
		// unidadeDeFlorianopolis.valorLaranjas);

	}

}

package projetoClassesObjetosMercado;

public class RelatorioMercado {

    public void exibirRelatorio(Mercado mercado) {
        System.out.println("\nUnidade: " + mercado.nome);
        
        double totalMacas = mercado.nMacasVendAno * mercado.valorMacas;
        double totalLaranjas = mercado.nLaranjasVendAno * mercado.valorLaranjas;
        double maiorReceitaMacas = mercado.nome >= mercado.nMacasVendAno;
        double maiorReceitaLaranjas = mercado.nome >= mercado.nLaranjasVendAno;
        double maiorReceita = mercado.nome >= 

        System.out.println("Quantidade de Maçãs vendidas por ano: " + mercado.nMacasVendAno +
                           " | Valor unitário: R$ " + mercado.valorMacas +
                           " | Total: R$ " + totalMacas);

        System.out.println("Quantidade de Laranjas vendidas por ano: " + mercado.nLaranjasVendAno +
                           " | Valor unitário: R$ " + mercado.valorLaranjas +
                           " | Total: R$ " + totalLaranjas);
        System.out.println("A loja que teve a maior receita na vendas: " + maiorReceitaMacas);
}
}

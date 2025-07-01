package projetoClassesObjetos3;

public class RelatorioMercado {

    public void exibirRelatorio(Mercado mercado) {
        System.out.println("\nUnidade: " + mercado.nome);
        
        double totalMacas = mercado.nMacasVendAno * mercado.valorMacas;
        double totalLaranjas = mercado.nLaranjasVendAno * mercado.valorLaranjas;

        System.out.println("Quantidade de Maçãs vendidas por ano: " + mercado.nMacasVendAno +
                           " | Valor unitário: R$ " + mercado.valorMacas +
                           " | Total: R$ " + totalMacas);

        System.out.println("Quantidade de Laranjas vendidas por ano: " + mercado.nLaranjasVendAno +
                           " | Valor unitário: R$ " + mercado.valorLaranjas +
                           " | Total: R$ " + totalLaranjas);
    }
}


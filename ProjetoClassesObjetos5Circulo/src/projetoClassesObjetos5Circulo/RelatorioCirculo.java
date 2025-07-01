package projetoClassesObjetos5Circulo;

public class RelatorioCirculo {

	public static void gerarRelatorio(Circulo circulo) {
		System.out.println("=====RELATÓRIO DO CÍCULO======");
		System.out.printf("Raio: %2f\n", circulo.raio);
		System.out.printf("Área: %2f\n", circulo.calcularArea());
		System.out.println("===============================\n");
	}
}

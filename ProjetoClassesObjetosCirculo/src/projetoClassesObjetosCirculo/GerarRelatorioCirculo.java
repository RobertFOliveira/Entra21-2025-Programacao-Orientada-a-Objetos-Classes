package projetoClassesObjetosCirculo;

public class GerarRelatorioCirculo {


		public static void relatorioCirculo(Circulo circulo) {
			System.out.println("=====RELATÓRIO CIRCULO====");
			System.out.printf("Raio %.2f\n: ", circulo.raio);
			System.out.printf("Área: %.2f\n", circulo.calcularArea());
	//		System.out.printf("Perímetro: %.2f\n", circulo.calcularPerimetro() );
			
			System.out.println("========================\n");
	
	}

}

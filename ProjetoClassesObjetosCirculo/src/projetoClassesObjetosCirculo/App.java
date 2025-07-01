package projetoClassesObjetosCirculo;

public class App {

	public static void main(String[] args) {
	
		Circulo c1 = new Circulo();
		c1.raio = 1;
		System.out.println(c1.calcularArea());
		Circulo c2 = new Circulo();
		c2.raio = 4;
		System.out.println(c2.calcularArea());
		Circulo c3 = new Circulo();
		c3.raio = 61;
		System.out.println(c3.calcularArea());
		Circulo c4 = new Circulo();
		c4.raio = 8;
		System.out.println(c4.calcularArea());
		Circulo c5 = new Circulo();
		c5.raio = 12;
		System.out.println(c5.calcularArea());
		
	//	GerarRelatorioCirculo.relatorioCirculo(c1);
	//	GerarRelatorioCirculo.relatorioCirculo(c2);
	//	GerarRelatorioCirculo.relatorioCirculo(c3);
	//	GerarRelatorioCirculo.relatorioCirculo(c4);
	//	GerarRelatorioCirculo.relatorioCirculo(c5);
	

	}

}

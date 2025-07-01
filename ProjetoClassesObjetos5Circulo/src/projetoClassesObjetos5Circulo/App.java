package projetoClassesObjetos5Circulo;

public class App {

	public static void main(String[] args) {
		// Criando 5 objetos Circulo com raios diferentes
		Circulo c1 = new Circulo(2.0);
		Circulo c2 = new Circulo(3.5);
		Circulo c3 = new Circulo(1.0);
		Circulo c4 = new Circulo(4.25);
		Circulo c5 = new Circulo(5.0);
		
		RelatorioCirculo.gerarRelatorio(c1);
		RelatorioCirculo.gerarRelatorio(c2);
		RelatorioCirculo.gerarRelatorio(c3);
		RelatorioCirculo.gerarRelatorio(c4);
		RelatorioCirculo.gerarRelatorio(c5);
}
}
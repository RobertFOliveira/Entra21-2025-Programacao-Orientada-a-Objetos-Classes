package projetoClassesObjetos7Aeronave;

public class Aeronave {

	String modelo;
	int passageiros;
	int velocidadeMaxima;
	double capacidadeDeCombustivel;
	double queimaCombustivelPorMinuto;
	public Aeronave(String modelo, int passageiros, int velocidadeMaxima, double capacidadeDeCombustivel,
			double queimaCombustivelPorMinuto) {
		super();
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
		this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
	}
	// Tempo no ar
	public double calcularTempoDeVoo() {
		return capacidadeDeCombustivel / queimaCombustivelPorMinuto;
	}
	// Distância máxima
	public double calcularAlcance() {
		return calcularTempoDeVoo() * velocidadeMaxima;
	}

}

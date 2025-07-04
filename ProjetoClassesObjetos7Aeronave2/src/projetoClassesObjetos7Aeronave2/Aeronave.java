package projetoClassesObjetos7Aeronave2;

public class Aeronave {

	private String modelo;
	private int passageiros;
	private int velocidadeMaxima;
	private double capacidadeDeCombustivel;
	private double queimaCombustivelPorMinuto;

	public Aeronave(String modelo, int passageiros, int velocidadeMaxima, double capacidadeDeCombustivel,
			double queimaCombustivelPorMinuto) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velocidadeMaxima = velocidadeMaxima;
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
		this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getCapacidadeDeCombustivel() {
		return capacidadeDeCombustivel;
	}

	public void setCapacidadeDeCombustivel(double capacidadeDeCombustivel) {
		this.capacidadeDeCombustivel = capacidadeDeCombustivel;
	}

	public double getQueimaCombustivelPorMinuto() {
		return queimaCombustivelPorMinuto;
	}

	public void setQueimaCombustivelPorMinuto(double queimaCombustivelPorMinuto) {
		this.queimaCombustivelPorMinuto = queimaCombustivelPorMinuto;
	}

	public double calcularTempoDeVoo() {
		return capacidadeDeCombustivel / queimaCombustivelPorMinuto;
	}

	public double calcularAlcance() {
		return calcularTempoDeVoo() * velocidadeMaxima;
	}
}

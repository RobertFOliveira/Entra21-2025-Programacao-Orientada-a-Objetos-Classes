package projetoClassesGetSetAeronave;

public class Aeronave {

	private String modelo;
	private int passageiros;
	private double velMax;
	private double capCombustivel;
	private double queimaCombustivel;

	public Aeronave(String modelo, int passageiros, double velMax, double capCombustivel,
			double queimaCombustivel) {
		this.modelo = modelo;
		this.passageiros = passageiros;
		this.velMax = velMax;
		this.capCombustivel = capCombustivel;
		this.queimaCombustivel = queimaCombustivel;
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
		if (passageiros < 0) {
			System.out.println("Erro, quantidade de passageiros inválida.");
		} else {
			this.passageiros = passageiros;
		}
		
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		this.velMax = velMax;
	}

	public double getCapCombustivel() {
		return capCombustivel;
	}

	public void setCapCombustivel(double capCombustivel) {
		this.capCombustivel = capCombustivel;
	}

	public double getQueimaCombustivel() {
		return queimaCombustivel;
	}

	public void setQueimaCombustivel(double queimaCombustivel) {
		this.queimaCombustivel = queimaCombustivel;
	}

	// Tempo no ar
	public double calcularAutonomia() {
		return capCombustivel / queimaCombustivel;
	}

	// Distancia maxima
	public double calcularDistanciaMaxima() {
		return calcularAutonomia() * velMax;
	}

	@Override
	public String toString() {
		return "Aeronave [modelo=" + modelo + ", passageiros=" + passageiros + ", velMax=" + velMax
				+ ", capCombustivel=" + capCombustivel + ", queimaCombustivel=" + queimaCombustivel + "]";
	}

}

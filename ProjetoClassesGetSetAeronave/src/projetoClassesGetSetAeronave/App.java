package projetoClassesGetSetAeronave;

public class App {

	public static void main(String[] args) {

		Aeronave a1 = new Aeronave("Boeing", 200, 700, 2000, 50);
		Aeronave a2 = new Aeronave("Cessna", 5, 300, 500, 20);
		Aeronave a3 = new Aeronave("Airbus", 400, 600, 4000, 100);
		Aeronave a4 = new Aeronave("Embraer", 150, 500, 1300, 40);
	
		
		Aeronave vetor[] = { a1, a2, a3, a4 };

		// Qual aeronave leva o maior numero de passageiros
		int maiorPassageiros = 0;
		Aeronave aeronaveMaiorPassageiros = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getPassageiros() > maiorPassageiros) {
				maiorPassageiros = vetor[i].getPassageiros();
				aeronaveMaiorPassageiros = vetor[i];
			}
		}

		System.out.println("A aeronave que mais tem passageiros e: " + aeronaveMaiorPassageiros.getModelo());

		// Qual das aeronaves pode ficar no ar por mais tempo
		double maiorAutonomia = 0;
		Aeronave aeronaveMaiorAutonomia = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularAutonomia() > maiorAutonomia) {
				maiorAutonomia = vetor[i].calcularAutonomia();
				aeronaveMaiorAutonomia = vetor[i];
			}
		}

		System.out.println("A aeronave com maior autonomia e: " + aeronaveMaiorAutonomia.getModelo());

		// Qual deles consegue voar mais longe

		double maiorDistancia = 0;
		Aeronave aeronaveMaiorDistancia = null;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].calcularDistanciaMaxima() > maiorDistancia) {
				maiorDistancia = vetor[i].calcularDistanciaMaxima();
				aeronaveMaiorDistancia = vetor[i];
			}
		}

		System.out.println("A aeronave que voa mais longe e: " + aeronaveMaiorDistancia.getModelo());

	}

}

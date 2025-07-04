package projetoClassesObjetos7Aeronave;

public class App {

	public static void main(String[] args) {
		// Aeronaves com o construtor
		Aeronave jatoA = new Aeronave("Boeing 737", 162, 940, 2600, 2400);
		Aeronave jatoB = new Aeronave("Airbus A320", 140, 841, 2359, 2500);
		Aeronave jatoC = new Aeronave("Boeing 747", 416, 988, 217000, 3600);
		Aeronave jatoD = new Aeronave("Airbus A350", 300, 945, 138000, 5000);

		// Declaração do Vetor
		Aeronave[] aeronaves = { jatoA, jatoB, jatoC, jatoD };

		// a) Qual aeronave leva o maior número de passageiros?

		Aeronave maiorNumeroPassageiros = aeronaves[0];
		for (int i = 1; i < aeronaves.length; i++) {
			if (aeronaves[i].passageiros > maiorNumeroPassageiros.passageiros) {
				maiorNumeroPassageiros = aeronaves[i];
				
			}
		}
		
		// int maiorNumeroPassageiros = 0;
		// Aeronave aeronaveMaiorPassageiros = null;
		// for (int i = 0; i < aeronaves.length; i++) {
		// 	if (aeronaves.passageiros > maiorNumeroPassageiros) {
		// 		maiorNumeroPassageiros = aeronaves.passageiros;
		//		aeronaves = maiorNumeroPassageiros;
	//		}
	//	}

		// b) Qual das aeronaves pode ficar no ar por mais tempo?
		Aeronave maisTempoNoAr = aeronaves[0];
		double tempoMaisLongo = aeronaves[0].capacidadeDeCombustivel / aeronaves[0].queimaCombustivelPorMinuto;

		for (int i = 1; i < aeronaves.length; i++) {
			double tempo = aeronaves[i].capacidadeDeCombustivel / aeronaves[i].queimaCombustivelPorMinuto;
			if (tempo > tempoMaisLongo) {
				tempoMaisLongo = tempo;
				maisTempoNoAr = aeronaves[i];
			}
		}
		
		// c) Considerando que os aviões estão em velocidade máxima, qual deles consegue
		// voar mais longe?
		Aeronave maiorAlcance = aeronaves[0];
		double alcanceMaximo = (aeronaves[0].capacidadeDeCombustivel / aeronaves[0].queimaCombustivelPorMinuto)
				* aeronaves[0].velocidadeMaxima;

		for (int i = 1; i < aeronaves.length; i++) {
			double alcance = (aeronaves[i].capacidadeDeCombustivel / aeronaves[i].queimaCombustivelPorMinuto)
					* aeronaves[i].velocidadeMaxima;
			if (alcance > alcanceMaximo) {
				alcanceMaximo = alcance;
				maiorAlcance = aeronaves[i];
			}

		}
		double maiorAlcance = 0;
		Aeronave aeronaveMaiorAlcance = null;
		for (int i = 0; i < aeronaves.length; i++) {
			if (aeronaves[i].) {
				
			}
		}

		// Impressão dos resultados
		System.out.println("=== RESULTADOS ===");
		System.out.println("a) Aeronave com mais passageiros: " + maiorNumeroPassageiros.modelo + " ("
				+ maiorNumeroPassageiros.passageiros + " passageiros)");
		System.out.printf("b) Aeronave que fica mais tempo no ar: %s (%.2f minutos)%n", maisTempoNoAr.modelo,
				tempoMaisLongo);
		System.out.printf("c) Aeronave com maior alcance: %s (%.2f km)%n", maiorAlcance.modelo, alcanceMaximo);
	}

}

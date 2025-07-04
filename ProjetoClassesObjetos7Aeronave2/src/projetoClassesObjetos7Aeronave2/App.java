package projetoClassesObjetos7Aeronave2;

public class App {

	public static void main(String[] args) {
		// Aeronaves com o construtor
		
        Aeronave[] aeronaves = {
                new Aeronave("Boeing 737", 162, 940, 2600, 2400),
                new Aeronave("Airbus A320", 140, 841, 2359, 2500),
                new Aeronave("Boeing 747", 416, 988, 217000, 3600),
                new Aeronave("Airbus A350", 300, 945, 138000, 5000)
            };

        // a) Aeronave com mais passageiros
        Aeronave maiorPassageiros = aeronaves[0];
        
        for (int i = 1; i < aeronaves.length; i++) {
		if (aeronaves[i].getPassageiros() > maiorPassageiros.getPassageiros()) {
			maiorPassageiros = aeronaves[i];
		}	
		}
        // b) Aeronave com maior tempo no ar
        Aeronave maisTempoNoAr = aeronaves[0];
        double tempoMaisLongo = maisTempoNoAr.calcularTempoDeVoo();
        
        for (int i = 1; i < aeronaves.length; i++) {
			double tempo = aeronaves[i].calcularTempoDeVoo();
			if (tempo > tempoMaisLongo) {
				tempoMaisLongo = tempo;
				maisTempoNoAr = aeronaves[i];
			}
		}
        // c) Aeronave com maior alcance
        Aeronave maiorAlcance = aeronaves[0];
        double alcanceMaximo = maiorAlcance.calcularAlcance();
        
        for (int i = 1; i < aeronaves.length; i++) {
			double alcance = aeronaves[i].calcularAlcance();
			if (alcance > alcanceMaximo) {
				alcanceMaximo = alcance;
				maiorAlcance = aeronaves[i];
			}
        }
     // Impressão dos resultados
        System.out.println("=== RESULTADOS ===");
        System.out.printf("a) Aeronave com mais passageiros: %s (%d passageiros)%n",
                maiorPassageiros.getModelo(), maiorPassageiros.getPassageiros());
        System.out.printf("b) Aeronave que fica mais tempo no ar: %s (%.2f minutos)%n",
                maisTempoNoAr.getModelo(), tempoMaisLongo);
        System.out.printf("c) Aeronave com maior alcance: %s (%.2f km)%n",
                maiorAlcance.getModelo(), alcanceMaximo);
    }
	}
	



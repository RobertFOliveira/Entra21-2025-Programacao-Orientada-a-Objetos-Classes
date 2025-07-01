package projetoClassesObjetos1;

public class ExemploOOB {

	public static void main(String[] args) {
		
		Veiculo v = new Veiculo();
		v.modelo = "Civic";
		v.comprimento = 4.7;
		v.passageiros = 5;
		v.velMax = 200;
		v.cor = "Preto";
		
		System.out.println("A velocidade máxima do " + v.modelo + " é de " + v.velMax);
	}
}

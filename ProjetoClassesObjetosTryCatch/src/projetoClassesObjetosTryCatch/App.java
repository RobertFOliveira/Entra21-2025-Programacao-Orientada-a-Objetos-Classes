package projetoClassesObjetosTryCatch;

public class App {

	public static void main(String[] args) {
	
		double valorTotal = 1000.0;
		double entrada = 100.0;
		int parcelas = 10;
		

		try {
			Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
			System.out.println(f.prestacao());
		}
		catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		


	}

}

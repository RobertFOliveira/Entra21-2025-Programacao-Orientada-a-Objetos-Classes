package projetoClassesObjetos2;

public class ExemploPOB {

	public static void main(String[] args) {
		// 
		Pessoa p1 = new Pessoa();
		p1.nome = "Robert";
		p1.sexo = 'M';
		p1.dataNascimento = "01/04/1969";
		p1.estadoCivil = "Casado";
		p1.idade = 56;
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Ale";
		p2.sexo = 'F';
		p2.dataNascimento = "01/04/1969";
		p2.estadoCivil = "Casado";
		p2.idade = 54;
		
		System.out.println("A primeira pessoa é: " + p1.nome + " do sexo " + p1.sexo + ", tem a idade de " + p1.idade);
		System.out.println("A segunda pessoa é: " + p2.nome + " do sexo " + p2.sexo + ", tem a idade de " + p2.idade);
	}

}

package projetoClassesObjetos6Empregados;

public class Empregados {

	String identificacao;
	String nome;
	String sobrenome;
	double salario;

	// Método para calcular o salário anual
	public double calcularSalarioAnual() {
		return salario * 12;

	}
	public String mostrarNomeCompleto() {
		return nome + " " + sobrenome;
	}
	
	public void modificarSalario(double percentualDeAumento) {
		salario += (salario * (percentualDeAumento/100.0));
	}
	
	// public double calcularAumentoSalario() {
	// 	return salario * 0.10;
	// }

	// public double calcularSalarioComAumento() {
	// 	return salario + calcularAumentoSalario();
	// }
}

package projetoClassesObjetos6Empregados;

import java.text.NumberFormat;
import java.util.Locale;

public class App {

	public static void main(String[] args) {

		Empregados e1 = new Empregados();
		e1.identificacao = "12345";
		e1.nome = "José";
		e1.sobrenome = "Silva";
		e1.salario = 5000.00;

		Empregados e2 = new Empregados();
		e2.identificacao = "456789";
		e2.nome = "João";
		e2.sobrenome = "Portugal";
		e2.salario = 4000.00;

		Empregados e3 = new Empregados();
		e3.identificacao = "123789";
		e3.nome = "Maria";
		e3.sobrenome = "Silva";
		e3.salario = 3000.00;

		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		System.out.println("=====RELATÓRIO EMPREGADOS=====");
		e1.modificarSalario(15);
		System.out.println(formato.format(e1.salario));
		System.out.println(e1.mostrarNomeCompleto());
		System.out.println(formato.format(e1.calcularSalarioAnual()));

		System.out.println("=====RELATÓRIO EMPREGADOS=====");
		e2.modificarSalario(15);
		System.out.println(formato.format(e2.salario));
		System.out.println(e2.mostrarNomeCompleto());
		System.out.println(formato.format(e2.calcularSalarioAnual()));

		System.out.println("=====RELATÓRIO EMPREGADOS=====");
		e3.modificarSalario(15);
		System.out.println(formato.format(e3.salario));
		System.out.println(e3.mostrarNomeCompleto());
		System.out.println(formato.format(e3.calcularSalarioAnual()));

		// GeradorDeRelatorioEmpregados.RelatorioEmpregados(e1);
		// GeradorDeRelatorioEmpregados.RelatorioEmpregados(e2);
		// GeradorDeRelatorioEmpregados.RelatorioEmpregados(e3);

	}

}

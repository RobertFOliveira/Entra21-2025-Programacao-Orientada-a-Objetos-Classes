package projetoClassesObjetos6Empregados;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Locale;

public class GeradorDeRelatorioEmpregados {

	public static void RelatorioEmpregados(Empregados empregados) {
		NumberFormat formato = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		
		
		
		System.out.println("=====RELATÓRIO EMPREGADOS=====");
		
		// System.out.println("Identificação do funcionário: " + empregados.identificacao);
		// System.out.println("Nome: " + empregados.nome + " " + empregados.sobrenome);
		// System.out.println("Salário Mensal: " + formato.format(empregados.salario));
		// System.out.println("Salário Anual: " + formato.format(empregados.calcularSalarioAnual()));
		// System.out.println("Reajuste de 10% do salário: " + formato.format(empregados.calcularAumentoSalario()));
		// System.out.println("Salário Mensal com o aumento de 10%: "
		//		+ formato.format(empregados.calcularSalarioComAumento()) + "\n");


		
	}

}

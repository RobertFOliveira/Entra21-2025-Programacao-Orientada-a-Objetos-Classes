package projetoClassesObjetos8IRPF;

public class Irpf {
	String nome;
	String CPF;
	String UF;
	double rendaAnual;

	public Irpf(String nome, String cPF, String uF, double rendaAnual) {
		super();
		this.nome = nome;
		CPF = cPF;
		UF = uF;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uF) {
		UF = uF;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}

	// calculo imposto de renda

	public double calcularImposto() {

		if (rendaAnual <= 4000) {
			return 0;
		} else if (rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} else if (rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} else if (rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		} else {
			return rendaAnual * 0.30;
		}
	}
	
	
}

package projetoClassesObjetosIRPF;

public class Contribuinte {

	private String nome;
	private String cpf;
	private String uf;
	private double rendaAnual;

	public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
		setNome(nome);;
		setCpf(cpf);;
		setUf(uf);;
		setRendaAnual(rendaAnual);;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			System.out.println("Erro, nome inválido");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (cpf == null || cpf.length() != 11) {
			System.out.println("Erro, CPF inválido");
		} else {
			this.cpf = cpf;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		if (uf == null || uf.isBlank() || uf.length() != 2) {
			System.out.println("Erro, UF inválida");
		} else {
			this.uf = uf;
		}
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		if (rendaAnual < 0) {
			System.out.println("Erro, Renda Anual inválida");
		} else {
			this.rendaAnual = rendaAnual;
		}

	}
	
	public double calcularImpostoDeRenda() {
		return rendaAnual * calcularAliquota();
	}

	private double calcularAliquota() {
		if (rendaAnual <= 4000) {
			return 0;
		} 
		if (rendaAnual <= 9000) {
			return rendaAnual * 0.058;
		} 
		if (rendaAnual <= 25000) {
			return rendaAnual * 0.15;
		} 
		if (rendaAnual <= 35000) {
			return rendaAnual * 0.275;
		}
			return rendaAnual * 0.30;

	}
	
	

	// public double calcularImpostoDeRenda() {
	//	if (rendaAnual <= 4000) {
	//		return 0;
	//	} else if (rendaAnual <= 9000) {
	//		return rendaAnual * 0.058;
	//	} else if (rendaAnual <= 25000) {
	//		return rendaAnual * 0.15;
	//	} else if (rendaAnual <= 35000) {
	//		return rendaAnual * 0.275;
	//	}
	//		return rendaAnual * 0.30;

	
	
	

	@Override
	public String toString() {
		return "Irpf [nome " + nome + ", cpf " + cpf + ", uf " + uf + ", rendaAnual " + rendaAnual + "]";
	}

}

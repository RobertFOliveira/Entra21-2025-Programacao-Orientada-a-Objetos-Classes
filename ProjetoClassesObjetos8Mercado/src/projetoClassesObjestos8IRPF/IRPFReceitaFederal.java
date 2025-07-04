package projetoClassesObjestos8IRPF;

public class IRPFReceitaFederal {

	String nome;
	String CPF;
	String UF;
	double rendaAnual;
	public IRPFReceitaFederal(String nome, String cPF, String uF, double rendaAnual) {
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
	
	
}

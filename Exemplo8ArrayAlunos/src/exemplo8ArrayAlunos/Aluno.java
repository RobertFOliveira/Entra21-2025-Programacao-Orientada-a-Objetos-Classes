package exemplo8ArrayAlunos;

public class Aluno {
	private String nome;
	private int idade;
	private double media;

	public Aluno(String nome, int idade, double media) {

		this.nome = nome;
		this.idade = idade;
		this.media = media;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido");
		}
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Aluno [nome: " + nome + ", idade: " + idade + ", media: " + media + "]";
	}

	
}

package exemplo8ArrayAlunos;

public class App {

	public static void main(String[] args) {
		// 
		Aluno a1 = new Aluno("João", 20, 8.4);
		Aluno a2 = new Aluno("Carlos", 16, 6.2);
		Aluno a3 = new Aluno("Bianca", 32, 10);
		Aluno a4 = new Aluno("Maria", 19, 9.2);
		
		SalaDeAula s1 = new SalaDeAula();
		
		s1.adicionarAluno(a1);
		s1.adicionarAluno(a2);
		s1.adicionarAluno(a3);
		s1.adicionarAluno(a4);
		
		System.out.println(s1.encontarAlunoMaiorMediaForEach());
	}

}

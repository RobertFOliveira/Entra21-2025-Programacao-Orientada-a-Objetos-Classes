package exemplo8ArrayAlunos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalaDeAula {
	
	// Atributos de SalaDeAula
	private List<Aluno> listaAlunos; // Lista de alunos
	
	// Construtor
	
	public SalaDeAula() {
		listaAlunos = new ArrayList<>();
		}
	// Métodos
	
	public Aluno encontrarAlunoMaiorMedia() {
		double maiorMedia = 0;
		Aluno alunoMaiorMedia = null;
		for (int i = 0; i < listaAlunos.size(); i++) {
			if (listaAlunos.get(i).getMedia() > maiorMedia) {
				maiorMedia = listaAlunos.get(i).getMedia();
				alunoMaiorMedia = listaAlunos.get(i);
			}
		}
		return alunoMaiorMedia;
	}
	
	public Aluno encontarAlunoMaiorMediaForEach() {
		double maiorMedia = 0;
		Aluno alunoMaiorMedia = null;
		for (Aluno a : listaAlunos) {
			if (a.getMedia() > maiorMedia) {
				maiorMedia = a.getMedia();
				alunoMaiorMedia = a;
			}
		}
		return alunoMaiorMedia;
	}
	
	// CRUD
	
	// CREATE
	
	public void adicionarAluno(Aluno a) {
		listaAlunos.add(a);
	}
	
	// READ
	
	public List<Aluno> obterAlunos() {
		return listaAlunos;
	}
}

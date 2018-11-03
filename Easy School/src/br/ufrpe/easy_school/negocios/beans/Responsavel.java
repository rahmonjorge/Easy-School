package br.ufrpe.easy_school.negocios.beans;

import java.util.ArrayList;

import br.ufrpe.easy_school.dados.RepositorioAluno;
import br.ufrpe.easy_school.dados.RepositorioResponsavel;

public class Responsavel extends Pessoa {
	
	@SuppressWarnings("unused")
	private RepositorioAluno repositorioAluno;
	@SuppressWarnings("unused")
	private RepositorioResponsavel repositorioResponsavel;
	
	
	public void setRepositorioAluno(RepositorioAluno repositorioAluno) {
		this.repositorioAluno = repositorioAluno;
	}

	public void setRepositorioResponsavel(RepositorioResponsavel repositorioResponsavel) {
		this.repositorioResponsavel = repositorioResponsavel;
	}

	private ArrayList<Aluno> alunos;
	
	public Responsavel(String name, String id, String password) {
		super(name, id, password);
		this.alunos = new ArrayList<Aluno>(1);
	}
	
	public void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
	public void removerAluno(Aluno aluno) {
		this.alunos.remove(aluno);
		
	}
	
	public void imprimirNotaAlunos() {
		for(int i = 0; i < this.alunos.size(); i++) {
			System.out.println(this.alunos.get(i).toString());
		}
	}
	
	public void menuTeste() {
		System.out.println("Responsavel: " + this.getName() + " ................");
		this.imprimirNotaAlunos();
		System.out.println(".......................");
	}
	

}

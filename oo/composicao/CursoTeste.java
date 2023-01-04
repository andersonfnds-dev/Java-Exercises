package oo.composicao;

public class CursoTeste {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("José");
		Aluno aluno3 = new Aluno("Mané");
		
		Curso curso1 = new Curso("Lógica de programação");
		Curso curso2 = new Curso("Banco de dados");
		Curso curso3 = new Curso("Linguagem de programação");
		
		aluno1.adicionarCurso(curso3);
		aluno1.adicionarCurso(curso2);
		aluno1.adicionarCurso(curso1);
		
		aluno2.adicionarCurso(curso1);
		aluno3.adicionarCurso(curso1);
		
		System.out.println("Matriculados no curso de: " + curso1.nome);
		for(Aluno aluno: curso1.alunos) {
			System.out.print(aluno.nome + ", ");
		}
		
		 
		
		
	}

}

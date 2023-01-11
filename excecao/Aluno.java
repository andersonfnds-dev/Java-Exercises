package excecao;

public class Aluno {
	
	final String nome;
	final double nota;
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}
}

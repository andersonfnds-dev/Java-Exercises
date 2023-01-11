package streams;

public class Aluno {
	
	public final String nome;
	public final double nota;
	
	public Aluno(String nome, double nota) {
		super();
		this.nome = nome;
		this.nota = nota;
	}
	
	public String toString() {
		return nome + " tem nota " + nota;
	}
}

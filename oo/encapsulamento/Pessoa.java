package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	
	//Getter (leitor)
	public String getNome() {
		return nome;
	}

	//Setter (modificador)
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome,int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0) {
			this.idade = novaIdade;
		}
	}

}

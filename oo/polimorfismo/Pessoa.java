package oo.polimorfismo;

public class Pessoa {
	
	private double peso;
	private String nome;
	
	public Pessoa(String nome,double peso) {
		setNome(nome);
		setPeso(peso);
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}

}

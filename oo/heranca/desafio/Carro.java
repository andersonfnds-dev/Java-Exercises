package oo.heranca.desafio;

public class Carro {
	
	final int velocidadeMaxima;
	public int velocidadeAtual = 0;
	
	Carro( int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima; 
	}
	
	public void acelerar() {
		if(velocidadeAtual <= (velocidadeMaxima - 5)) {
			velocidadeAtual += 5;
		} else {
			velocidadeAtual += 0;
		}
	}
	
	public void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

}

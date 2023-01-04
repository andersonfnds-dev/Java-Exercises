package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
	
	
	public Ferrari() {
		super(220);
		
	}

	public void acelerar() {
		if(velocidadeAtual + 15 > this.velocidadeMaxima ) {
			velocidadeAtual = velocidadeMaxima;
		} else {
			velocidadeAtual += 15;
		}
	}
	
	@Override
	public void ligarTurbo() {
		acelerar();
	}
	
	@Override
	public void desligarTurbo() {
		// TODO Auto-generated method stub
		
	}

}

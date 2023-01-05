package oo.heranca.desafio;

public class Pista {
	
	public static void main(String[] args) {
		
		Gol gol = new Gol();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Velocidade inicial: " + gol.velocidadeAtual);
		System.out.println("Velocidade inicial: " + ferrari.velocidadeAtual);
		
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		gol.acelerar();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		
		
		
		System.out.println("\nA velocidade atual do gol é de: " + gol.velocidadeAtual + " km/h");
		System.out.println("A velocidade atual da ferrari é de: " + ferrari.velocidadeAtual + " km/h");
	}

}

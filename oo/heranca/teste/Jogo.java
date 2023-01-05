package oo.heranca.teste;

public class Jogo {
	
	public static void main(String[] args) {
	
		Monstro monstro = new Monstro();
		
		Heroi heroi = new Heroi(0,6);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);

		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		 
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		heroi.atacar(monstro);
		
		System.out.println("Heroi tem ==>" + heroi.vida);
		System.out.println("Monstro tem ==>" + monstro.vida);
		
	}

}

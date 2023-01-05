package oo.polimorfismo;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa ("Anderson", 72.5);
		
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.15);
		Sorvete ingrediente3 = new Sorvete(0.3);
		
		System.out.println(p1.getPeso());
		
		p1.comer(ingrediente1);
		p1.comer(ingrediente2);
		
		System.out.println(p1.getPeso());
		
		p1.comer(ingrediente1);
		p1.comer(ingrediente2);
		p1.comer(ingrediente3);
		
		
		System.out.println(p1.getPeso());
		
		
		
		
	}

}

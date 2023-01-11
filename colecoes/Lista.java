package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Anderson");
		
		lista.add(u1);
		lista.add(new Usuario("Gil"));
		lista.add(new Usuario("Ana"));
		lista.add(new Usuario("Bela"));
		lista.add(new Usuario("Manu"));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
		
		//Book b1 = new Book("Crime and Punishment", "Fyodor Dostoevsky", "978657423894" , "Fiction" , 35.50);
	}

}

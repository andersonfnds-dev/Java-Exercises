package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia
		//Add: ocorrerá um erro / Offer: não adicionará o elemento
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//Peek e Element retornam o proximo elemento da fila, sem removê-lo
		//Diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.peek());
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Retorna o proximo elemento da fila removendo ele
	
		System.out.println(fila.poll()); // Retorna null caso esteja vazia
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.remove()); //Lança exceção caso esteja vazia
	}

}

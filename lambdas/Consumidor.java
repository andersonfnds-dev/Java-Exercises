package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer; // A função consumer retorna sempre um void;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 10.50, 0.15);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 2899.9, 0.15);
		Produto p3 = new Produto("Caderno", 19.50, 0.10);
		Produto p4 = new Produto("Borracha", 4.50, 0.05);
		Produto p5 = new Produto("Lapis", 2.50, 0.03);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5);
		
		produtos.forEach(imprimir);
		System.out.println("");
		produtos.forEach(p -> System.out.println(p.preco));
		System.out.println("");
		produtos.forEach(System.out::println); 		//essa lista já retorna no metodo toString() da classe produto
	}

}

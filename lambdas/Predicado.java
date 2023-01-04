package lambdas;

import java.util.function.Predicate; // a funcao de predicado recebe um tipo e retorna um valor booleano;

public class Predicado {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		
		Produto produto = new Produto("Notebook",2850.99, 0.10);
		System.out.println(isCaro.test(produto));
	}

}

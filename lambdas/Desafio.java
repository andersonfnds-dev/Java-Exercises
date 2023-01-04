package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal =
				p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> impostoMunicipal = 
				p -> p >= 2500 ? p * 1.085 : p;
		UnaryOperator<Double> frete = 
				v -> v >= 3000 ? v + 100 : v + 50;
		UnaryOperator<Double> arredondar =
				p -> Math.round(p * 100.0)/ 100.0;
		Function<Double, String> formatar =
				p -> "R$" + p;
				
		Produto p = new Produto("Ipad", 3235.89, 0.13);
		
	
		System.out.println(precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));
		
		
	}

}

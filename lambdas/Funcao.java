package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		Function<String, String> oResultadoE =
				valor -> "O resultado e: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!"; 
				
		String resultadoFinal = parOuImpar
		.andThen(oResultadoE)
		.andThen(empolgado).apply(8);
		//a notação .andThen pode receber outra função
		
		System.out.println(resultadoFinal);
	}

}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::println;
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> operadorBinario = n -> {
		String binario = Integer.toBinaryString(n);
		return binario;
		};
		
		UnaryOperator<String> operadorInvertido = s -> {
			 StringBuilder stringBuildervarible = new StringBuilder();
			 stringBuildervarible.append(s).reverse();
			 return stringBuildervarible + "";
		};
		
		Function<String, Integer> numeroFinal = s -> {
			int resultado = 0;
			//if(s != "1") {
				resultado = Integer.parseInt(s, 2);
			//}
			return resultado;
		};
		
		
		System.out.println("String binaria...");
		nums.stream()
			.map(operadorBinario)
			.forEach(print);
		
		System.out.println("\nString binaria invertida...");
		nums.stream()
		.map(operadorBinario)
		.map(operadorInvertido)
		.forEach(print);
		
		System.out.println("\nNumero Final");
		nums.stream()
		.map(operadorBinario)
		.map(operadorInvertido)
		.map(numeroFinal)
		.forEach(print);
		
		
		
		
		// 1. numero para string binaria
		// 2. inverter a string
		// 3. converter a string novamente para inteiro
	}

}

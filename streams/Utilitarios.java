package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	private Utilitarios() {
		
	}
		
	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();
	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	public static final UnaryOperator<String> grito = n -> n + "!!!";

}

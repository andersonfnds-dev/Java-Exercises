package controle;

public class For2 {
	
	public static void main(String[] args) {
		
		int contador = 0;
				
		for(contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("Contador = %d\n", contador);
		}
		
		//Desafio: não usar valor numérico
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}

}

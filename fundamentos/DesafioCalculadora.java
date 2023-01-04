package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// ler num1
		//ler num2
		// +, -, *, /, %
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite o primeiro numero: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("digite o segundo numero: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("digite o sinal da operacao: ");
		String sinal = entrada.nextLine();
		
		System.out.println(numero1 + sinal + numero2 + " = ");
		

		
	}

}

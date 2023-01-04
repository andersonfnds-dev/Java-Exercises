package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		System.out.print("Brabo");
        System.out.print(" Menor\n\n");
	
        System.out.println("Ai");
        System.out.println("Calica");
	    
        System.out.printf("Foda Gratis: %d %d %n", // %n no printf é quebra de linha
        		6, 9);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine(); //sempre colocar nextLine após um nextInt para não haver erro de leitura do programa
        
        System.out.printf("%s %s tem %d anos",nome,sobrenome,idade);
        
        entrada.close();
     
        
        
        
	
	}
}

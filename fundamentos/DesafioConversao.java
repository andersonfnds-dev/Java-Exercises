package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {
	// usar scanner pra pegar 3 strings, essas 3 strings vao receber 3 salarios e a saída tem que ser a 
	//a string convertida em numero com a media deles
	// usar .replace para que o usuario possa utilizar . ou ,
      public static void main(String[] args) {
    	  
    	  Scanner entrada = new Scanner(System.in);
    	  
    	  System.out.print("Digite o primeiro número:");
    	  String salario1 = entrada.next().replace(",",".");	
    	  
    	  System.out.print("Digite o segundo número:");
    	  String salario2 = entrada.next().replace(",",".");
    	  
    	  System.out.print("Digite o terceiro número:");
    	  String salario3 = entrada.next().replace(",",".");	
  		  
    	  double valor1 = Double.parseDouble(salario1);
    	  double valor2 = Double.parseDouble(salario2);
    	  double valor3 = Double.parseDouble(salario3);
    	  
    	  double media = (valor1 + valor2 + valor3) / 3;
    	  
    	  System.out.println("A media dos valores e:"+media);
   
    	  entrada.close();
}
   
}
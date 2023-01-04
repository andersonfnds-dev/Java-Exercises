 package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
        
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.toLowerCase().startsWith("boa")); // passa para letra minúscula a string, fazendo com que a proposição boolean seja verdadeira
		System.out.println(s.toUpperCase().endsWith("TARDE")); 
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde")); 
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Livia";
		var sobrenome = "Ribeiro";
		
		System.out.printf("Nome: %s\nSobrenome: %s\n\n", nome,sobrenome);
		
		String frase = String.format("Nome: %s\nSobrenome: %s", nome,sobrenome);
		System.out.println(frase);
		
		System.out.println(frase.toLowerCase().contains("nome"));
		System.out.println(frase.indexOf(nome)); //dá a localização do parâmetro na string
	
	
	}
}

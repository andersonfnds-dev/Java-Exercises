package operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		//Trabalho na terça (v ou f)
		//Trabalho na quinta (v ou f)
		// se os dois derem certo, televisao de 50 polegadas, se so um der certo uma tv de 32
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean ComprouTV50 = trabalho1 && trabalho2;
		boolean ComprouTV30 = trabalho1 ^ trabalho2;
		boolean sorvete =  trabalho1 || trabalho2;
		boolean maisSaudavel = !sorvete;
		
		System.out.println("Comprou tv de 50\"? "+ComprouTV50);
		System.out.println("Comprou tv de 30\"? "+ComprouTV30);
		System.out.println("Familia ganhou sorvete? "+sorvete);
		System.out.println("Mais saudavel? "+maisSaudavel);
		
		
	}

}

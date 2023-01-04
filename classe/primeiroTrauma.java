package classe;

public class primeiroTrauma {
	
	static int a = 3; //variável fora do método
	static int b = 4;
	
	public static void main(String[] args) {
		
		primeiroTrauma a1 = new primeiroTrauma(a);
		
		System.out.println(a1);
		
//para acessar a variável se cria um construtor da classe
//e se coloca a variável a ser acessada como atributo da
//classe criada
		
		
		
//ou então transforme em static a variável desejada
		
	
			
		
	}
	primeiroTrauma(int num){
		num += a;
		}
}

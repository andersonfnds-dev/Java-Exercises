package operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		int a = (int)Math.pow(6 * (3+2),2);
		int b = 3*2;
		
		int c = (1 - 5) * (2 - 7);
		int d = 2;
		
		
		int divisaoa = a / b;
		int divisaob = (int)Math.pow(c/d, 2);

		int divisaofinal = (int)Math.pow(divisaoa - divisaob, 3) / (int)Math.pow(10, 3);
		
		System.out.println(divisaofinal);
				
	}

}

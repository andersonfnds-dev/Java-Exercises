package excecao;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println(7 / scanner.nextInt());
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			System.out.println("Finally...");  				// finally aparece independente do erro
			scanner.close(); 								// ter sido tratado ou nao

		}
		
		System.out.println("Fim");
	}

}

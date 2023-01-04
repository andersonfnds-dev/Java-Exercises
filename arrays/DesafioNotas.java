package arrays;

import java.util.Scanner;

public class DesafioNotas {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantas notas voce quer informar?");
		int totalNotas = scanner.nextInt();
		
		double notas [] = new double [totalNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite a nota " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A media é igual a: " + (total / notas.length));
		
		scanner.close();
	}
}


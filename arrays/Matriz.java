package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int qtdeAlunos = scanner.nextInt();
		
		System.out.println("Quantos notas por aluno");
		int qtdeNotas = scanner.nextInt();
		
		double [][] notasDaTurma = new double [qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				
				System.out.printf("%nInforme a nota %d do aluno %d: ", (j + 1), (i + 1));
				notasDaTurma[i][j] = scanner.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		
		System.out.println("%nA media total é igual a: " + media);
		
		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		scanner.close();
	}

}

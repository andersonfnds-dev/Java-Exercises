package arrays;

import java.util.Arrays;

public class Exercicio2 {
	
public static void main(String[] args) {
		

		double[] notasAlunoA = new double[3]; // array com parâmetro
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8.5;
		notasAlunoA[2] = 6;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		for(double notas : notasAlunoA) {
		System.out.println(notas);	
			
		}
		
		System.out.println();
		
		double[] notasAlunoB = {6.8, 5.5, 7.1};  //array com datas literais
		
		for(double nota : notasAlunoB) {
			System.out.println(nota);
		}
		
	}

}

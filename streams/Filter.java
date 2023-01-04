package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Leo", 8.1);
		Aluno a3 = new Aluno("Ana", 7.2);
		Aluno a4 = new Aluno("Ana", 5.8);
		Aluno a5 = new Aluno("Ana", 6.4);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);
		
		Predicate<Aluno> aprovados = a -> a.nota >= 7; 
		Function<Aluno, String> saudacao = a -> "Parabens " + a.nome + "! Voce foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovados)
			.map(saudacao)
			.forEach(System.out::println);
			
	}

}

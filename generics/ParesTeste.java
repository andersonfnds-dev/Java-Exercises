package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Paulo");
		resultadoConcurso.adicionar(3, "Andre");
		resultadoConcurso.adicionar(4, "Pedro");
		resultadoConcurso.adicionar(2, "Paula");
		
		System.out.println(resultadoConcurso.getValor(2));
	}

}

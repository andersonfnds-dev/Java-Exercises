package excecao.personalizadaA;

public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			
			Validar.aluno(null);
		} catch (StringVaziaException2 e) {
			System.out.println(e.getMessage());
		} catch (NumeroForaIntervaloException           // pode-se usar o operador '|' quando
				| IllegalArgumentException e) {			// se quiser tratar excecoes de uma 
			System.out.println(e.getMessage());			// mesma maneira
		}
								
		
		
		
		System.out.println("Fim");
	}

}

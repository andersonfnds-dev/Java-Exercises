package excecao;

public class Causa { 
	
	public static void main(String[] args) {
		
		metodoA(null);
		
		}
	
	static void metodoA (Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("Aluno esta nulo");
		}
		
		System.out.println(aluno.nome);
	}

}

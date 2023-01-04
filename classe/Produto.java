package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeA, double precoA) {
		nome = nomeA;
		preco = precoA;
	}
	
	
	double descontoPadrao() {
		return preco * (1 - desconto);
	}
	
	double descontoEspecial(double descontoDoDia) {
		return preco * (1 - descontoDoDia );
	}

}

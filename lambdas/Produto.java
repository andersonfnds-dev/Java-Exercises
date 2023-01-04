package lambdas;

public class Produto {

	final String nome ;
	double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		return nome + " tem um preco de R$" + preco;
	}
}

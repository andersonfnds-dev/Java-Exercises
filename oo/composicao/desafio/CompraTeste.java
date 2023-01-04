package oo.composicao.desafio;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Anderson Gabriel Fernandes");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta",9.50, 50);
		compra1.adicionarItem("Notebook", 2500, 2);

		Compra compra2 = new Compra();
		compra2.adicionarItem(new Produto("Borracha", 4.60), 30);
		compra2.adicionarItem("Monitor", 1350, 4);
		
		c1.compras.add(compra1);
		c1.compras.add(compra2);
	
		System.out.println("\nValor total das compras: " + (compra1.valorTotal() + compra2.valorTotal()) );
	}

}

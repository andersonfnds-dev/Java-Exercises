package oo.composicao;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Joao Pedro";
		
		c1.adicionarItem(new Item("Caneta", 5, 2.50));
		c1.adicionarItem(new Item("Borracha", 2, 1.50));
		c1.adicionarItem(new Item("Caderno", 3, 12.50));
		c1.adicionarItem(new Item("Mochila", 1, 80.0));
		
		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());
		
		System.out.println(c1.itens.get(0).compra.itens.get(1).compra.itens.get(2)
				.compra.valorTotal());
	}

}

package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

	void adicionarItem(String nome,double preco, int qtde) {
		var p = new Produto(nome, preco);
		this.itens.add(new Item(p, qtde));
	}

	double valorTotal() {
		double total = 0;
		
		for(Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		return total;
	}
}

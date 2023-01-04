package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
	    Produto p1 = new Produto("Notebook", 4356);
	    Produto p2 = new Produto("Air Frier", 200);
	    
	    double totalCarrinho = p1.descontoPadrao() + p2.descontoPadrao();
		
		System.out.println(totalCarrinho);
		
		
		Produto p3 = new Produto("Geladeira", 1300);
		Produto.desconto = 0.35;
		
		System.out.println(p3.descontoEspecial(0.35));
		
		
		
	}
	

}

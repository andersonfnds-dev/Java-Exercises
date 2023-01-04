package colecoes;

import java.util.HashSet;
import java.util.Set;

public class conjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add('x');
		conjunto.add(1);
		
		System.out.println("Tamanho : " + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("Tamanho : " + conjunto.size());
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //Uniao entre conjuntos
		conjunto.retainAll(nums); // Intersecção
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}

}

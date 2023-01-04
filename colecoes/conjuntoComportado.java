package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class conjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> listaAprovados = new HashSet<>(); //Set normal
		SortedSet<String> listaAprovados = new TreeSet<>(); //Set ordenado
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Lucas");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); 
		nums.add(1);
		nums.add(6);
		nums.add(9);
		
		for (int n: nums) {
			System.out.println(n);
		}
	}

}

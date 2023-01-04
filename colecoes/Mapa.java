package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Pedro");
		usuarios.put(4, "Vitoria");

		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet()); // retorna a chave de cada objeto da coleção
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet()); // retorna a chave e seu valor
		
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Rebeca"));
		
		System.out.println(usuarios.get(4));// pesquisa através da chave!
		System.out.println(usuarios.remove(2));
		System.out.println(usuarios.remove(3, "Pedro"));
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String usuario: usuarios.values()) {
			System.out.println(usuario);
		}
		
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.print(usuario.getKey() + " ===> ");
			System.out.println(usuario.getValue());
		}
	}

}

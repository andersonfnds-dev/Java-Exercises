package classe_desafio;

//objetivo: Criar pessoa, instanciar pessoa, instanciar duas comidas
//instancia aqui as comidas e a pessoa
//Pessoa p.comer(arroz, feijao, etc)
//incrementa o peso ganho ao comer e mostra o antes e depois.
public class Jantar {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Guilheme",72);
		
		Comida d1 = new Comida("arroz",0.25);
		Comida d2 = new Comida("feijão",0.15);
		Comida d3= new Comida("bife de alcatra",0.3);
		Comida d4 = new Comida("batata frita",0.1);
		
		System.out.println("O peso inicial de " + p1.nome + " era de: "+ p1.peso + " kg");
		
		p1.comer(d1);
		p1.comer(d4);
		
		System.out.println("O peso de " + p1.nome + " após o jantar é de: "+ p1.peso + " kg");
		
		
		
		
	
	}
	
}
		
		


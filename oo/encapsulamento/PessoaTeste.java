package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro",30); // definir idade junto com o construtor
		//p1.setIdade(-32); // alterar
		
		System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos"); // ler
	}

}

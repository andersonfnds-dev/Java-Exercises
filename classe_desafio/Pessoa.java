package classe_desafio;

//Classe precisa ter o nome, peso.
//precisa ter um método chamado: Comer. Esse método vai receber como parâmetro 
//o objeto peso da classe comida. O paramêtro deve ser feito 
//diretamente da classe Pessoa. 
//O peso da pessoa vai aumentando de acordo com o que ela come
public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome; this.peso = peso;
	}

	double comer( Comida comida){
		if (comida != null) {
			this.peso += comida.peso;
		}
		return this.peso;
	}
}
	


package excecao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException2 extends RuntimeException{
	
	private String nomeDoAtributo;
	
	public StringVaziaException2 (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo '%s' está vazio",nomeDoAtributo);
	}
	
}

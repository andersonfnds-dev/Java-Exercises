package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException2 extends Exception{
	
	private String nomeDoAtributo;
	
	public StringVaziaException2 (String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	public String getMessage() {
		return String.format("O atributo '%s' está vazio",nomeDoAtributo);
	}
	
}

package controle;

public class SwitchSemBreak {
	
	public static void main(String[] args) {
		
		String faixa = "preta";

// como o programa a seguir necessita do acúmulo 
// das habilidades, não é necessário utilizar o 
// comando "break";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "verde":
			System.out.println("sei blabla");
		case "laranja":
			System.out.println("sei bleble");
		case "amarela":
			System.out.println("sei blueble");
        }
		
		System.out.println("Fim!");
	}

}

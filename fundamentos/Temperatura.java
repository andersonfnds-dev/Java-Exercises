package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (°F - 32) x 5.0/9.0 = °C 
		
		double f = 86;
		final int ajuste = 32;
		final double fator = 5.0 / 9;
		double c = (f - ajuste) * fator;
		
		System.out.println(f + "°F é igual a " + c + "°C");
	
		
	}

}

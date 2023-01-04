package classe;

public class AreaCirc {
	
	double raio;
	static final double pi = 3.14;
	
	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return pi * Math.pow(raio, 2) ;
	}

}
 
package lambdas;

@FunctionalInterface 	// uma interface funcional nao permite mais de um metodo; 

public interface Calculo {
	
	double executar(double a, double b);
	
	default String legal() {   //a não ser que o metodo não seja public ou abstract;
		return "legal";
	}
}

package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Cabelo c1 = new Cabelo("Castanho Claro","Brasileiro",60);
		Cabelo c2 = new Cabelo("Castanho Escuro","Brasileiro",70);
		Cabelo c3 = new Cabelo("Castanho Claro","do Sul",65);
		Cabelo c4 = new Cabelo("Castanho Escuro","do Sul",55);
		Cabelo c5 = new Cabelo("Loiro","Brasileiro",50);
		Cabelo c6 = new Cabelo("Loiro","do Sul",65);
		
		List<Cabelo> cabelos = Arrays.asList(c1,c2,c3,c4,c5,c6);
		
		Predicate<Cabelo> castanhos = c -> c.cor.contains("Castanho");
		Predicate<Cabelo> maisDe60 = c -> c.tamanho > 60;
		Function<Cabelo, String> caracteristicas = 
				c ->  c.cor + "\n" + c.origem + 
				"\n" + c.tamanho + "Cm\n";
				
		System.out.println("Cabelos disponíveis: \n");
		cabelos.stream()
			.filter(castanhos)
			.filter(maisDe60)
			.map(caracteristicas)
			.forEach(System.out::println);
		
		
		
	}

}

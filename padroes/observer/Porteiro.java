package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	private List<ChegadaAniversarianteObserver> observadores= new ArrayList<>();
	
	public void registrarObservador(ChegadaAniversarianteObserver observador) {
		observadores.add(observador);
	}
	
	public void monitorar() {
		Scanner scanner = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
			System.out.println("Aniversariante chegou?");
			valor = scanner.nextLine();
			
			if("sim".equalsIgnoreCase(valor) ) {
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());
				
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
				
			} else {
				System.out.println("Alarme falso");
			}
		}
		scanner.close();
	}
		
}

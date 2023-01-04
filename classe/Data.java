package classe;

public class Data {
	
	int dia;
	long mes;
	int ano;
	
	Data (int dia,long mes,int ano){ 
		this.ano = dia; this.mes = mes; this.ano = ano;
	}
	
	Data(){
		this(1,1,1970);
	}
	
	
	String dataFormatada() {
		if (mes < 10 && dia < 10) {
			return 0 + dia + "/" + 0 + mes + "/" + ano;
		} else if (dia < 10) {
			return 0 + dia + "/" + mes + "/" + ano; 
		} else if (mes < 10) {
			return dia + "/" + 0 + mes + "/" + ano;	
		} else {
			return dia + "/" + mes + "/" + ano;
		}
	}

	}
	
	



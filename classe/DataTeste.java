package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(16,4,2003);
		Data d2 = new Data(25,8,2000);
		Data d3 = new Data();
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
		System.out.println(d3.dataFormatada());
	}

}

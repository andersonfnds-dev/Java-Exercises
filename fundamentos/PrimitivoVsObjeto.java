package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		String s = new String("marilia");
		s.toUpperCase();
		System.out.println(s);
		
		// Wrappers (versão objeto dos tipos primitivos)
		int a = 123;
		System.out.println(a);
	}
}

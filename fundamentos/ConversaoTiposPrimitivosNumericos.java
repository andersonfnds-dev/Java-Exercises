package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.123458888888888887; //explicita (cast)
		System.out.println(b); 
		
		int c = 128;
		byte d = (byte) c; // explicita (cast)
		System.out.println(d);
	}
}

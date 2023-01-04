package classe;

public class EqualsHashCode {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Anderson Gabriel";
		u1.email = "andinhodfbra@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Anderson Gabriel";
		u2.email = "andinhodfbra@gmail.com";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
	}
	

}

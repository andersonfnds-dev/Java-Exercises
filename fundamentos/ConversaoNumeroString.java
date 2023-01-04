package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		
		Integer obj = 25;     
		//It will return a string value    
		String strval1 =obj.toString();
                System.out.println(strval1.getClass());
		System.out.println("String Representation = " + strval1);	
		
		Integer obj2 = -18;		     
		//It will return a string value
		String strval2 = obj2.toString();
		System.out.println("String Representation = " + strval2); 
		
		int num3 = 20;
		System.out.println(Integer.toString(num3).getClass());
           
	}
}


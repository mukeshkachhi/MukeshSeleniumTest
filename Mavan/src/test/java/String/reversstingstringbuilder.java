package String;

public class reversstingstringbuilder {

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		
		String reverse = new StringBuilder(s1).reverse().toString();
		
		System.out.println(reverse);
		
		s1.toUpperCase();
		System.out.println(s1);
				
	}

}

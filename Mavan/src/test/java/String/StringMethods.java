package String;

public class StringMethods {

	public static void main(String[] args) 
	{
	String name = "Mukesh";
	
	//String Internal Method for Character at index value
	System.out.println(name.charAt(3));
	
	System.out.println(name.length());
	
	String name2 = name.replace('M', 'm');
	System.out.println(name2);
	
	System.out.println(name.substring(2));

	}

}

package basicOfJava;

public class method {
	
	public static void main(String[] args) {
		
		method obj = new method();
		
		obj.addTwoNumber();
		
		boolean value = obj.ageForVoting();
		System.out.println(value);
		
		String ref = obj.convertToNumber();
		System.out.println(ref);
	
		obj.methodAddTwoNumbers();
		obj.methodAddThreeNumbers();
		
		addFourNumbers();
				
	}
	
	void  addTwoNumber()
	{
	
		int a = 10, b= 20, c;
		c= a+b;
		System.out.println("Addition of Two Number = " + c);		
	}
	
	boolean  ageForVoting()
	{
		int age =18;
		if (age>19)
		{
			System.out.println("Eligible for voting");
		}
		
		else
		{
			System.out.println("not Eligible for Voting");
		}
		return true; 
		
	}
	
	String convertToNumber()
	{
			return "I am New to Java Coding";
	}
	
	void methodAddTwoNumbers()
	{
		int a =10, b=20;
		a = a+b;
		System.out.println("Additon of Two Numbers "+ a);
	}
	
	
	void methodAddThreeNumbers()
	{
		int a =10, b=20, c=30;
		a = a+b+c;
		System.out.println("Additon of Three Numbers "+ a);
	}
	
	static void addFourNumbers()
	{
		
		int a= 10, b=100,c=100, d=10;
		d = a+b+c+d;
		System.out.println(d);
		
	}
}


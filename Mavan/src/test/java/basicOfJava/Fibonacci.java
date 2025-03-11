package basicOfJava;

public class Fibonacci {
	
	static void fibonacci (int N)
	{
		int num1 = 10, num2=20;
		int num3;
		
		for (int i =0; i<N ; i++)
		{
			System.out.println(num1);
			
			num3=num2+num1;
			num1=num2;
			num2=num3;
		}
		
	}
	
	public static void main(String[] args) {
		int N=5;
		
		fibonacci(N);
	}

}

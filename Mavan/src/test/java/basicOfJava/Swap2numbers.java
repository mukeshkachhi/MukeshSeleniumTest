package basicOfJava;

public class Swap2numbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		 
		System.out.println("Before Swapping " + a + b);
		
		//logic with 2 numbers
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping " + a + b);

	}

}

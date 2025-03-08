package JavaDay1;

public class addNumbers {

	public static void main(String[] args) {
		
		int a = 15;
		int sum;

		for (sum=0; a!=0; a/=10)
		{
			sum+=a%10;
			System.out.println("The sum of input number " + sum);
		}

	}

}

/*
 * Questions : Why I am getting two print statements ? with 5 and 6
 */	

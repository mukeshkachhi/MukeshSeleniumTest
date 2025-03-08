package JavaDay1;

public class addFloatNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a = 34.42f;
		
		int sum; // with float data type sum value is not 7 why ?
		
		for (sum =0; a!=0; a/=10)
		{
			sum+=a%10; //-- sum = sum+a;/10 is it possible ?
			System.out.println(sum);
		}
		
	}

}

/*
 * Logic - can we diveide the float in two parts and calculate value and store
 * in different variables. 
 * Concat the values in print
 */

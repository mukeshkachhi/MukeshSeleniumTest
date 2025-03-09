package ExceptionHandaling;

import org.apache.commons.io.filefilter.AgeFileFilter;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		getage(13);
	}

	static void getage (int age) throws IllegalArgumentException
	
	{
		if (age > 18)
		{
			throw new IllegalArgumentException ("I am Eligible for Voting");
		}
		
		else
		{
			throw new IllegalArgumentException("I am not Eligible for Voting");
		}
	}
	
	
	
	
}

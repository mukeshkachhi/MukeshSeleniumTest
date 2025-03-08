package String;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) 
	
	{
		String s1 = "CARE";
		String s2 = "RACE";
		
		s1.toLowerCase();
		s2.toLowerCase();
		
		char [] c1 = s1.toCharArray();
		char [] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
	boolean b1 = Arrays.equals(c1, c2);
	
	if (b1 == true)
	{
		System.out.println("This is the anagram " + s1);
	}
	else 
	{
		System.out.println("This is not anagram " + s2);
	}
		
	}
		
	}

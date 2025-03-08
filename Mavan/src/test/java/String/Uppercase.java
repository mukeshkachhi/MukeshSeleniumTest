package String;

import java.util.Scanner;

public class Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter your name: "); String name = input.nextLine();
		 

			    String capital1 = name.substring(0).toUpperCase();
			    //String capital2 = name.substring(5).toUpperCase();
			    //System.out.println(capital1+capital2);
			    
			    System.out.println(capital1);
			    
			    
	}

}

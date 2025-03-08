package String;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		int[] marks = {97,28,35, 100, 300};
		
		System.out.println(marks[4]);
		
		//Arrays.sort(marks);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your age ");
		int age = sc.nextInt();
		
		System.out.println(age);
		
		System.out.println("What is you name");
		String name = sc.nextLine();
		System.out.println(name);

	}
}
package ArrayList;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		
		LinkedList <Integer> IL = new LinkedList<>();
		IL.add(10);
		IL.add(100);
		
		System.out.println(IL.indexOf(0));
		System.out.println(IL.indexOf(100));
		System.out.println(IL.isEmpty());
		System.out.println(IL.offerFirst(10));
		System.out.println(IL.offerLast(100));
		System.out.println(IL.remove(0));
		System.out.println(IL.size());
		System.out.println(IL.remove(2));
		
		
		
		
		
		

	}

}

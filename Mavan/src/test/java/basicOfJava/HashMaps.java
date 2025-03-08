package basicOfJava;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {

	public static void main(String[] args) 
	
	{
		HashMap<String, Integer> maps1 = new HashMap<String, Integer>();
		
		maps1.put("A", 1);
		maps1.put("B", 2);
		maps1.put("C", 3);
		
HashMap<String, Integer> maps2 = new HashMap<String, Integer>();
		
		maps2.put("A", 1);
		maps2.put("B", 1);
		maps2.put("C", 3);
		
		System.out.println(maps1.equals(maps2));
		System.out.println(maps1.keySet().equals(maps2.keySet()));
	
		System.out.println(new ArrayList<>(maps1.values()).equals(new ArrayList<>(maps2.values())));
		
	
	}
	
}

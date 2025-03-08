package ArrayList;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {

		ArrayList <String> aL = new ArrayList<>();
		aL.add("Monday");
		aL.add("Tuesday");
		aL.add("Wednesday");
		aL.add("Thruday");
		aL.add("Friday");
		
	System.out.println(aL.equals("Monday"));
	System.out.println(aL.contains("Monday"));
	System.out.println(aL.get(3));
	System.out.println(aL.isEmpty());
	System.out.println(aL.size());
	System.out.println(aL.indexOf("Friday"));
	System.out.println(aL.remove(0));
	System.out.println(aL.size());
	System.out.println(aL.removeAll(aL));
	
	
	
		
		

	}

}

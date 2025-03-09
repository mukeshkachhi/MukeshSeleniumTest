package basicOfJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datefunction {

	public static void main(String[] args) {
		
		Date dt = new Date();
		
		System.out.println("The Current Data and Time is " + dt);
		
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY" + " " + "HH:mm:ss");
		
		String time = format.format(dt);
		
		System.out.println("The Current Converted Format time is " + time);
		
		
		
	
	}

}

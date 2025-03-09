package basicOfJava;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		File myFileDemo = new File("Readme.txt"); 
		
		System.out.println(myFileDemo.createNewFile());
		System.out.println(myFileDemo.canWrite());
		myFileDemo.createNewFile();
	

	}

	

}

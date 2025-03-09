package ExceptionHandaling;

public class expthandle {

	public static void main(String[] args) {
		
		int a=100;
		int b=0;
		
		try {
			int ans = a/b;
			System.out.println("Answere " + ans);
			}
		
		catch (ArithmeticException e) {
			e.printStackTrace();
			 System.out.println(e.getMessage());
			}
			
     finally {
    	 System.out.println("I am Finally execute");
     }
			
		
		
	}

}

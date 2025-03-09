package ExceptionHandaling;

public class Checked {

	public static void main(String[] args) {
		
		try {
			
			int [] b = {1,2,4,8,9};
				int a = 1/0;
				
		}
			catch (ArithmeticException e)
			{
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
		catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	

}
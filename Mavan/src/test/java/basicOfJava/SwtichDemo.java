package basicOfJava;

public class SwtichDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Learning Java Programming Logic";
		
		int countvowel= 0;
		
		char[] vowels = str.toCharArray();
		
		for (int i=0; i<vowels.length; i++)
		{
			switch (vowels[i])
			
			{
			
			case 'A': countvowel++;
			break;
			
			case 'a': countvowel++;
			break;
			
			case 'E': countvowel++;
			break;
			
			case 'e': countvowel++;
			break;
			
			case 'I': countvowel++;
			break;
			
			case 'i': countvowel++;
			break;
			
			case 'O': countvowel++;
			break;
			
			case 'o': countvowel++;
			break;
			
			case 'U': countvowel++;
			break;
			
			case 'u': countvowel++;
			break;
			}
		}
		
		
		System.out.println("The Count of Vowels is  "+ countvowel);
	}
	
	

}

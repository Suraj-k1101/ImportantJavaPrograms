package numberRelatedPrograms;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		
		int no = 1234;
		
		int temp = no;
		int rem;
		int rev = 0;
		
		while(temp>0)
		{
			
			rem = temp%10;
			temp = temp/10;
			rev = rev*10 + rem;
			
			
		}
		
		System.out.println("Reverse number = " + rev);
			
		

	}

}

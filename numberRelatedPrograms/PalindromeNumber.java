package numberRelatedPrograms;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		
		int no = 2112;
		int temp = no;   //for keeping "no" safe and to perform the operation on number thats why we stored number in the temp variable
		
		int rev = 0;
		int rem;
		
		while(temp>0)
		{
			
			rem = temp%10;   //for getting remainder of the number
			temp = temp/10;   //for getting the the new number after divide by 10
			rev = rev*10 + rem;
				
		}
		
		if(no==rev)
		{
			
			System.out.println("Nmuber is Palindrome");
			
		}
		else
		{
			
			System.out.println("Number is Not a Palindrome");
			
		}
		

	}

}

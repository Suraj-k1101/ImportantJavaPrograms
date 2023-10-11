package importantStringPrograms;

public class PalindromeString {

	public static void main(String[] args) 
	{
		
		String s = "MARKRAM";
		
		String rev = "";        //we have to take empty string to perform operation
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev = rev + s.charAt(i);      // this logic will provide us the reverse string
			
		}
		
		if(s.equals(rev))
		{
			
			System.out.println("String is Palindrome ");
			
		}
		else
		{
			
			System.out.println("String is Not a Palindrome");
			
		}
	

	}

}

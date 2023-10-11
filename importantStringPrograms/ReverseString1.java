package importantStringPrograms;

public class ReverseString1 {

	public static void main(String[] args)
	{
		
		String s = "AUTOMATION";
		
		String rev = "";   //we have to take empty string to perform operation
		
		for(int i= s.length()-1;i>=0;i--)
		{
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println("Reverse String is =" +rev);  //output = NOITAMOTUA

	}

}

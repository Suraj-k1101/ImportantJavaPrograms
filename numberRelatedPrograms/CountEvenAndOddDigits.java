package numberRelatedPrograms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
		
		int num = 12345678;
		int evencount = 0;
		int oddcount = 0;
		
		while(num>0)
		{
			
			int rem = num%10;
			num = num/10;
			
			if(rem%2==0)
			{
				
				evencount++;
				
			}
			else
			{
				
				oddcount++;
				
			}
			
			
		}
		
		System.out.println("Number of Even Numbers = " +evencount);
		

		System.out.println("Number of Odd Numbers = " +oddcount);

	}

}

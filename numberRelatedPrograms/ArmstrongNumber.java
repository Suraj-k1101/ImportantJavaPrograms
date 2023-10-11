package numberRelatedPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int no = 153;
		int temp = no;
		int result = 0;
		int rem;
		
		while(no>0)
		{
			
			rem = no%10;
			no = no/10;
			result = result + (rem * rem * rem);
			
		}
		
		if(result==temp)
		{
			
			System.out.println(temp + " is a Armstrong Number");
			
		}
		else
		{
			
			System.out.println(temp + " is Not a Armstrong Number");
			
		}

	}

}

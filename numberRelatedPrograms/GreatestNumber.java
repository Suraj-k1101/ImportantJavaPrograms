package numberRelatedPrograms;

public class GreatestNumber {

	public static void main(String[] args) {
		int a = 10;
		int b = 11;
		int c = 12;
		
		if(a>b && a>c)
		{
			
			System.out.println("a is greater number  = " +a);
			
		}
		else if(b>a && b>c)
		{
			
			System.out.println("b is greater number  = " +b);
			
		}
		else if(c>a && c>b)
		{
			
			System.out.println("c is greater number  = " +c);
			
		}
		else
		{
			
			System.out.println("cannot validate");
			
		}

	}

}

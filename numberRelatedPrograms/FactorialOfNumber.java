package numberRelatedPrograms;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		
		int num = 7;
		int facto =1;
		
		for(int i=1;i<=num;i++)
		{
			
			facto = facto * i;
			
		}
		
		System.out.println("factorial of " +num+  " = " +facto);

	}

}

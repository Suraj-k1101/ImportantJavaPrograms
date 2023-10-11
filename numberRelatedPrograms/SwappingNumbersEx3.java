package numberRelatedPrograms;

public class SwappingNumbersEx3 {

	public static void main(String[] args) {
		//Swapping numbers without using arithmetic operations
		
		int a = 10;
		int b = 20;
		
		 a = a ^ b;  
		 
		 b = a ^ b; 
		 
		 a = a ^ b;  
		 
		 System.out.println("a = " +a);
		 System.out.println("b = " +b);

	}

}

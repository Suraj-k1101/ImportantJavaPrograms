package numberRelatedPrograms;

public class SwappingNumbersEx2 {

	public static void main(String[] args) {
		//without using third variable :-
		
		int a = 10;
		int b = 20;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);

	}

}

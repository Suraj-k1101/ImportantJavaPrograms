package characterPrograms;

public class CharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		
		char x = '$';
		
		if((x >= 'a' && x<='z') || (x >= 'A' && x <= 'Z' ) )
		{
			
			System.out.println(x + " is Alpahbet");
			
		}
		else
		{
			
			System.out.println(x + "  is not Alpahbet");
			
		}

	}

}

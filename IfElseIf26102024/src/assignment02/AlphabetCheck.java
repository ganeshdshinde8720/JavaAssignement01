package assignment02;

public class AlphabetCheck {

	public static void main(String[] args) {
		char ch = 'A';
		
		if( (ch>='a'&& ch<='z') || (ch>='A' && ch<='Z')) {
			System.out.println("It is Alphabet");
		}
		else  {
			System.out.println("Not an Alphabet");
		}

	}

}

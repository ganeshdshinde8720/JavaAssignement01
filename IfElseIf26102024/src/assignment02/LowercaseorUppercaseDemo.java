package assignment02;

public class LowercaseorUppercaseDemo {

	public static void main(String[] args) {
		
		char ch = 'F';
		
		if (ch>='A' && ch<='Z')  {
			System.out.println("it is uppercase");
		}
		else  if (ch>='a' && ch<='z') {
			System.out.println("it is lowercase");
		}
		else  {
			System.out.println("its not lowercase or uppercase");
		}

	}

}

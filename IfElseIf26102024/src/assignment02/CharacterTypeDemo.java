package assignment02;

public class CharacterTypeDemo {

	public static void main(String[] args) {
		 short s = 82;
		 
		if (s >= 'a'&& s<='z')  {
			 System.out.println("s is alphabet ");
		 }
		 else if (s >= 0 && s<= 100)  {
			 System.out.println("s is digit");
		 }
		 else  {
			 System.out.println("s is special character");
		 }

	}

}

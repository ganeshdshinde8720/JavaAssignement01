package assignment02;

public class TallestStudentDemo {

	public static void main(String[] args) {
		float h1 = 5.2f;
		float h2 = 6.1f;
		int   h3 = 6;
		
		if (h1>h2 & h1>h3)  {
			System.out.println("h1 is tallest");
		}
		else if (h2>h1 & h2>h3)  {
			System.out.println("h2 is tallest");
		}
		else  {
			System.out.println("h3 is tallest");
		}

	}

}

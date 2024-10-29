package assignment02;

public class OldestandYoungestDemo {

	public static void main(String[] args) {
		int age1 = 25;
		int age2 = 56;
		int age3 =35;
	 
		int oldest;
		if (age1 > age2 && age1 > age3) {
			
			System.out.println("age1 is oldest");
		}
		else if (age2 > age1 && age2 > age3) {
			System.out.println("age2 is oldest");
		}
		else  {
			System.out.println("age3 is oldest");
		}
		int youngest;
		if (age1 < age2 && age1 < age3)  {
			System.out.println("age1 is youngest");
		}
		else if (age2 < age1 && age2 < age3)  {
			System.out.println("age2 is youngest");
		}
		else  {
			System.out.println("age3 is youngest");
		}

	}

}

package assignment02;

public class LargestNoDemo {

	public static void main(String[] args) {
		int s=87;
		float f=56.28f;
		double d= 111.62;
		
		if (s>f && s>d)  {
			System.out.println("S is largest");
		}
		else if (f>=s && f>=d)  {
			System.out.println("F is largest");
		}
		else  {
			System.out.println("D is largest");
		}

	}

}

package prepAllDay;

public class fibonacciSeries {

	public static void main(String[] args) {
		// fibonacci Series
		/*
		 * 0,1,1,2,3,5,8....
		 * 
		 * int range; int n1; int n2; int n3;
		 * 
		 * 
		 * n1 = 0; n2 = 1; n3 = n1 + n2; n1 = n2; n2 = n3;
		 * 
		 * 
		 */

		int range = 12;

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		System.out.println("Fibonnaci Series: ");
		for (int i = 1; i <= range; i++) {
			System.out.print(n1 + " ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

	}

}

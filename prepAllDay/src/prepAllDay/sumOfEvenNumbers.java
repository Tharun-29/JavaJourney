package prepAllDay;

public class sumOfEvenNumbers {

	public static void main(String[] args) {
		// Java Program to find the sum of all even numbers from 1 to 20
		
		
		int n = 20;
		int sum = 0;
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				sum = sum + i;
			}
		}
		
		System.out.println("Sum of all even numbers:"+sum);

	}

}

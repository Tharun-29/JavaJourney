package prepAllDay;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		 * int n;
		 * int rev;
		 * 
		 * int temp;
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int rev = 0;
		int temp = 0;
		
		while(n!=0) {
			temp = n%10;
			if(temp==0) {
				System.out.print(0);
			}
			rev = rev * 10 + temp;
			n = n/10;
		}
		
		System.out.println(rev);

	}

}

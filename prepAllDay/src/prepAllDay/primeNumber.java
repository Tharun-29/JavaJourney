package prepAllDay;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// if number is divisible by 1 and itself -> Prime number else its not prime

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				System.out.println("Number is not prime");
				break;
			} else {
				System.out.println("Number is prime");
				break;
			}
		}

	}

}

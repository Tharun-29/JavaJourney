package prepAllDay;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		int n;

		int range = 100;

		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= range; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " Number is even");
			} else {
				System.out.println(i + " Number is odd");
			}

		}
	}
}

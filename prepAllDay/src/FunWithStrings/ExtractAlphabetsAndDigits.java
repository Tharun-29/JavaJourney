package FunWithStrings;

import java.util.Scanner;

public class ExtractAlphabetsAndDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str1 = sc.nextLine();

		String alphabets = str1.replaceAll("[^a-zA-z]", "");
		String numbers = str1.replaceAll("[^0-9]", "");

		System.out.println(alphabets);
		System.out.println(numbers);

	}

}

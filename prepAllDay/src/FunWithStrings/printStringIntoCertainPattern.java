package FunWithStrings;

import java.util.Scanner;

public class printStringIntoCertainPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str1 = sc.nextLine();

		StringBuilder lowercase = new StringBuilder();
		StringBuilder uppercase = new StringBuilder();

		for (char ch : str1.toCharArray()) {

			if (Character.isLowerCase(ch)) {
				lowercase.append(ch);
			} else {
				uppercase.append(ch);
			}

		}
		
		System.out.println(lowercase.toString());
		System.out.println(uppercase.toString());

	}

}

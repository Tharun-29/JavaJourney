package FunWithStrings;

import java.util.Scanner;

public class swapString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str1 = sc.nextLine();

		String str2 = sc.nextLine();

		str1 = str1.concat(str2);

		str2 = str1.substring(0, str1.length() - str2.length());

		str1 = str1.substring(str2.length());

		System.out.println(str1);
		System.out.println(str2);

	}

}

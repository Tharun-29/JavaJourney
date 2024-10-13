package FunWithStrings;

import java.util.Scanner;

public class printUniqueCharacterInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		str = str.toLowerCase();

		boolean[] unique = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!unique[ch]) {
				unique[ch] = true;
				System.out.print(ch + " ");
			}
		}

	}

}

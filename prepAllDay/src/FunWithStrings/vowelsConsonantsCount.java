package FunWithStrings;

import java.util.Scanner;

public class vowelsConsonantsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int v = 0, c = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				v++;
			} else if (ch >= 'a' && ch <= 'z') {
				c++;
			}

		}

		System.out.println(v);
		System.out.println(c);
	}

}
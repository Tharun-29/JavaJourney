package FunWithStrings;

import java.util.Scanner;

public class printEachLetterTwiceFromGivenString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		
		int n = 2;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			for(int j=0;j<n;j++) {
				System.out.print(ch);
			}
		}

	}

}

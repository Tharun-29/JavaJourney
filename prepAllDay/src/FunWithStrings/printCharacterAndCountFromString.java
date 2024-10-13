package FunWithStrings;

import java.util.Scanner;

public class printCharacterAndCountFromString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();

		// Use an array to track whether a character has been counted
		boolean[] counted = new boolean[str.length()];

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!counted[i]) { // Check if this character has already been counted
				int count = 1; // Start count at 1 for the current character

				// Count occurrences of the current character
				for (int j = i + 1; j < str.length(); j++) {
					if (ch == str.charAt(j)) {
						count++;
						counted[j] = true; // Mark this character as counted
					}
				}
				System.out.print(ch + "" + count + " ");
			}
		}

		sc.close(); // Close the scanner to prevent resource leak
	}
}

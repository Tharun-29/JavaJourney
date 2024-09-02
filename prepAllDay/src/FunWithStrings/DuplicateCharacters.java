package FunWithStrings;

import java.util.HashMap;

public class DuplicateCharacters {
	public static void main(String[] args) {
		findDuplicate("Hello Hello I am original");
	}

	private static void findDuplicate(String input) {

		HashMap<Character, Integer> charMap = new HashMap<>();

		for (char c : input.toCharArray()) {
			if (c == ' ') {
				continue;
			}
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c, 1);
			}
		}

		// Print duplicate characters
		for (char c : charMap.keySet()) {
			if (charMap.get(c) > 1) {
				System.out.println(c + ":" + charMap.get(c));
			}
		}
	}

}

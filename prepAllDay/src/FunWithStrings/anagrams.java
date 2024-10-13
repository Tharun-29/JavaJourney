package FunWithStrings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagrams {

	public static void main(String[] args) {
		// Java prgm to compare two strings are anagram;

		String s1 = "listen";
		String s2 = "silt";

		char[] words1 = s1.toCharArray();
		char[] words2 = s2.toCharArray();

		Arrays.sort(words1);
		Arrays.sort(words2);

		String first = String.valueOf(words1);
		String second = String.valueOf(words2);

		if (first.equalsIgnoreCase(second)) {
			System.out.println("Two Strings are anagrams");
		} else {
			System.out.println("Two Strings are not anagrams");
		}
        
		if(first.matches(".*[aeiouAEIOU].*")){
			System.out.println("words consists of vowels");
		}
	}

}

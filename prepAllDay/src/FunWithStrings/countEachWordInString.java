package FunWithStrings;

import java.util.HashMap;

public class countEachWordInString {

	public static void main(String[] args) {
		/*
		 * 1. Take String input
		 * 2. Create a method for counting words
		 * 3. Split the string to string array to iterate each word to count
		 * 4. Use HashMap to iterate and count the words
		 * 5. Print the hashmap for count output
		 */
		
		String wordString = "Test Automation is Automation of Test";
		
		String[] words = wordString.split(" ");
		
		countEachWord(words);
		
		

	}

	private static void countEachWord(String[] words) {
		
		HashMap<String, Integer> stringMap = new HashMap<>();
		
		for(String word: words) {
			if(stringMap.containsKey(word)) {
				stringMap.put(word, stringMap.get(word)+1);
			}else {
				stringMap.put(word,1);
			}
		}
		
		System.out.println(stringMap);
		
	}

}

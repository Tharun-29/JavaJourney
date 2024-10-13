package FunWithStrings;

import java.util.HashMap;
import java.util.Set;

public class StringCount {

	public static void main(String[] args) {

		StringsCount("Test Automation Challenge Test Automation life is life");

	}

	private static void StringsCount(String str) {

		HashMap<String, Integer> mapCount = new HashMap<>();

		String[] strArray = str.split(" ");

		for (String word : strArray) {
			if (mapCount.containsKey(word)) {
				mapCount.put(word, mapCount.get(word) + 1);
			}else {
				mapCount.put(word, 1);
			}
		}
		
		
		Set<String> stringView = mapCount.keySet();
		
		for(String output: stringView) {
			System.out.println(output+":"+mapCount.get(output));
		}	
	}

}

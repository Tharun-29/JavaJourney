package FunWithStrings;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
	   
		
	  String str = "Jackieeesdasdafss";
	  
	   duplicateCharacterCount(str);

	}

	private static void duplicateCharacterCount(String str) {
		
		HashMap<Character, Integer> mapCount = new HashMap<>();
		
		 char[] strArray = str.toCharArray();
		 
		 for(char ch: strArray) {
			 if(mapCount.containsKey(ch)) {
				 mapCount.put(ch, mapCount.get(ch)+1);
			 }else {
				 mapCount.put(ch, 1);
			 }
		 }
		 
		 Set<Character> setView = mapCount.keySet();
		 
		 for(char c:setView) {
			 System.out.println(c+": "+mapCount.get(c));
		 }
	
		
	}

}

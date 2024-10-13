package FunWithStrings;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();  // Read input string

        String longestSubstring = findLongestSubstring(str);
        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        
        sc.close(); // Close the scanner to prevent resource leaks
    }

    public static String findLongestSubstring(String str) {
        HashSet<Character> charSet = new HashSet<>(); // Set to store characters
        String longest = ""; // To store the longest substring
        int left = 0; // Left pointer of the sliding window

        // Iterate over the string with a right pointer
        for (int right = 0; right < str.length(); right++) {
            char currentChar = str.charAt(right);
            
            // While the character is already in the set, remove the leftmost character
            while (charSet.contains(currentChar)) {
                charSet.remove(str.charAt(left));
                left++;
            }
            
            // Add the current character to the set
            charSet.add(currentChar);

            // Update the longest substring if needed
            if (right - left + 1 > longest.length()) {
                longest = str.substring(left, right + 1);
            }
        }

        return longest; // Return the longest substring found
    }
}
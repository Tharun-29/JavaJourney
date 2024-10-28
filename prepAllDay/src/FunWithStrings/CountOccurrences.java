package FunWithStrings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountOccurrences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        // Input the word to be counted
        System.out.println("Enter the word to count its occurrences:");
        String word = sc.nextLine();
        
        // Printing the count of occurrences of the given word in input string
        System.out.println("The word \"" + word + "\" appears " + countOccurrences(str, word) + " times.");

        sc.close();
    }

    // Method to count the occurrences of a word in the string
    private static int countOccurrences(String str, String word) {
        // Splitting the string into words
        List<String> wordsList = Arrays.asList(str.split("\\s+"));  // Split by whitespace
        
        // Counting the frequency of the given word
        return Collections.frequency(wordsList, word);
    }
}
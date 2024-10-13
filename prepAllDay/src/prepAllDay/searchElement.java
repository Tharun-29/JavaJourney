package prepAllDay;

import java.util.Scanner;

public class searchElement {

	public static void main(String[] args) {
		
		int arr[] = {23,54,72,92,53,11,65};
		
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		
		boolean isFound = searchElementinArray(element,arr);
		
		if(isFound) {
			System.out.println(element+" is present in the array");
		} else {
			System.out.println(element+" is not present in the array");
		}

	}

	private static boolean searchElementinArray(int element, int[] arr) {
		int k = 0;
		for(int num:arr) {
			k++;
			if(element == num) {
				System.out.println("Found at Index: "+k);
				return true;
			}
		}
		
		
		
		return false;
	}

}

package Array;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class duplicateArrayElements {

	public static void main(String[] args) {

		int arr[] = { 22, 46, 32, 46, 86, 2, 86, 23, 46 };

		int[] removeDuplicate = removeDuplicate(arr);

		for (int n : removeDuplicate) {
			System.out.print(n + " ");
		}

	}

	private static int[] removeDuplicate(int[] arr) {

		HashSet<Integer> set = new LinkedHashSet<>();

		for (int n : arr) {
			set.add(n);
		}

		int result[] = new int[set.size()];
		int i = 0;
		for (int num : set) {
			result[i++] = num;
		}

		return result;
	}

}

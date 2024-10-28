package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class duplicateArrayElements {

	public static void main(String[] args) {

		int arr[] = {1,1,1,2,2,2,3,3,3};

		int[] removeDuplicate = removeDuplicate(arr);
		
		removeDuplicateUsingStream(arr);

		for (int n : removeDuplicate) {
			System.out.print(n + " ");
		}

	}

	private static void removeDuplicateUsingStream(int[] arr) {
		
		Integer[] arr1 = Arrays.stream(arr)
		.boxed().toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(arr1);
		
		List<Integer> sorted = list.stream().distinct().collect(Collectors.toList());
		System.out.println(sorted);
		
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

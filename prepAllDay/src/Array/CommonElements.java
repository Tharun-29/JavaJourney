package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonElements {
      public static void main(String[] args) {
		int arr1[] = {1,2,3,23,42};
		int arr2[] = {3,42,4,2,3,23};
		
		
		Set<Integer> commonElements = findCommonElements(arr1,arr2);
		List<Integer> commonElementsUsingStreams = findCommonElementsUsingStreams(arr1, arr2);
		System.out.println(commonElements);
		System.out.println(commonElementsUsingStreams);
	}

	private static List<Integer> findCommonElementsUsingStreams(int[] arr1, int[] arr2) {
		Integer[] intarray1 = Arrays.stream(arr1)
		.boxed()
		.toArray(Integer[]::new);
		
		Integer[] intarray2 = Arrays.stream(arr2)
		.boxed()
		.toArray(Integer[]::new);
		
		
		List<Integer> common = Arrays.stream(intarray1).filter(Arrays.asList(intarray2)::contains).collect(Collectors.toList());
		
		return common;
		
	}

	private static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> commonElement = new HashSet<>();
		
		for(int num:arr1) {
			set1.add(num);
		}
		
		for(int n:arr2) {
			if(set1.contains(n)) {
				commonElement.add(n);
			}
		}
		
		
		return commonElement;
		
		
	}
}

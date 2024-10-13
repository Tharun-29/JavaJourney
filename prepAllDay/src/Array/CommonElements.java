package Array;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {
      public static void main(String[] args) {
		int arr1[] = {1,2,3,23,42};
		int arr2[] = {3,42,4,2,3,23};
		
		
		Set<Integer> commonElements = findCommonElements(arr1,arr2);
		System.out.println(commonElements);
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

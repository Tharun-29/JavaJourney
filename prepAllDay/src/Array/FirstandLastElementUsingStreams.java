package Array;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstandLastElementUsingStreams {

	public static void main(String[] args) {
		
		int arr[] = {35,6,73,72,47,74,99};
		
		findFirstAndLast(arr);

	}

	private static void findFirstAndLast(int[] arr) {
		
		Integer[] arr1 = Arrays.stream(arr)
		.boxed()
		.toArray(Integer[]::new);
		
		List<Integer> list = Arrays.asList(arr1);
		
		
		
		Integer first = list.stream().findFirst().orElse(null);
		
		Integer last = list.stream().skip(list.size()-1).findFirst().orElse(null);
		System.out.println(first);
		System.out.println(last);
	}

}

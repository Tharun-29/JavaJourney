package prepAllDay;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {

		int arr[] = { 23, 54, 72, 92, 53, 11, 65 };
		Arrays.sort(arr);
		
		//print the sorted array
		for(int n:arr) {
			System.out.print(n+" ");
		}
         System.out.println();
		int target = 56;

		int result = binarySearch(target, arr);
      
		if(result==-1) {
			System.out.println(target+" is not found in the array");
		} else {
			System.out.println(target+" is found at index "+result);
		}
		
	}

	private static int binarySearch(int target, int[] arr) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}

		return -1;
	}

}

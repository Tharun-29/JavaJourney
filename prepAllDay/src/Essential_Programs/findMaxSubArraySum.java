package Essential_Programs;

public class findMaxSubArraySum {

	public static void main(String[] args) {
		
		
		int arr[] = {10,3,-4,6,32,9,-8,-1,5};
		
		int maxSum = findMaxSubArraySumTotal(arr);
		
		System.out.println("Maximum Subarray Sum: " + maxSum);

	}

	private static int findMaxSubArraySumTotal(int[] arr) {

          int max_current = arr[0];
          int max_global = arr[0];
          
          for(int i=1;i< arr.length;i++) {
        	  max_current = Math.max(arr[i],max_current + arr[i]);
        	  
        	  if(max_current > max_global) {
        		  max_global = max_current;
        	  }
          }
		
		
		return max_global;
	}

}

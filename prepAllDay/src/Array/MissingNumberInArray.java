package Array;

public class MissingNumberInArray {

	public static void main(String[] args) {
		
		
		int arr[] = {1,2,3,4,6};
		int n = arr.length+1;
		
		int totalSum = (n * (n+1)) / 2;
		int sum = 0;
		
		for(int num:arr) {
			sum = sum+num;
		}
		
		int missing_number = totalSum-sum;
		
		System.out.println("Missing_number:"+missing_number);

	}

}

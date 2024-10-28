package Array;

public class LargestSmallest {

	public static void main(String[] args) {
		
		int arr[] = {10,31,32,9,24,35};
	
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Smallest: "+arr[0]);
		System.out.println("Largest: "+arr[arr.length-1]);
		
	}

}

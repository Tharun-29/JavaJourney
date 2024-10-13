package prepAllDay;

public class smallestLargest {

	public static void main(String[] args) {
		
		int arr[] = {173,63,45,73,23,89,21,64,46};
		
		int arrsize = arr.length;
		int temp = 0;
		
		for(int i=0;i<=arrsize-1;i++) {
			for(int j=i+1;j<=arrsize-1;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Smallest Element in the array:"+arr[0]);
		System.out.println("Largest Element in the array:"+arr[arrsize-1]);

	}

}

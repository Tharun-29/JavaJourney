package prepAllDay;

public class largestOf3Nos {

	public static void main(String[] args) {
		
		
		int a = 12, b = 124, c = 32;
		
		int temp = a>b ? a : b;
		
		int largest = c > temp ? c : temp;
		
		System.out.println(largest);
		
		
	}

}

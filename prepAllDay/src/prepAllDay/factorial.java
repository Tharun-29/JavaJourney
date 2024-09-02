package prepAllDay;

public class factorial {

	public static void main(String[] args) {
		/*
		 * factorial - 
		 *  5! = 120
		 *  5*4*3*2*1
		 *  
		 *  int n;
		 *  int fact = 1;
		 *  
		 */
		
		int n = 5;
		
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);
		

	}

}

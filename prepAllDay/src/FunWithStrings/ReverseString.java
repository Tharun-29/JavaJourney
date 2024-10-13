package FunWithStrings;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * S = i.like.this.program.very.much Output: much.very.program.this.like.i
		 * Explanation: After reversing the whole string(not individual words), the
		 * input string becomes much.very.program.this.like.i
		 */

		String str = "i.like.this.program.very.much";

		String[] words = str.split("\\.");
		String[] rev = new String[words.length];
		int k =0;

		for(int i=words.length-1;i>=0;i--) {
			rev[k] = words[i];
			k++;
		}
		
		for(int i=0;i<rev.length;i++) {
			if(i == rev.length-1) {
				System.out.print(rev[i]); // Last word without trailing dot
			}else{
				System.out.print(rev[i]+".");
			}
		}
		
	}
}

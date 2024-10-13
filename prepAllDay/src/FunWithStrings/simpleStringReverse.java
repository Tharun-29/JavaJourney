package FunWithStrings;

public class simpleStringReverse {

	public static void main(String[] args) {


		String str = "I Envy you";
		
		String[] words = str.split(" ");
		
		String rev = "";
		
//		int len = str.length();
//		System.out.println(len);
//		
//		for(int i=str.length()-1;i>=0;i--) {
//			  rev = rev + str.charAt(i);
//		}
//		
//		System.out.println(rev);
//		
//		if(str.equalsIgnoreCase(rev)) {
//			System.out.println("Palindrome");
//		}else {
//			System.out.println("Not Palindrome");
//		}
//		
		for(String word: words) {
			for(int i=word.length()-1;i>=0;i--) {
				  char ch = word.charAt(i);
				  rev = rev + ch;
			}
			rev = rev + " ";
		}
		
		System.out.println(rev);
		
	}

}

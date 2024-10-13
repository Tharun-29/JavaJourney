package FunWithStrings;

public class permutationOfString {

	public static void main(String[] args) {
		
		String str = "howareyou";
		
		
		
		int count = permute(str,"");
		
		System.out.println(count);
		
	}

	private static int permute(String str, String ans) {
		int count = 0;
		if(str.length() == 0) {
			System.out.println(ans);
			return 1;
		}else {
			for(int i=0;i<str.length();i++) {
				String rem = str.substring(0, i) + str.substring(i+1);
				count +=permute(rem,ans+str.charAt(i));
			}
		}
		
		return count;
	}

}

package FunWithStrings;

public class stringAnagrams {

	public static void main(String[] args) {

		String str1 = "violent";
		String str2 = "tiovens";

		System.out.println(isAnagram(str1, str2));

	}

	private static boolean isAnagram(String str1, String str2) {

		if (str1.length() != str2.length()) {
			return false;
		}

		int[] charCount = new int[256];

		for (int i = 0; i < str1.length(); i++) {
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}

		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}
		return true;

	}

}

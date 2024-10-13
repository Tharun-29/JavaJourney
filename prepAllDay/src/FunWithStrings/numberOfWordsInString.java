package FunWithStrings;

public class numberOfWordsInString {

	public static void main(String[] args) {

		String str = "Hello who are you and how are you";

		String[] strArray = str.split(" ");

		System.out.println(strArray.length);

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}

		System.out.println(count);

	}

}

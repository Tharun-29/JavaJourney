package FunWithStrings;

public class stringConcat {

	public static void main(String[] args) {

		String s = "I hate programming";

		String[] words = s.split(" ");

		StringBuilder build = new StringBuilder();

		for (int i = 0; i <= words.length-1; i++) {

			build.append(words[i]);

			if (i!=words.length-1) {
				build.append("^");
			}

		}

		System.out.println(build);

	}

}

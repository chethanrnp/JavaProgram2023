package JavaProgram;

import java.util.Arrays;

public class Practise_1 {

	public static void main(String[] args) {

		String s = "Chethan@$%";

		int count = 0;
		String special = "";
		for (int i = 0; i < s.length(); i++) {
			if (!(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i))
					|| Character.isWhitespace(s.charAt(i)))) {
				count++;
				special = special + s.charAt(i);
			}
		}
		System.out.println(count);
		System.out.println(special);
	}
}

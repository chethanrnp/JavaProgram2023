package Assig;

import java.util.LinkedHashSet;

public class CountNumberOfVowels {

	public static void main(String[] args) {
		String s = "india";

		LinkedHashSet<Character> list = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			list.add(s.charAt(i));
		}

		for (Character lv : list) {
			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == lv) {
					if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
							|| s.charAt(i) == 'u') {
						count++;

					}
				}
			}
			if (count >= 1) {
				System.out.println(lv + "=" + count);

			}
		}
	}
}

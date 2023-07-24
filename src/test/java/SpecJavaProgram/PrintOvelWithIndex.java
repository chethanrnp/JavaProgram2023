
package SpecJavaProgram;

import java.util.LinkedHashSet;

public class PrintOvelWithIndex {

	public static void main(String[] args) {

		String s = "india";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}

		for (Character lv : set) {
			int count = 0;
			if (lv == 'a' || lv == 'e' || lv == 'i' || lv == 'o' || lv == 'u') {
				count++;
				System.out.println(lv + "=" + count);

			}
		}
	}
}

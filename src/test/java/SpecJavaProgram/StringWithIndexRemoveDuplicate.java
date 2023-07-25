package SpecJavaProgram;

import java.util.LinkedHashSet;

public class StringWithIndexRemoveDuplicate {

	public static void main(String[] args) {
		String s = "Tester";
		String s1 = s.toLowerCase();

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			set.add(s1.charAt(i));
		}

		for (Character lv : set) {
			int count = 0;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) == lv) {
					System.out.println(lv + "=" + (i + 1));
					break;
				}

			}

		}
	}
}

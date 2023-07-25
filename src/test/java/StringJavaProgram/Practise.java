package StringJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		String s = "java is easy java is easy";
		int half = s.length() / 2;

		String upper = "";
		String lower = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < half) {
				upper = upper + Character.toUpperCase(s.charAt(i));
			} else {
				lower = lower + Character.toLowerCase(s.charAt(i));
			}
		}
		System.out.println(upper + lower);
		System.out.println(lower.trim());
	}
}

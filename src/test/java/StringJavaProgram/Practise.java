package StringJavaProgram;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {

		String s = "Hi hello Welocme Bye";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String rev = a[i];
			for (int j = rev.length() - 1; j >= 0; j--) {
				System.out.print(rev.charAt(j));
			}
			System.out.print(" ");
		}
	}
}

package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Practise {

	public static void main(String[] args) {
		String s = "india";

		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				count++;
			}
			if (count > 1) {
				System.out.println(s.charAt(i));
			}
		}
		System.out.println(count);
	}
}

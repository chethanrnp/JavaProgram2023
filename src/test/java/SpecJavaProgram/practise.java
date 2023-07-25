package SpecJavaProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {

		String s = "a1b2c34";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sum = sum + (s.charAt(i) - 48);
			}
		}
		System.out.println(sum);
	}
}

package SpecJavaProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {

		int[] a = new int[] { 1, -2, 3, 4, -5 };
		int fMax = a[0];
		int sMax = a[0];
		int tMax = a[0];
		for (int i : a) {
			System.out.println(i);
		}
		practise p1 = new practise();
		practise p2 = new practise();
		practise p3 = new practise();
		practise[] p = { p1, p2, p3 };

		for (int i = 0; i < a.length; i++) {
			if (fMax < a[i]) {
				tMax = sMax;
				sMax = fMax;
				fMax = a[i];
			} else if (sMax < a[i]) {
				tMax = sMax;
				sMax = a[i];
			} else if (tMax < a[i]) {
				tMax = a[i];
			}
		}
		System.out.println(fMax);
		System.out.println(sMax);
		System.out.println(tMax);
	}
}

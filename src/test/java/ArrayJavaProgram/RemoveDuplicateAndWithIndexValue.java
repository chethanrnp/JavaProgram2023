package ArrayJavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateAndWithIndexValue {

	public static void main(String[] args) {
		int[] a = { 8, 2, 3, 7, 5, 5, 7, 7 };

		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);

		}
		for (Integer lv : set) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == lv) {
					System.out.println(lv + " " + i);
					break;
				}
			}
		}
	}
}

package ArrayJavaProgram;

import java.util.LinkedHashSet;

public class NoOfDuplicateInArray_1 {

	public static void main(String[] args) {

		int[] a = { 8, 2, 3, 7, 5, 5, 7, 7 };
		LinkedHashSet<Integer> l = new LinkedHashSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			l.add(a[i]);
		}
		for (Integer lv : l) {

			int count = 0;
			for (int i = 0; i < a.length; i++) {

				if (a[i] == lv) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(lv + "=" + count);
			}

		}

	}
}

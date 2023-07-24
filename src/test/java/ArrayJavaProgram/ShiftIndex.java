package ArrayJavaProgram;

import java.util.Arrays;

public class ShiftIndex {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int k = 2;

		for (int i = k; i < k; i++) {
			int tem = a[0];
			for (int j = 1; j < a.length; j++) {

				a[j - 1] = a[j];

			}
			a[a.length - 1] = tem;
		}
		System.out.println(Arrays.toString(a));
	}
}

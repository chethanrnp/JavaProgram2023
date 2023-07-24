package ArrayJavaProgram;

import java.util.Arrays;

public class DecendingOrder {

	public static void main(String[] args) {
		int a[] = { 9, 5, 7, 6, 8, };
		int temp;
		// Arrays.sort(a);

		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class FmaxAndSmaxWithBubble {

	public static void main(String[] args) {
		int a[] = { 20, 30, 10, 50, 40 };

		int Fmax = a[0];
		int Smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (Fmax < a[i]) {
				Smax = Fmax;
				Fmax = a[i];
			} else if (Smax < a[i]) {
				Smax = a[i];
			}
		}
		System.out.println(Fmax);
		System.out.println(Smax);
	}
}

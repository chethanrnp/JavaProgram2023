package ArrayJavaProgram;

import java.util.Iterator;

public class Matrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// find min number and then find maximum number in that coloumn
		int min = a[0][0];
		int col = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
					col = j;
				}
			}
		}
		System.out.println(min);
		System.out.println(col);
		int max = a[0][col];
		for (int i = 0; i < 3; i++) {
			if (max < a[i][col]) {
				max = a[i][col];
			}
		}
		System.out.println(max);
	}

}

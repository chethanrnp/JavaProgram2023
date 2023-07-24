package ArrayJavaProgram;

public class SmallestNumber3_3_Matrix {

	public static void main(String[] args) {
		// Intilization of 3*3 Matrix Using Array Literal
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// Assuming Minium Value
		int min = a[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (min > a[i][j]) {
					min = a[i][j];
				}
			}
		}
		System.out.println(min);
	}
}

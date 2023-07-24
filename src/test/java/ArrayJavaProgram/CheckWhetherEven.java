package ArrayJavaProgram;

public class CheckWhetherEven {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 7, 8, 9, 10, 122 };
		int b = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
				b++;
			} else {
				continue;
			}
		}
		System.out.println(b);
	}
}

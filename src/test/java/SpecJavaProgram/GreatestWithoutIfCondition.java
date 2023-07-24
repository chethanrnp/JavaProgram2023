package SpecJavaProgram;

public class GreatestWithoutIfCondition {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		int d = a > b ? a : b;
		System.out.println(d);

		int e = a > b ? (a > c ? a : c) : (b > c ? b : c);
		System.out.println(e);
	}
}

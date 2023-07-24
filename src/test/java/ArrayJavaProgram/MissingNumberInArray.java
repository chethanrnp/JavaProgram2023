package ArrayJavaProgram;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 10=total number 11=total number+1 =to find sum of first 10 digit
		int totalSum = 10 * 11 / 2;

		System.out.println(totalSum);
		int Actualsum = 0;
		for (int i = 0; i < arr.length; i++) {
			Actualsum = Actualsum + arr[i];
		}

		System.out.println("the digit that is missing=" + (totalSum - Actualsum));
	}

}

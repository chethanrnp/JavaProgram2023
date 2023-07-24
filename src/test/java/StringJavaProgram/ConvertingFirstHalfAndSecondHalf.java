package StringJavaProgram;

public class ConvertingFirstHalfAndSecondHalf {

	public static void main(String[] args) {
		String s = "java is easy java is easy";

		int mid = s.length() / 2;
		System.out.println(mid);

		String lowerCase = "";
		String upperCase = "";
		for (int i = 0; i < s.length(); i++) {
			if (i < mid) {
				lowerCase = lowerCase + Character.toLowerCase(s.charAt(i));
			} else {
				upperCase = upperCase + Character.toUpperCase(s.charAt(i));
			}
		}
		System.out.println(lowerCase);
		System.out.println(upperCase.trim());
	}

}

package StringJavaProgram;

public class ToFindMaxLengthOfIntegerArray {

	 public static void main(String[] args) {
		String s[]= {"1","223","4556","77895","896541"};
		
		String max=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(max.length()<s[i].length())
				max=s[i];
		}
		System.out.println(max);
	}
}

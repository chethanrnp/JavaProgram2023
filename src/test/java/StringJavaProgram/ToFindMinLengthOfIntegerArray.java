package StringJavaProgram;

public class ToFindMinLengthOfIntegerArray {

	 public static void main(String[] args) {
		String s[]= {"a","hello","ab","welcome","hi"};
		
		String min=s[0];
		
		for (int i = 0; i < s.length; i++) {
			if(min.length()>s[i].length())
				min=s[i];
		}
		
		System.out.println(min);
	}
}

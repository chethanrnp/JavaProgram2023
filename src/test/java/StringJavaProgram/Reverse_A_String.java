package StringJavaProgram;

public class Reverse_A_String {

	 public static void main(String[] args) {
		String s="chethan";
		String rev="";
		
		for (int i = s.length()-1;  i>=0 ; i--) {
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
	}
}

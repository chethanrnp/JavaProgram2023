package StringJavaProgram;

public class ReverseSentence_1 {

	 public static void main(String[] args) {
		 String s="Hi hello Welocme Bye";
		 String[] ch = s.split(" ");
		 
		 for (int i = 0; i < ch.length; i++) {
			 String s1=ch[i];
			for (int j = s1.length()-1; j >=0 ; j--) {
				System.out.print(s1.charAt(j));
			}
			System.out.print(" ");
		}
	}
}

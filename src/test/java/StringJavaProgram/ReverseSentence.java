package StringJavaProgram;

public class ReverseSentence {

	 public static void main(String[] args) {
		String s="Hi hello Welocme Bye";
		
		       String[] ch = s.split(" ");
		       
		       String rev="";
		       
		       for (int i =ch.length-1; i >=0; i--) {
				rev=rev+ch[i]+" ";
			}
		       System.out.println(rev);
	}
}

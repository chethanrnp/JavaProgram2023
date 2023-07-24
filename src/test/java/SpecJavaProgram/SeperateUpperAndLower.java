package SpecJavaProgram;

public class SeperateUpperAndLower {

	 public static void main(String[] args) {
		  String s="Java Is Easy";
          
          String Uper="";
          String Lower="";
          
          for (int i = 0; i < s.length(); i++) {
       	   char ch=s.charAt(i);
				if (ch>=65 &&ch<=90) {
				Uper=Uper+ch;
			}
			else {
				Lower=Lower+ch;
			}
		}
          System.out.println(Uper);
          System.out.println(Lower);
	}
}

package SpecJavaProgram;

public class StringTricky_1 {

	 public static void main(String[] args) {
		String s="my name is vinay";
		
		String[] s1 = s.split(" ");
		
		
		for (int i = 0; i < s1.length; i++) {  //diff is 32
			 char FirstL = (char)(s1[i].charAt(0)-32);//asci of A=65, a=97
			 String sub = s1[i].substring(1);
			 
			 System.out.print(FirstL+sub+" ");
		}
		
	}
}

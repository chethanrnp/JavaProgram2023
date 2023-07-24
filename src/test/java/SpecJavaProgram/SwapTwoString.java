package SpecJavaProgram;

public class SwapTwoString {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		a=a+b;//30
		
		b=a-b;//10
	
	    a=a-b;//2=
	    
	    System.out.println(a);
	    System.out.println(b);
	    // for String
	    String s1="java";  //4 12
	    String s2="Selenium";// 8 
	    
	    s1=s1+s2; //
	    s2=s1.substring(0, s1.length()-s2.length());
	  	s1=s1.substring(s2.length());
	  	
	  	System.out.println(s1);
	  	System.out.println(s2);
	}

}

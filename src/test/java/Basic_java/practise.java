package Basic_java;

import org.testng.annotations.Test;

public class practise {
	
	public static int add(int a,int b) {
		int c=a+b;
		return c;
		
	}

	public static boolean even(int a) {
		if (a%2==0)  
			return true;
		else 
		return false;
	}
	
	public static  String even(int a,int b) {
		String result="";
		for (int i = a; i <=b; i++) {
			if (i%2==0) {
				result =result+i+" ";
			}
		}
		return result;
	}
	 public static void main(String[] args) {
	int ch = add(109, 110);
	System.out.println(ch);
	
	System.out.println(even(5));
	System.out.println(even(10, 20));
	}
	
}

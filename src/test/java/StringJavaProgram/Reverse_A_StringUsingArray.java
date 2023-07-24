package StringJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class Reverse_A_StringUsingArray {

	 public static void main(String[] args) {
		String s="chethan";
		char[] c = s.toCharArray();
		Character[]  rev=new Character[c.length];
		String rev1="";
		for (int i =c.length-1; i >=0; i--) {
			System.out.println(c[i]);
			rev1=rev1+c[i];
		}
		
		System.out.println(rev1);
			}
}

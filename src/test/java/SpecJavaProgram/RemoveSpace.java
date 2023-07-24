package SpecJavaProgram;

import java.util.Arrays;

public class RemoveSpace {

	 public static void main(String[] args) {
		String s="my name is vinay";
		String[] s1 = s.split(" ");
		//String ch = s.replace(" ", "");
		//System.out.println(ch);
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i]);
		}
		
	 }
}

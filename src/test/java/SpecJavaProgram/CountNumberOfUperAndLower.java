package SpecJavaProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class CountNumberOfUperAndLower {

	

	public static void main(String[] args) {
		 
           String s="Java Is Easy";
           
           int Uper=0;
           int Lower=0;
           
           for (int i = 0; i < s.length(); i++) {
        	   char ch=s.charAt(i);
				if (ch>=65 &&ch<=90) {
				Uper++;
			}
			else {
				Lower++;
			}
		}
           System.out.println(Uper);
           System.out.println(Lower);
	}
}

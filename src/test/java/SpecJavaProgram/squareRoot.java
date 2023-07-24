package SpecJavaProgram;

import java.util.Scanner;

public class squareRoot {

	 public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the digit");
		int c = s.nextInt();
		
		if (c<0) {
			System.out.println("is not real number");
		}
		else {
			double ch = Math.sqrt(c);
			System.out.println("th square root of"+c+"is"+ch);
		}
	}
}

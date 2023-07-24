package SpecJavaProgram;

import java.util.LinkedHashSet;

public class PrintOvelWithOutDuplicate {

	 public static void main(String[] args) {
		String s="india";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i <s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for (Character lv : set) {
			if(lv=='a' || lv=='e'|| lv=='i' ||lv=='o' || lv=='u') {
				System.out.println(lv);
			}
		}
	}
}

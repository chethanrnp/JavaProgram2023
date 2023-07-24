package StringJavaProgram;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ScannerUsingForDuplicate {

	 public static void main(String[] args) {
	
			Scanner s1=new Scanner(System.in);
			  System.out.println("enter the string");
			       String s = s1.next();
			     
			LinkedHashSet<Character> set=new LinkedHashSet<Character>();
			
			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
			
			for(Character lv:set) {
				int count=0;
				for (int i = 0; i < s.length(); i++) {
					if(s.charAt(i)==lv) {
						count++;
					}
				}
				if(count>1) {
					System.out.println(lv+"="+count);
				}
			}
	}
}

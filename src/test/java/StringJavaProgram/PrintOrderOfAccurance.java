package StringJavaProgram;

import java.util.LinkedHashSet;

public class PrintOrderOfAccurance {

	 public static void main(String[] args) {
		 String s="wElcome";
		  
		    LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		    for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i));
			}
		    
		    for (Character lv : set) {
				for (int i = 0; i < s.length(); i++) {
					if (s.charAt(i)==lv) {
						System.out.println(lv+"="+(i+1));
						break;
					}
				}
			}
	}
}

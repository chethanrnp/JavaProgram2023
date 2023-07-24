package StringJavaProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class IndexOfAStringWithoutDuplicate {

	 public static void main(String[] args) {
		String s="hello";
		
	/*	for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i)+"="+i);
		}*/
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		
		for(Character lv:set) {
			for (int i = 0; i < s.length(); i++) {
				if(lv==s.charAt(i)) {
					System.out.println(lv+"="+(i+1));
					break;
				}
			}
			
		}
	}
}

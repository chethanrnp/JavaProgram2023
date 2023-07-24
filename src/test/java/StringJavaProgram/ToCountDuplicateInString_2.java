package StringJavaProgram;

import java.util.LinkedHashSet;

public class ToCountDuplicateInString_2 {

	 public static void main(String[] args) {
			String s="hello";
			
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
				
					System.out.println(lv+"="+count);
				
			}
	}
}

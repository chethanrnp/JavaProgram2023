package StringJavaProgram;

import java.util.LinkedHashSet;

public class ToCountDuplicateInString_3 {

	 public static void main(String[] args) {
		String s="chethan";
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		
		for(Character lv:set) {
			int count=0;
			for (int i = 0; i <s.length(); i++) {
				if(lv==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(lv+"="+count);
			}
		}
	}
}

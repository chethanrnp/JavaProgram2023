package StringJavaProgram;

import java.util.LinkedHashSet;

public class RemoveDupilcateFromString {

	 public static void main(String[] args) {
		 String s="Hi Hi hello Welocme Bye";
		 
		String[] ch = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		for (String lv: set) {
			
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if (lv.equals(ch[i])) {
					count++;
				}
			}
			System.out.println(lv+"="+count);
		}
	}
}

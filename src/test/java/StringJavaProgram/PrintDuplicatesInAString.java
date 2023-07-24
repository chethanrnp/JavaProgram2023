package StringJavaProgram;

import java.util.LinkedHashSet;

public class PrintDuplicatesInAString {

	 public static void main(String[] args) {
		String s="Hi Hi Hello Welcome Come";
		
		String[] ch = s.split(" ");
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}
		
		for (String lv : set) {
			int count=0;
			for (int i = 0; i < ch.length; i++) {
				if(lv.equals(ch[i])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(lv+"="+count);
			}
			
		}
	}
}

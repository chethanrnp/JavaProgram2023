package StringJavaProgram;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicateInString {

	 public static void main(String[] args) {
		String s="hello";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
	
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
			
		}
		System.out.println(set);
	}
}

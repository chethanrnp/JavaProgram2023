package JavaProgram;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class practise {
 
	 public static void main(String[] args) {
	String s1="I love India And KA";
	String[] s=s1.split(" ");
	TreeSet t=new TreeSet();
	
	for (int i = 0; i < s.length; i++) {
		t.add(s.length);
	}
//	int count=0;

	for(Object lv:t) {
		int count=0;

			for (int i = 0; i <s.length; i++) {
		if(lv.equals(s[i]))
			count++;
	}
			System.out.println(count);
		}
	}
}

package StringJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class SwapLastTwoSentence {

	 public static void main(String[] args) {
		String s="Hi Hello Welcome Bye";
		     String[] s1 = s.split(" ");
		     
		     String temp=s1[0];
		     s1[0]=s1[s1.length-1];
		     s1[s1.length-1]=temp;
		     
		     String s2="";
		    for (int i = 0; i < s1.length; i++) {
				s2=s2+s1[i]+" ";
			}
		    System.out.println(s2); 
		    
		    String c="shetty chethan";
		    String[] ch = c.split(" ");
		    String tem=ch[0];
		    ch[0]=ch[ch.length-1];
		    ch[ch.length-1]=tem;
		    
		    System.out.println(Arrays.toString(ch));
	}
}

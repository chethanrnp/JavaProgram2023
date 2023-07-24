package SpecJavaProgram;

import java.util.Iterator;

public class SeprateFromString {

	 public static void main(String[] args) {
		String s="A1b2@3c";
		
		String al="";
		String num="";
		String spec="";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
				al=al+s.charAt(i);
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				num=num+s.charAt(i);
			}
			else {
				spec=spec+s.charAt(i);
			}
		}
		
		System.out.println(al);
		System.out.println(num);
		System.out.println(spec);
		
		//ORRR
		
		String alp="";
		String numb="";
			String spe="";
		for (int i = 0; i < s.length(); i++) {
	//		 char ch = s.charAt(i);
			 if (Character.isAlphabetic(s.charAt(i))) {
				alp=alp+s.charAt(i);
			}
			 else if (Character.isDigit(s.charAt(i))) {
				numb=numb+s.charAt(i);
			}
			 else {
				spe=spe+s.charAt(i);
			}
		}
		System.out.println(alp);
		System.out.println(numb);
		System.out.println(spe);
	}
}

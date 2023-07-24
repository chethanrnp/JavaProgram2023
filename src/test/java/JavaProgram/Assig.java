package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Assig {

	 public static void main(String[] args) {
				
	ArrayList<Object> an=new ArrayList<Object>();
	an.add("chethan");
	an.add("Arya");
	an.add("Cbz");
	an.add("Dell");
	an.add("Lenavo");
	System.out.println(an);
	
	ArrayList<Object> an1=new ArrayList<Object>();
	an1.add("hp");
	an1.addAll(an);
	System.out.println(an1);
	
	Collections.sort(an1,Collections.reverseOrder());
	for(Object lv:an1) {
		System.out.println(lv);
	}
	
	}
}

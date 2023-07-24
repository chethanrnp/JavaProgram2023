package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class SeperatinInArray {

	 public static void main(String[] args) {
		int[] a= {1,0,0,1,0,1};
		int[] b=new int[a.length];
		
		int m=0;
		int n=a.length-1;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]==1) {
			b[n]=a[i];
			n--;
			}
			else {
				b[m]=a[i];
				m++;
			}
				
		}
		
		System.out.println(Arrays.toString(b));
	}
}

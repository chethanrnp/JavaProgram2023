package ArrayJavaProgram;

import java.util.Arrays;

public class SeperatinInArray_1 {

	 public static void main(String[] args) {
		int[] a= {3,0,2,0,0,1};
		
		int[] b=new int[a.length];
		
		int n=0;
		int m=a.length-1;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n++;
			}
			else {
				b[m]=a[i];
				m--;
			}
				
		}
		
		int n1=0;
		int m2=b.length-1;
		System.out.println(Arrays.toString(b));
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]==0) {
				b[m2]=a[i];
				m2--;
			}
			else {
				b[n1]=a[i];
				n1++;
			}
				
		}
		
		System.out.println(Arrays.toString(b));
		
		
		
	}
}

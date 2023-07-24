
package ArrayJavaProgram;

import java.util.Arrays;

public class AddTwoArray {

	 public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {5,6,7,8};
		
		for (int i = 0; i < a.length; i++) {
			try {
				System.out.println(a[i]+b[i]);
			} catch (Exception e) {
				if(a.length>b.length) {
					System.out.println(a[i]);
				}
				else {
					System.out.println(b[i]);
				}
			}
		}
		
	/*	int[] a= {1,2,3,4,5};
		int[] b= {5,6,7,8};
		int[] c=new int[a.length];
		for (int i = 0; i < a.length; i++) {
			try {
				c[i]=a[i]+b[i];
			} catch (Exception e) {
				if(a.length>b.length) {
					c[i]=a[i];
				}
				
				}
			}
		System.out.println(Arrays.toString(c));*/
	}
}

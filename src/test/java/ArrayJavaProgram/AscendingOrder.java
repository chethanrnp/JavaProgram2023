package ArrayJavaProgram;

import java.util.Arrays;

public class AscendingOrder {

	 public static void main(String[] args) {
		int a[]= {5,3,1,2,4};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1+i; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}

package ArrayJavaProgram;

import java.util.Arrays;

public class AscendingAndDeceding {

	 public static void main(String[] args) {
		int a[]= {20,30,10,50,40};
		
		int temp;
		
		 for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		 System.out.println(Arrays.toString(a));
		 
		 for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
					if(a[i]<a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			 System.out.println(Arrays.toString(a));
	
	}
}

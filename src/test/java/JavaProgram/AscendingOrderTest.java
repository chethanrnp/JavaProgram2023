package JavaProgram;

import java.util.Arrays;
import java.util.Iterator;

public class AscendingOrderTest {

	public static void main(String[] args) {
		int a[]= {40,10,20,50,30};
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
			}
}

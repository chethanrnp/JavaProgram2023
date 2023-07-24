package Basic_java;

import java.util.Arrays;

public class practise_1 {
 
	 public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b=a;
		printArray(a);
		System.out.println(add(10,20,50));
		}
	 
	 public static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
		
		
}
	 public static int add(int... su) {
	int sum=1;
	for (int i = 0; i < su.length; i++) {
		sum=sum*su[i];
	}
	return sum;
	}
}

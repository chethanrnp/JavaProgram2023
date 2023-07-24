package SpecJavaProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class FirstThreeMaxWithOutBubble {

	 public static void main(String[] args) {
			int[] a= {1,-2,3,4,-5};
			
			int FMax=a[0];
			int SMax=a[0];
			int TMax=a[0];
			
			for (int i = 1; i < a.length; i++) {
				
					if (FMax<a[i]) {
						TMax=SMax;
						SMax=FMax;
						FMax=a[i];
					}
					else if (SMax<a[i] ) {
						TMax=SMax;
						SMax=a[i];
					}
					else if (TMax<a[i]) {
						TMax=a[i];
					}
				}
			System.out.println(FMax);
			System.out.println(SMax);
		    System.out.println(TMax);		
			}
	 }


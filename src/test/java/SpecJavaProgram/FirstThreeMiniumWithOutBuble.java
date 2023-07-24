package SpecJavaProgram;

public class FirstThreeMiniumWithOutBuble {

	 public static void main(String[] args) {
		 int[] a= {1,-2,3,4,-5};
		 
		
		int Fmin=a[0];
		int Smin=a[0];
		int Tmin=a[0];
		 
		for (int i = 1; i < a.length; i++) {
			if (Fmin>a[i]) {
				Tmin=Smin;
				Smin=Fmin;
				Fmin=a[i];
			}
			else if (Smin>a[i]) {
				Fmin=Smin;
				Smin=a[i];
			}
			else if (Tmin>a[i]) {
				Tmin=a[i];
			}
		}
		
		System.out.println(Fmin);
		System.out.println(Smin);
		System.out.println(Tmin);
	}
}

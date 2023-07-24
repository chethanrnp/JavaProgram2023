package ArrayJavaProgram;

public class FminAndSminWithoutBubble {

	public static void main(String[] args) {
		int a[]= {20,30,10,50,40};
		
		
		int Smin=a[0];
		int Smax=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(Smin>a[i]) {
				Smin=Smax;
				Smin=a[i];
			}
			else if (Smax>a[i]) {
				Smax=a[i];
			}
		}
		
		System.out.println(Smin);
		System.out.println(Smax);
	}

}

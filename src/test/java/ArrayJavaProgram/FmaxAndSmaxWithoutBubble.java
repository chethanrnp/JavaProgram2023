package ArrayJavaProgram;

public class FmaxAndSmaxWithoutBubble {

	 public static void main(String[] args) {
		 int a[]= {20,30,10,50,40};
		 
		int Fmax=a[0];
		 int Smax=a[0];
		 
		 for (int i = 1; i < a.length; i++) {
			if(Fmax<a[i]) {
				Fmax=Smax;
				Fmax=a[i];
			}
			else if (Smax<a[i]) {
				Smax=a[i];
			}
		}
		 System.out.println(Fmax);
		 System.out.println(Smax);
	}
}

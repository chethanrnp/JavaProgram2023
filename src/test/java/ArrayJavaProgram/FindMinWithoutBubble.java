package ArrayJavaProgram;

public class FindMinWithoutBubble {

	 public static void main(String[] args) {
		 int a[]= {20,30,10,50,40};
		 
		 int min=a[0];
		 
		 for (int i = 0; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		 System.out.println(min);
	}
}

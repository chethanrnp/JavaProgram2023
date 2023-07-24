package JavaProgram;

public class MinWithoutBubbleSort {

	 public static void main(String[] args) {
		int a[]= {5,8,2,8,4};
		int min=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}
}

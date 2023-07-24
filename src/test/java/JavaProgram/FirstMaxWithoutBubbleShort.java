package JavaProgram;

public class FirstMaxWithoutBubbleShort {

	 public static void main(String[] args) {
		int a[]= {7,8,4,9,3};
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		
		System.out.println(max);
	}
}

package JavaProgram;

public class MaxLengthOfStringTest {

	 public static void main(String[] args) {
		String str[]= {"che","chethan","Arya","Apple","Laptop-HP"};
		String max=str[0];
		
		for (int i = 0; i < str.length; i++) {
			if(max.length()<str[i].length())
				max=str[i];
		}
		
		System.out.println(max);
		
		for (int i = 1; i < str.length; i++) {
			if(max.length()==str[i].length())
				System.out.println(max);
		}
	}
}

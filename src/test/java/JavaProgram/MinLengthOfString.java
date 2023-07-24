package JavaProgram;

public class MinLengthOfString {

	 public static void main(String[] args) {
		String str[]= {"hello","hey","byee","Welcome","Tyss"};
		
		String min=str[0];
		
		for (int i = 1; i < str.length; i++) {
			if(min.length()>str[i].length())
				min=str[i];
		}
		System.out.println(min);
		
		for (int i = 1; i < str.length; i++) {
			if(min.length()==str[i].length()) 
				System.out.println(min);
		}
	}
}

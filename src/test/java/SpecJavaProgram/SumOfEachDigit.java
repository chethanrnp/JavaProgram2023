package SpecJavaProgram;

public class SumOfEachDigit {

	public static void main(String[] args) {
		String s="a1b2c34";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++) {
		
			if(Character.isDigit(s.charAt(i))) {
				sum=sum+(s.charAt(i)-48);
			}
			
		}

		 System.out.println(sum);
		 
		 //ORR
		 int su=0;
		 
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)>='0' && s.charAt(i)<='9') {
					su=su+(s.charAt(i)-48);
				}
			}
           System.out.println(su);
	}

}

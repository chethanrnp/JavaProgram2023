package StringJavaProgram;

public class StringMethod {

	public static void main(String[] args) {
		String s="Hello";
		String s1="Hello";
		String s2="hello";
		
		System.out.println(s1.contains("llo"));
		
		System.out.println(s1.contentEquals("llo"));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s.endsWith("lo"));
		
		System.out.println(s.isEmpty());
		
		System.out.println(s.isBlank());
	}

}

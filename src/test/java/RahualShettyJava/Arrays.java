package RahualShettyJava;

public class Arrays {

	public static void main(String[] args) {
		// stores values in array
		int[] a = { 1, 2, 3, 4, 5 };
		// to fetch data from array using for each
		for (int i : a) {
			System.out.println(i);
		}
		// Or
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		// or
		System.out.println(java.util.Arrays.toString(a));
		// to store string values in array
		String[] s = { "chethan", "Aray", "Ram" };
		// to get the addres of the array
		System.out.println(s);
		// to fetch data from the string array
		System.out.println(java.util.Arrays.toString(s));
	}
}

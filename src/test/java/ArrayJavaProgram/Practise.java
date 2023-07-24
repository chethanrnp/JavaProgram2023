package ArrayJavaProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Practise {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int max = a[0][0];
		int col = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (max < a[i][j]) {
					max = a[i][j];
					col = j;
				}
			}
		}
		System.out.println(max);
		System.out.println(col);
		int min = a[0][col];
		for (int i = 0; i < a.length; i++) {
			if (min > a[i][col]) {
				min = a[i][col];
			}
		}
		System.out.println(min);
	}
}

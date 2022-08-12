package array;

import java.util.Arrays;
import java.util.Scanner;

public class IntArrayPratice {
	
	public static int[] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int a = scan.nextInt();
		int b[] = new int[a];
		System.out.println("Please give "+a+" arrays:");
		for(int i = 0; i<a;i++) {
			b[i] = scan.nextInt();
		}
		return b;
	}
	
	public static int[] getSecondArray() {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the size of an second array: ");
		int a1 = scan1.nextInt();
		int b1[] = new int[a1];
		System.out.println("Please give "+a1+" arrays:");
		for(int i = 0; i<a1;i++) {
			b1[i] = scan1.nextInt();
		}
		return b1;
	}
	
	public static int[] printArray(int[] c) {
		System.out.print("The give arrays are: ");
		for(int x = 0;x < c.length;x++) {
			System.out.print(c[x]+" ");
		}
		return c;
	}
	
	public static int[] reverseArray(int[] d) {
		System.out.println();
		System.out.print("The reverse array are: " );
		for(int i = d.length-1; i>=0 ; i--) {
			System.out.print(d[i]+" ");
		}
		return d;
	}
	
	public static int[] sortArray(int[] e) {
		int f;
		System.out.println();
		System.out.print("The sort array are: ");
		for(int i = 0;i<e.length;i++) {
			for(int j = i;j<e.length;j++){
				if(e[i]>e[j]) {
					f = e[i];
					e[i] = e[j];
					e[j] = f;
				}
			}
		System.out.print(e[i]+" ");
	    }
		return e;
	}
	
	public static void compareTwoArray(int[] m, int[] n) {
		if(m.length != n.length) {
			System.out.println("The size of an two arrays are not same.");
		}
		else {
			int z=0;		
			for(int i = 0;i < m.length;i++) {
					if(m[i] == n[i]) {
						z++;
					}
			}
			if(z == m.length) {
				System.out.println("Two arrays are Same");
			}
			else {
				System.out.println("Two arrays are not Same");
			}
			
		}
	}

	public static void main(String[] args) {
//        printArray(getArray());
//        reverseArray(printArray(getArray()));
//		sortArray(printArray(getArray()));
		compareTwoArray(sortArray(getArray()), sortArray(getSecondArray()));
	}

}

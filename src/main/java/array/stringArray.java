package array;

import java.util.Arrays;
import java.util.Scanner;

public class stringArray {

		public static String[] getaStringArray() {

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an array length:");
	        int a = sc.nextInt();
			String ar[] = new String[a];
			// try {
			for (int i = 0; i < a; i++) {
				System.out.print("Enter the index " + i + " Value: ");
				ar[i] = sc.next();
			}
			return ar;
		}
		public static String[] printingaStringArray(String[] d) {
			
			for (int i = 0; i < d.length; i++) {
//				System.out.println("ENTERED VALUE IS:");
				System.out.println("Entered value is " + d[i] +" & "+ d[i+1]);
				break;
			}
			return d;
		}
		public static String[] reverseaStringArray(String[] d) {
			System.out.println("Reversed Array is: ");
			for (int i = d.length - 1; i >= 0; i--) {
				System.out.println( d[i]);
			}
			return d;
		}
		public static String[] getasecondStringArray() {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter an array length:");
			int a1 = sc2.nextInt();
			String ar2[] = new String[a1];

			for (int i = 0; i < a1; i++) {
				System.out.print("Enter the index " + i + " Value: ");
				ar2[i] = sc2.next();
			}
			return ar2;
		}
		public static String[] sortingaStringArray(String[] r) {
				Arrays.sort(r);
				System.out.println(Arrays.toString(r));
				return r;
			}
//				for (int j = i + 1; j < r.length; j++) {
//					String s = " ";
//					if (r[i].compareTo(r[j]))
//					{
//						s = r[i]; // value of s here is 2
//						r[i] = r[j]; // value of r[i] is 1
//						r[j] = s; // value of r[j] will be stored in s.
//
//					}
//
//				}
//			}
//			System.out.println("Sorted array is: ");
//			for (int i = 0; i < r.length; i++) {
//				System.out.println(Arrays.(r[i])); // the value will be printed once the condition passes and moves to next loop
//			}
//			return r;
//
//		}
//		public static void reverseaStringArray(String[] d, String n) {
//		{
//			String ar = new String[d];
//			int j = n;//If n = 2
//			for (int i = 0; i < n; i++) { //in for loop, the condition (i < 2) --> will pass and move to next line
//				ar[j - 1] = d[i]; // d[0] equals ar[2-1], i.e; ar[1]
//				j = j - 1; // j value will be j = 2-1 --> j = 1
//			}
//
//			// printing the reversed array
//			System.out.println("Reversed array is: \n");
//			for (int k = 0; k < n; k++) {
//	            System.out.println(ar[k]); 
//			}
//
//		}
//
//	}
		
		public static void main(String[] args) {
//			 getaStringArray();
//			 getansecondArray();
//			 printingaStringArray(getaStringArray());
//			 printinganArray(getanArray());
//			 intArray arr = new intArray();
//			 arr.iteratingArray();
//			 reverseaStringArray(printingaStringArray(getaStringArray()));
//			 reverseanArray(getanArray();
			 sortingaStringArray(getaStringArray());
//			 sortinganArray2(getasecondArray());
//			 comparetwoArrays(getanArray(), getasecondArray());

		}
}

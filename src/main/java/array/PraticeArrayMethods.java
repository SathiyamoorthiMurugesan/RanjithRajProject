package array;

import java.util.Arrays;

public class PraticeArrayMethods {
	
	public static int[] sortArray(int[] a) {
		Arrays.sort(a);
		System.out.print("The sort of the give array is: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}	
		return a;
	}
	
	public static int[] sortArray1(int[] a, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print("The sort of the give array is: ");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("The sort of the give array is: ");
		for(int i = 0; i< b.length; i++) {
			System.out.print(b[i]+" ");
		}
		return b;
	}
	
	public static int[] indexsort(int[] a) {
		Arrays.sort(a, 2, 5);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		return a;
	}
	
	public static int[] parallel(int[] a) {
		Arrays.parallelSort(a);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		return a;
	}
	
	public static int[] compareArray(int[] a,int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int c = Arrays.compare(a, b);
		if(c == 0)
		    System.out.println("The Result are same");
		else
			System.out.println("The arrray are not same");
		return a;
	}
	
	public static void nextArray(int[] a,int[] b) {
		int c = Arrays.compare(a, 2, 4, b, 2, 4);
		if(c == 0)
			System.out.println("The results are same");
		else
			System.out.println("The results are not same");
	}
	
	

	public static void main(String[] args) {
//		sortArray(UserInput.getIntArray());
//		sortArray1(ArrayPratice.getArray(),ArrayPratice.getSecondArray());
//	    indexsort(UserInput.getIntArray());	
//		parallel(UserInput.getIntArray());
//		compareArray(ArrayPratice.getArray(),ArrayPratice.getSecondArray());
//		nextArray(ArrayPratice.getArray(),ArrayPratice.getSecondArray());
	}

}

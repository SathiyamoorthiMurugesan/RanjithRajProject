package array;

import java.util.Scanner;

public class StringArrayPratice {
	
	public static String[] getArray() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int a = scan.nextInt();
		String[] b = new String[a];
		System.out.println("Please give "+a+" String arrays:");
		for(int i = 0; i<a;i++) {
			b[i] = scan.next();
		}
		return b;
	}
	
	public static String[] getSecondArray() {
		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter the size of an second array: ");
		int a1 = scan1.nextInt();
		String b1[] = new String[a1];
		System.out.println("Please give "+a1+" arrays:");
		for(int i = 0; i< a1;i++) {
			b1[i] = scan1.next();
		}
		return b1;
	}
	
	public static String[] printArray(String[] c) {
		System.out.print("The give arrays are: ");
		for(int x = 0;x < c.length;x++) {
			System.out.print(c[x]+" ");
		}
		return c;
	}
	
	public static String[] reverseArray(String[] d) {
		System.out.println();
		System.out.print("The reverse array are: " );
		for(int i = d.length-1; i>=0 ; i--) {
			System.out.print(d[i]+" ");
		}
		return d;
	}
	
//	public static String[] sortArray(String[] e) {
//		String f;
//		System.out.println();
//		System.out.print("The sort array are: ");
//		for(int i = 0;i<e.length;i++) {
//			for(int j = i;j<e.length;j++){
//				if(e[i]>e[j]) {
//					f = e[i];
//					e[i] = e[j];
//					e[j] = f;
//				}
//			}
//		System.out.print(e[i]+" ");
//	    }
//		return e;
//	}
	
	public static void compareTwoArray(String[] x,String[] y) {
		if(x.length != y.length) {
			System.out.println("The size of an two arrays are not same.");
		}
		else {
			int z=0;
			for(int i = 0;i < x.length;i++) {
				for(int j = 0;j < y.length;j++) {
					if(x[i].equalsIgnoreCase(y[j])) {
						z++;
						break;
					}
				}
			}
			if(z == x.length) {
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
        compareTwoArray(getArray(),getSecondArray());
	}

}

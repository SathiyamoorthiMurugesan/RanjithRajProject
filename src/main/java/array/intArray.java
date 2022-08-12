package array;

import java.util.Scanner;

public class intArray {
	static int a = 0;

	public static int[] getanArray() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an array length:");
		a = sc.nextInt();
		int ar[] = new int[a];
		// try {
		for (int i = 0; i < a; i++) {
			System.out.print("Enter the index " + i + " Value: ");
			ar[i] = sc.nextInt();
			// if (ar[i] > 4) {
			// break;
			// }
			// System.out.println("You entered an value " + ar[i]);
		}
		// }
		// catch (Exception e) {
		// System.out.println(e.getMessage());
		// }
		// finally {
		// System.out.println("End of an array");
		// }

		return ar;

	}

//     	public static int[] printinganArray() {
//     		Scanner sc = new Scanner(System.in);
//     		int a = sc.nextInt();
//     		int ar2[] = new int[a];
//		for (int i = 0; i < a ; i++) {
//			ar2[i] = sc.nextInt();
//			System.out.println("Printing the array values: ");
//			System.out.println(ar2[i]);
//		}
//		return ar2;
//		
//	}
	public static int[] printinganArray(int[] d) {
		for (int i = 0; i < d.length; i++) {
			System.out.println("ENTERED VALUE IS:");
			System.out.println(d[i]);
		}
		return d;

	}

	public static int[] reverseanArray(int[] d) {
		for (int i = d.length - 1; i >= 0; i--) {
			System.out.println(d[i]);
		}
		return d;
	}
	
//	public static void reverseanArray(int[] d, int n) {
//		{
//			int ar[] = new int[n];
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

	public static int[] getasecondArray() {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter an array length:");
		int a1 = sc2.nextInt();
		int ar2[] = new int[a1];

		for (int i = 0; i < a1; i++) {
			System.out.print("Enter the index " + i + " Value: ");
			ar2[i] = sc2.nextInt();
		}
		return ar2;
	}

//	public void iteratingArray() {
//		int ar[] = new int[3];
//		ar[0] = 10;
//		ar[1] = 20;
//		ar[2] = 30;
//
//		for (int i = 0; i < 3; i++) {
//			System.out.println(ar[i]);
//		}
//	}
	public static int[] sortinganArray(int[] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				int s = 0;
				if (r[i] > r[j])// if r[i] = 2 and r[j] = 1 , then r[i] will be stored in temporary variable
				{
					s = r[i]; // value of s here is 2
					r[i] = r[j]; // value of r[i] is 1
					r[j] = s; // value of r[j] will be stored in s.

				}

			}
		}
		System.out.println("Sorted array is: ");
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]); // the value will be printed once the condition passes and moves to next loop
		}
		return r;

	}

	public static int[] sortinganArray2(int[] r) {
		for (int i = 0; i < r.length; i++) {
			for (int j = i + 1; j < r.length; j++) {
				int s = 0;
				if (r[i] > r[j])
				{
					s = r[i]; 
					r[i] = r[j];
					r[j] = s; 
				}

			}
		}
		System.out.println("Sorted array type 2 is: ");
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]); // the value will be printed once the condition passes and moves to next loop
		}
		return r;

	}
	
//	public static int[] sortinganArray(int[] r) {
//		for (int i = 0; i < r.length; i++) {
//			for (int j = i + 1; j < r.length; j++) {
//				int s = 0;
//				if (r[i] < r[j])// if we change the condition we can print the descending order
//				{
//					s = r[i]; // value of s here is 2
//					r[i] = r[j]; // value of r[i] is 1
//					r[j] = s; // value of r[j] will be stored in s.
//
//				}
//
//			}
//		}
//		System.out.println("Sorted array type 2 is: ");
//		for (int i = 0; i < r.length; i++) {
//			System.out.println(r[i]); // the value will be printed once the condition passes and moves to next loop
//		}
//		return r;
//}

//	public static int[] comparetwoArrays(int[] d, int[] d1) {
//
//		if (d.length != d1.length) {
//			System.out.println("Array lengths are not same");
//		}
//		if (d.length == d1.length) {
//			{
//				for (int i = 0; i > d.length; i++) {
//
//					for (int j = 0; j < d1.length; j++) {
//						if (d[i] == d[j]) {
//							
//						}
//						System.out.println("Values are same");
//					}
//				}
//			}
//			System.out.println("Array lengths are same");
//			{
//				for (int i = 0; i > d.length; i++) {
//					for (int j = 0; j < d1.length; j++) {
//						if (d[i] != d[j]) {
//							System.out.println("Values are not same");
//						}
//					}
//				}
//			}	
//		}
//
//		return d;
//	}

//	public static int comparetwoArrays(int[] d, int[] d1) {
//        int n1 = 0;
//		if (d.length != d1.length) {
//			System.out.println("Array lengths are not same");
//		} 
//		else if (d.length == d1.length) {
////			int k = 0;
////			for (int i = 0; i > d.length; i++) {
////				for (int j = 0; j < d1.length; j++) {
////					if (d[i] == d[j]) {
////						k++;
////						// System.out.println("Values are same");
////						break;
////					}
//////					else {
//////						System.out.println("Values are not same");
//////					}
////				}
//
////			}
//			System.out.println("Size of an Arrays are same");
//			}
//		for (int i = 0; i > d.length; i++) {
//			for (int j = 0; j < d1.length; j++) {
//			switch(d.length) {
//			case (d[i],d1[j]):
//			
////					for (int i = 0; i > d.length; i++) {
////				for (int j = 0; j < d1.length; j++) {
////					if(d[i] == d[j])
//						System.out.println("Values are same");
//			break;
//			default:
//						System.out.println("Values are not same");
//					}}
//		}
//
////						System.out.println("Values are not same");
////			}
//		return n;
//
//	}
	public static int[] comparetwoArrays(int[] d, int[] d1) {
		if (d.length != d1.length) {
			System.out.println("Length of an Arrays are not same");
		} else {
			System.out.println("Length of an Arrays are same");
			int s = 0, t=0;
				for (int i = 0; i < d.length; i++) {
			
					if (d[i] == d1[i]) {
						s++;
					} }
					
//			}
//				
//				}
//			
//					{for(int j=0; j<d1.length;j++) {
//						if(d[j] != d1[j])
//						{
//							t++;
//					}
//						
//					}
//					System.out.println("Values are not same");}
//					
//		}

	
			if(s == d.length)
			{
				System.out.println("The values in the array are same");
			}
			else{
				System.out.println("The values in the array are different");
			}
		}
			return d;
}
		

	public static void main(String[] args) {
//		 getanArray();
//		 getansecondArray();
//		 printinganArray();
//		 printinganArray(getanArray());
//		 intArray arr = new intArray();
//		 arr.iteratingArray();
//		 reverseanArray(getanArray(),2);
//		 reverseanArray(getanArray();
//		 sortinganArray(getanArray());
//		 sortinganArray2(getasecondArray());
//		 comparetwoArrays(getanArray(), getasecondArray());

	}
}
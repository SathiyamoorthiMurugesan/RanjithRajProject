//	* Container object that holds the fixed number of values of a same datatype
//	* In Java, array is a data type
//	* It also holds String (non-primitive data type)
//	* Array index always starts with zero
//	* We declare array with below values 
//		* int arr[] = new int[5]; 
//			OR int[] arr = new int[5];
//			OR int[] arr = new int[] {1, 2, 3, 4, 5};
//			OR int arr[] = {1, 2, 3, 4, 5};
//			OR int[] arr = {1, 2, 3, 4, 5};
//		* int - daya type
//		* [] - array
//		* arr - array variable
//		* new - key word in java
//		* 5 - size

//	* We can not directly sysout array. For that, we need to use either Arrays class or for loops
//		* Arrays is a pre-defined class in Java.
//		* It contains many static methods to manipulate and access array elements

//	* user defined array variable provides us, clone method and length variable
//		* clone method - helps us to copy an array
//		* length variable is used to get the size of the array

package array;

import java.util.Arrays;
import java.util.Scanner;

public class DemoArray1 {

	public void gettingArrayValues() {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
//		ar[3] = 40;
//		ar[4] = 45;

		System.out.println(ar);

		System.out.println(ar.toString());

	}

	public void retrievingArrayString() {
		String[] ar1 = { "Anu", "Abi", "Ram" };
		System.out.println(ar1);
		System.out.println(ar1.toString());
		
		System.out.println(ar1[0]);
		String str = ar1[2];
	}

	public void iteratingArray() {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		for (int i = 0; i <= ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public void cloneIntArray() {
		int ar[] = new int[3];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;

		int[] cloneArrya = ar.clone();

		for (int i = 0; i < cloneArrya.length; i++) {
			System.out.println(cloneArrya[i]);
		}
	}

	public void arrayLength() {
		int len[] = { 1, 2, 3, 4, 5 };
		System.out.println(len.length);
	}
	
	public int getArrayLength() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter length of the array: ");
		return scan.nextInt();
	}
	
	public int returnSingleValueFromarray() {
		int a = 10;
		int b = 10;
		int len[] = { 1, 2, 3, 4, 5 };
		System.out.println(len.length);
		return len[4];
//		return b;
		
	}
	
	public int[] returnarray() {
		int len[] = { 1, 2, 3, 4, 5 };
		System.out.println(len.length);
		return len;
		
	}
	
	public void getArrayUser() {
		Scanner s = new Scanner(System.in);
		String name[]= new String[3];
		System.out.println("Enter the name for the class");
		for(int a=0;a<name.length;a++)	{
			System.out.println(s.next());
		}
		System.out.println("Received the names of the student");
		
	}
	
	public void getIntArrayFromUser() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter int array size: ");

		int arrayS = scan.nextInt();

		System.out.println("Please enter " +arrayS+ " numbers");

		int arr[] = new int[3];

		for(int i=0;i<arrayS;i++) {
			arr[i] = scan.nextInt();
		}
	}

	public void iteratingArrayUsingForEachLoop() {
		String[] ar1 = { "Anu", "Abi", "Ram" };
		for (String eachValueOfStringArrayAr1 : ar1) {
			System.out.println(eachValueOfStringArrayAr1);
		}

	}

	public static void main(String[] args) {
		DemoArray1 d = new DemoArray1();
//		System.out.println(d);
//		d.gettingArrayValues();
//		d.retrievingArrayString();
//		d.iteratingArray();
		d.getIntArrayFromUser();
//		d.iteratingArrayUsingForEachLoop();
//		d.cloneIntArray();
//		d.arrayLength();
//		d.getArrayUser();
//		d.returnarray();
		
		Arrays
	}

}

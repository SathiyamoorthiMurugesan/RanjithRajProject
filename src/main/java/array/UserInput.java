package array;

import java.util.Scanner;

public class UserInput {
	
	public static int[] getIntArray() {
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
	
	public static String[] getStringArray() {
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

}

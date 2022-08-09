package scannerPractice;

import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Your Entered value is "+a);
		
		
		System.out.println();
		System.out.println();
		
		
		System.out.print("Enter a String : ");
		String name = scan.next();
		System.out.println("This is your name: "+name);
		
		System.out.println();
		
//		String str = "Processing "SQL" Statements with JDBC";
		
//		String str = "Processing "+"SQL"+" Statements with JDBC";


	}

}

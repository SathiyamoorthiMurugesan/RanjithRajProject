package ifLoop;

import java.util.Scanner;

//1) single if
//2) if else 
//3) if, else if, else if, else
//4) if, if, if
//5) if(condition1 || condition2 || condition3) 
//6) if(condition1&&condition2&&condition3)
//7) if (condition1)
//		content
//		if (condition2)
//			content
public class IfPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		1) Obect creation - why its need, what happens if we create object, different object creation
//		2) Scanner constructor
//		3) parameter 
//		4) static
		System.out.print("Please enter a number : ");
		int a = scan.nextInt();

		System.out.print("Please enter second number : ");
		int b = scan.nextInt();

		System.out.print("Please enter third number : ");
		int c = scan.nextInt();

		if (a > b) {
			if (a > c) {
				System.out.println(a + " is greater");
			}
		} else if (b > c) {
			System.out.println(b + "is greater");
		} else
			System.out.println(c + "is greater");
	}
}

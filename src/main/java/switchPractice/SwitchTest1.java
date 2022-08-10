package switchPractice;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		SwitchTest1 t = new SwitchTest1();
//		t.getANumber();
//		t.method(t.getANumber());
		
		int c = t.getANumber();
		t.method(c);
		
		t.checkANumber(t.getANumber());
		
	}
	
	public int getANumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int amount = sc.nextInt();
		return amount;
	}
	
	public static void checkANumber(int a) {
		if(a>10) {
			System.out.println(" its greater than 10");
		}
		else 
			System.out.println("less than 10");
	}
	
	public void method(int a) {
		switch(a) {
		case 1:
			System.out.println("Buy chocolate");
			break;
		case 5:
			System.out.println("Buy snacks");
			break;
		case 50:
			System.out.println("Buy rice");
			break;
		default:
			System.out.println("Please enter 1 or 5 or 50");
		}
	}
}

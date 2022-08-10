package forLoopsInJava;

//for(initialize; condition; increment/decrement) {
//}
//
//for(initialize; condition) {
//increment/decrement;
//}

public class ForLoopBasic {
	
	

	public static void main(String[] args) {

//		for(int a = 1; a <= 10; a++) {
//			System.out.println(a);
//		}

		for (int a = 26; a < 31;) {
			System.out.println(a);
			a++;
		}

		System.out.println("for loop");
		
		int c = 0;
		int b; 
		int d = 1;
		
		method1();
		method1();
		method1();
		method1();
		method1();
		
		for(b = 10; b<=14;b++) {
			c = 100;
			int s = 10;
			d = s;
			method1();
		}
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

	public static void method1() {
		System.out.println("I am method1");
	}

}
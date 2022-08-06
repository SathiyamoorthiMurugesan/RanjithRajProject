package keywordsInJava;

public class ThisPractice1 {
	
	int amount;
	int num = 100;
	
	public void buySoap(int amount) {
		this.amount = amount;
		amount = this.amount;
	}
	
	public void buyRice() {
		int amount = 100; 
		this.amount = amount;
		System.out.println(this.num);
		System.out.println(num);
		
	}
	
	public void buyShampoo(int shampooAmount) {
		amount = shampooAmount;
		this.amount = shampooAmount;
	}
	
	public void method1() {
		System.out.println("I am method1");
	}

	public void method2() {
//		method1();
//		method4();
		this.method1();
		this.method4();
		System.out.println("I am method2");
	}
	
	public static void method3() {
		ThisPractice1 thisTest = new ThisPractice1();
		thisTest.method1();
		System.out.println("I am static method3");
	}
	
	public static void method4() {
//		method3();
		System.out.println("I am static method4");
	}
	
	
	public static void main(String[] args) {
		ThisPractice1 thisTest1 = new ThisPractice1();
		thisTest1.buySoap(100);
	}

}

package keywordsInJava;

public class SuperPractice extends Parent{
	
	int amount = 200;
	
	public SuperPractice() {
//		this(10);
		super("ab");
//		super(1);
//		this();
		System.out.println("I am child class default constructor");
	}
	
	public SuperPractice(int a) {
		System.out.println("I am child class int constructor");
	}

	public void method1() {
		System.out.println("I am child class method1");
	}

	public void method2() {
		System.out.println("I am child class method2");
	}
	
	public void test1() {
//		Parent test = new SuperPractice();
//		test.method2();
//		
//		Parent pa = new Parent();
//		pa.method2();
//		
//		SuperPractice su = new SuperPractice();
//		su.method2();
//		
//		super.method2();
//		
		System.out.println(amount);
		
		System.out.println(super.amount);
	}

	public static void main(String[] args) {
		SuperPractice test = new SuperPractice();
		test.test1();
	}

}

class Parent {
	
	public Parent() {
		System.out.println("I am parent class default constructor");
	}
	
	public Parent(String str) {
		System.out.println("I am parent class String constructor");
	}
	
	int amount = 100;

	public void parentMethod() {
		System.out.println("I am child class parentMethod");
	}

	public void method2() {
		System.out.println("I am parent class method2");
	}

}

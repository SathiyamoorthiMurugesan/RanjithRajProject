package keywordsInJava;

public class StaticBasic {

//		* static is a keyword in java
//		* It can be used with both methods and variables
//		* static variables and methods are belongs to class
//		* This means, we don't need to create Object of an class to access static methods and variables inside a class
//		* In order to use the static variables and methods inside of a class, we can simply call the varible and method names.
//		* In order to use the static variables and methods outside of a class, we need to access it using it's respective Class Name
//		* static will be stored in heap memory
//		* we can not declare static variable inside a static or non static method 
//			* because scope of variable declared inside a method ends once method get executed. (method behavior)
//			* static means, it belongs to the class, mean it can be accessed by any methods of the class or other class (static behavior)
//			* Since method and static having exactly opposite behavior, we cant use static inside any method
	
//	After OOPS concept
//		* If we keep all the methods and variables of an class as static, that class is called tightly encapsulated class
//		* we can overload a static method but we can not override a static method

	
	
	int a = 10;
	static int b = 20;
	
	public void method1() {
		System.out.println("I am a non-static, non parameterized method");
	}
	
	public void methodTest() {
		StaticBasic obj1 = new StaticBasic();
		System.out.println(a);
		obj1.method1();
		method1();
	}
	
	public static void method2() {
		System.out.println("I am a static, non parameterized method");
	}
	
	public void buySoap(int amount) {
		System.out.println("I bought the soap for rupees "+amount);
//		System.out.println(amount);
	}
	
	public static void buySoap(int amount, String soapName) {
//		System.out.println("I bought the given soap for the given amount");
		System.out.println("I bought "+soapName+" soap for rupees "+amount);
	}
	
	public void staticVariableTesting() {
		int count = 10;
//		static int test = 100;
	}
	
	public static void main(String[] args) {
		StaticBasic obj1 = new StaticBasic();
		System.out.println(obj1.a);
		System.out.println(b);
		
		obj1.method1();
		method2();
		
		obj1.buySoap(100);
		buySoap(10, "Lux");
	}
	
	

}

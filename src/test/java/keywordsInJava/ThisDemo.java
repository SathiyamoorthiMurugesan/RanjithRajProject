//* this. keyword is used to call instance/class variables and methods
//	* We can use this., to differentiate run time variables/local variable from instance variables;
//	* Also by using this., we can assign runtime values to instance variables


//* We can use this(), to call other constructors from any constructors
//* this() should be used within a constructor only. Means, we can not use it in methods.
//* this() MUST be first statement in constructor calling
//		- Constructor call must be the first statement in a constructor
//* since this should be used as first line in constructor, we can not call more than one constructor from a constructor.
//* When we call a non static method from a non static method in a same class, "this.." is used implicitly while calling
//	* calling a  method(), is same as this.method() with in a same class. Only for calling non-static from static, we need to create object

//* within a class, 
//	1) we can simply call static method from another static method (this keyword is applied implicitly)
//	2) We can simply call non-static method from another non-static method (this keyword is applied implicitly)
//	3) We need to create object to call a non-static method from a static method
//	4) We can simply call static method from non-static method (this keyword is applied implicitly)


package keywordsInJava;

public class ThisDemo {
	
	public int num = 20;
	public int test = 44;
	
	public ThisDemo(int num) {
		this("Anu");
		this.num = num;
		num = this.num;
		int a = 10;
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.num);
	}
	
	
	public ThisDemo(String str) {
		System.out.println(num);
		
	}
	
	public ThisDemo() {
		this(30);
	}


	public void method1() {
		System.out.println(num);
		System.out.println(test);
		System.out.println(this.test);
		System.out.println(this.num);
		System.out.println("This is method1");
	}
	
	public void method2() {
		ThisDemo test = new ThisDemo(50);
		ThisDemo test1 = new ThisDemo();
		test.method1();
		System.out.println("This is method2");
		this.method1();
		method1();
		method4();
		this.method4();
	}

	public static void main(String[] args) {
//		this.test=30;
		method4();
		ThisDemo test = new ThisDemo(50);
		test.method1();
		

	}
	
	public static int method3(int num) {
		System.out.println(num);
//		System.out.println(test);
//		System.out.println(this.num);
		System.out.println("This is static method3");
		return num;
	}
	
	public static void method4() {
		System.out.println("This is static method4");
		method3(5);
	}

}

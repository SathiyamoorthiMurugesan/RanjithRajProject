//* final is a keyword in java
//* final can be used with variable, method and class
//* final can not be used with interface. There is no point in using final with interface
//* variables declared in interface are final in nature
//* If we declare a variable as final, the value of the variable can not be changed ANYWHERE
//* If a method is declared as final, then we can not override it
//* If a method is declared as final, then we can overload it
//* If we use final keyword with a class, no class can inherit(extend) it
//		e.g String class in Java--> String is a final class in java
//* Variable/method can be declared as final in both static and non static methods
//*	Variables declared as final in class level must be initialized whereas
//*	variables declared as final inside a method need not be initialized

package keywordsInJava;

public class FinalDemo extends ParentFinalDemo {

	public final static int a = 10;
	public static final int b = 11;
	static public final int c = 12;
	public int d = 10;
//	public final int ddd;
	public final int dd=100;
	

	final static public void method1() {
		final int a1 = 13;
		System.out.println("Value of a1 is " + a1);
//		b=20;
//		c=20;
//		d=20;

	}

	final static public void method2(int x) {
		System.out.println("value of x is: " + x);
	}

	final static public void method2(int x, int y) {
		System.out.println("Value of x and y is" + x + " " + y);
	}

	public void method2() {
		final int b1 = 14;
		final int bb1;
		bb1=30;
//		bb1=40;
		System.out.println("Value of a1 is " + b1);
//		a=20;
		super.method2();
		System.out.println(super.b);

	}

	public static void main(String[] args) {
		method1();
		method2(20);
		method2(30, 40);
		FinalDemo f = new FinalDemo();
		f.method2();
		System.out.println(b);
		System.out.println(f.d);
//		ParentFinalDemo p= new FinalDemo();
//		p.method2();
//		System.out.println(p.b);	
		System.out.println(ParentFinalDemo.a);

	}

}

//final class ParentFinalDemo	{
//class ParentFinalDemo extends String {
class ParentFinalDemo {

	public final static int a = 15;
	int b = 16;

//		 final static public void method1() {
//				
//			 System.out.println("Parent final method1");
//			}

	public void method2() {
		System.out.println("Parent class non-static method");
		System.out.println(a);
	}
}

package interfaceInJava;

//Interface can have only abstract methods.
//Means we can not implement any methods or put body for an method in interface
//We can declare variables in interface
//We can not create Object for Interface because it only has Abstract methods. Also we can create object only for classes not for interfaces
//Interface can not have constructors.
//If a class wants to inherit the property of an Interface, we need to use "implements" keyword.
//If we want to link a interface with another interface, we need to use "extends" keyword.
//Whenever a class implements an interface, it will force us to implement all the unimplemented methods in our class
//We can not create variables or methods with protected or private access modifiers

//We can not create a static abstract method in an interface
//Interface let us to have methods with body but those methods should be either static or default method
//We can have static method in interface but we cannot use it in any implemented class
//We can access default method in implemented class by using object

public interface LearnInterface {

	int a = 10;
	public int b = 10;
//	private int c = 10;
//	protected int d = 10;

	static int a1 = 10;
	static public int b1 = 10;
//	static private int c1 = 10;
//	static protected int d1 = 10;

//	int f;
	
//	LearnInterface obj1 = new LearnInterface();

	public void rule1();
//	abstract method
	
//	public static rule4();

	public static void rule2() {
		System.out.println("I am static method from interface");
	}

	default void rule3() {
		rule2();
		System.out.println("I am default method from interface");
	}

}

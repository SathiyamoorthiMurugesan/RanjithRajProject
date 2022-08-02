package inheritanceInJava;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

public class LearnInheritance implements InheritanceInterface1{
	
//	Parent class/ Super class
//	Child class/ Sub class
	
//	Inheritance is the property of using the parent class variables/methods in child class
//	extends and implements are the java keywords, used to achieve inheritance.
//	For Class to Class inheritance - we use extends keyword 
//		1) Ex: Exception class extends Throwable class
//	For Class to interface inheritance - we use implements keyword 
//		1) Ex: Throwable class implements Serializable interface
//	Multiple inheritance in Java 
//		1) is not possible by using Classes alone. So below line wont work
//			a) ClassA extends ClassB, ClassC, etc... 
//		2) is possible by using interfaces alone.
//			a) ClassA implements interface1, interface2, etc..
//		3) is possible by using classes and interface together. In this case, class name should be mentioned at first
//			a) ClassA extends ClassB implements interface1, interface2, interface3
//			b) ClassA implements interface1, interface2 extends ClassB - THIS IS NOT RIGHT ORDER TO WRITE
//	Multilevel inheritance in Java
//		1) is possible 
//			a)classA extends ClassB, ClassB extends ClassC
	
//	public class Test1 extends Test2, Test3; - In Java This is not possible
//	public interface abc1 extends abc2, abc3; - In Java this is possible
//	public class Test1 extends Test2 implements abc1, abc2; POSSIBLE
//	public class Test1 extends Test2, Test3 implements abc1, abc2; NOT POSSIBLE
//	public class Test1 implements abc1, abc2; POSSIBLE
//	Public class Test1 implements abc1, abc2 extends Test2; NOT POSSIBLE

//	Diamond problem
//		ClassA extends ClassB
//		ClassB extends ClassC
//		ClassC extends ClassA
	
//	Where do we use multiple inheritance
//	public class ArrayList<E> extends AbstractList<E> implements List<E>, RandomAccess, Cloneable, java.io.Serializable

//	Where do we use multilevel inheritance
//	public class ArithmaticException extends Exception;
//	public class Exception extends Throwable;
//	public class Throwable implements Serializable;

	public static void main(String[] args) {
		
//		InheritanceInterface1 obj1 = new InheritanceInterface1();
		
		LearnInheritance obj2 = new LearnInheritance();
		obj2.interfaceMethod1();
		obj2.interfaceMethod2();
		obj2.testMethod1();
		
		Exception obj1 = new Exception();
		Exception obj12;
		Exception e;
		
		ArithmeticException ae;

	}
	
	
	public void testMethod1() {
		System.out.println("This is child class test method");
	}

	@Override
	public void interfaceMethod1() {
		System.out.println("I am method from interface but implemented in child Class");
	}

}

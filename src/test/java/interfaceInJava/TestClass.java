package interfaceInJava;

import constructor.TestConstructor;

public class TestClass extends TestConstructor implements Interface2 {

	public static void main(String[] args) {
		LearnInterface obj1 = new TestClass();
		Interface2 obj2 = new TestClass();
		TestClass obj3 = new TestClass();
		obj3.rule3();
		obj1.rule3();
		
//		TestConstructor test = new TestConstructor();
	}

	@Override
	public void rule1() {
		LearnInterface.rule2();
	}

	@Override
	public void test1() {
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		
	}

}

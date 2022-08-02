package inheritanceInJava;

public class InheritanceDemo2 extends InheritanceDemo1{
	
	int a = 100;
	String str1 = "abc";
	
	static int b = 20;
	static String str2 = "abcd";
	
	public void childMethod1() {
		int a =10;
		System.out.println("I am non-static, non-parameterized child method");
	}
	
	public void childMethod2(int a) {
		System.out.println("I am non-static, parameterized child method2");
	}
	
	void method1() {
		
	}
	
	public static void childMethod3(String abc) {
		System.out.println("I am static, parameterized child method3");
	}
	
	public static void childMethod4(int a, int b) {
		System.out.println("I am static, two parameterized child method4");
	}
	


	public static void main(String[] args) {
		
		InheritanceDemo2 obj1 = new InheritanceDemo2();
		obj1.Parentmethod1();
		obj1.childMethod1();
		
		childMethod3("abc");
		Parentmethod3("aaa");
		InheritanceDemo1.Parentmethod3("aa");
		
		InheritanceDemo1 parentObj = new InheritanceDemo1();
		parentObj.Parentmethod1();
		
		InheritanceDemo1 childParentObj = new InheritanceDemo2();
		childParentObj.Parentmethod1();
		
//		InheritanceDemo2 parentChildObj = new InheritanceDemo1();
		

	}

}

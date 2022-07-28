package keywordsInJava;

public class StaticBasic2 {
	
	
	public StaticBasic2() {
		
	}
	
	int a = 100;
	static int b = 200;
	String str = "ABC";
	
	public void method1() {
		System.out.println("I am a non-static, non parameterized method");
	}
	
	public static void method2() {
		System.out.println("I am a static, non parameterized method");
	}
	
	
	public void practice1() {
		StaticBasic2 obj1 = new StaticBasic2();
		System.out.println(obj1.a);
		System.out.println(b);
		
		obj1.method1();
		method2();
	}
	
	public static void practice2() {
		StaticBasic2 obj1 = new StaticBasic2();
		System.out.println(obj1.a);
		System.out.println(b);
		
		obj1.method1();
		method2();
	}
	
	public void callValuesAndMethodsFromAnotherClass() {
		StaticBasic obj1 = new StaticBasic();
		System.out.println(obj1.a);
		obj1.method1();
		System.out.println(b);
		System.out.println(StaticBasic.b);
		StaticBasic.method2();
	}
	
	public static void main(String[] args) {
		StaticBasic2 obj2 = new StaticBasic2();
		obj2.practice1();
		
		practice2();
		obj2.callValuesAndMethodsFromAnotherClass();
		
		StaticBasic obj1 = new StaticBasic();
		System.out.println(obj1.a);
		System.out.println(b);
		System.out.println(StaticBasic.b);
		
		System.out.println(obj2.str.length());
	}

}

package constructor;

public class ConstructorDemo2 {
	
	int a;
	
	public ConstructorDemo2() {
		a = 20;
	}
	
	public ConstructorDemo2(int i) {
		a = i;
	}

	public void method1() {
		a = 10;
		System.out.println(a);
	}
	
	public void method2() {
		System.out.println(a=a+6);
	}

	public static void main(String[] args) {
		ConstructorDemo2 d = new ConstructorDemo2();
		d.method1();
		System.out.println(d.a);
		d.method2();
		
		ConstructorDemo2 D1 = new ConstructorDemo2();
		System.out.println(D1.a);
		
		ConstructorDemo2 D2 = new ConstructorDemo2(10);
		System.out.println(D2.a);
		D2.method2();
	}

}


class DemoConst {
	
}
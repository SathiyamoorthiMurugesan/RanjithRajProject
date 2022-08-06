package blocksInjava;

public class StaticBlock {
	
	static {
		int a = 10;
//		static int b = 20;
		final int c = 1;
		
		test1();
//		buySoap();
		System.out.println("I am static block");
	}
	
	public static void test1() {
//		System.out.println(a);
		System.out.println("I am static method");
	}
	
	public void buySoap() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		System.out.println("Main method");
		StaticBlock test = new StaticBlock();
		test.buySoap();
	}

}

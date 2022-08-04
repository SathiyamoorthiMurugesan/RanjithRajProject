package constructor;

public class TestConstructor extends demoC{

//	public TestConstructor() {
//		System.out.println("I am default child Constructor");
//	}
//	
	public TestConstructor(int a) {
//		super();
		super(10);
		System.out.println("I am int constructor");
	}

//	private TestConstructor() {
//		System.out.println("Helloooo");
//	}

//	protected TestConstructor() {
//		System.out.println("Helloooo");
//	}
//	
//	TestConstructor() {
//		System.out.println("Helloooo");
//	}

	int a = 10;
	static String abc = "str";

	public static void main(String[] args) {
		TestConstructor test = new TestConstructor(10);
		System.out.println(test.a);
		
//		demoC dc = new demoC();
	}

}

class demoC {

//	public demoC() {
//		System.out.println("I am default parent Constructor");
//	}
	
	public demoC(int a) {
		System.out.println("I am parameterized parent Constructor");
	}
	
	public demoC(String a) {
		System.out.println("hello");
	}
	
}

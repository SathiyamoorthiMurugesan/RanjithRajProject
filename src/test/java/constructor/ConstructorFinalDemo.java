package constructor;

public class ConstructorFinalDemo {
	
	final int a;
	
	public ConstructorFinalDemo() {
		a = 100;
	}
	
	public ConstructorFinalDemo(int a) {
		this.a = a;
	}
	
	public void method1() {
//		a = 10;
	}

	public static void main(String[] args) {
		ConstructorFinalDemo test = new ConstructorFinalDemo(200);
		ConstructorFinalDemo test1 = new ConstructorFinalDemo(220);
		System.out.println(test1.a+100);
		
	}

}

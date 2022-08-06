package keywordsInJava;

public class ThisMethod {
	
	int amount;
	
	public ThisMethod() {
		System.out.println("I am default method");
	}
	
	public ThisMethod(int amount) {
		this(); //constructor calling
		this.amount = amount;
//		this();
		System.out.println("Single parameter");
	}
	
	public ThisMethod(int amount, String name) {
		this();
//		this(10);
		System.out.println("Double parameter");
//		this();
	}
	
	public void method1() {
//		this();
	}

	public static void main(String[] args) {
		ThisMethod m1 = new ThisMethod(100);
		
//		ThisMethod m2 = new ThisMethod(100, "Lux");
//		System.out.println(m2.amount);
		
	}

}

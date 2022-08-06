package keywordsInJava;

public class ThisTesting {

	public ThisTesting() {
		this(10);
		System.out.println("This is default constrcutor");
	}

	public ThisTesting(int a) {
		this("abv");
		System.out.println("This is int constructor");
	}

	public ThisTesting(String str) {
		this(10,10);
		System.out.println("This is String constructor");
	}

	public ThisTesting(int a, int b) {
		System.out.println("This is int, int constructor");
	}

	public static void main(String[] args) {
//		ThisTesting test = new ThisTesting();
		
		ThisTesting test = new ThisTesting(10);
	}

}

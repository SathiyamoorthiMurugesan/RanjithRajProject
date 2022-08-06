package basicConcepts;

public class WhyMainMethod {
	
//	* JVM always looks for main method in given format (Thats how JVM is created)
//	* main method is a parameterized method. String[] is data type and args is variable name of array of String.
//	* With out main method we can not run Java programs
//	* We can overload main method
//	* The reason for main method is static because, JVM dont need to create object in order to use main method.
//	* We can write public static or static public. The order is not a problem
//	* If we run java application without main method, we will get Error as, Main method not found.

	public static void main(String[] args) {

	}

//	static public void main(String[] args) {
//		System.out.println("Hello");
//	}

	public static void main() {

	}
	
	public static void main(int a) {
		
	}

}

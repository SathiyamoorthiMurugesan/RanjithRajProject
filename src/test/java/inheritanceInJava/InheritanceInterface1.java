package inheritanceInJava;

public interface InheritanceInterface1 {
	
	int a =10;
	
	public void interfaceMethod1();
	
	default void interfaceMethod2() {
		System.out.println("I am default method from inheritanceInterface1 interface");
	}
	

}

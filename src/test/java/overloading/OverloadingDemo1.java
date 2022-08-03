package overloading;


//* Its based on method signature
//	* Method name should be same
//	* Parameters should vary
//		* Type of parameter
//		* Order of parameter
//		* No. of parameter
//* It happens within a Class
//* Compile time polymorphism
//* return type is secondary in overloading. 
//		* Means, if two methods have same method signature and have different return types then we will see error as duplicate method.
//* We can overload static method


public class OverloadingDemo1 {
	
	int a;
	String str;
	float f;
	double d;
	long l;
	
	public void buySoap() {
		System.out.println("Buy soap");
	}
	
//	private void buySoap() {
//		System.out.println("Buy soap");
//	}
	
//	public String buySoap(String soapName) {
//		System.out.println("Buy soap");
//		return soapName;
//	}
	
	public void buySoap(String soapName) {
		System.out.println("Buy "+soapName+ " soap");
	}
	
	public void buySoap(int soapAmount) {
		System.out.println("Buy soap for "+soapAmount);
	}
	
	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy "+soapName+ " for amount "+soapAmount);
	}
	
	public void buySoap(int soapAmount, String soapName) {
		System.out.println("For amount "+soapAmount+ ", buy "+soapName+" soap");
	}

	public static void main(String[] args) {
		
		OverloadingDemo1 od = new OverloadingDemo1();
		
		System.out.println(od.a);
		System.out.println(od.str);
		System.out.println(od.f);
		System.out.println(od.d);
		System.out.println(od.l);
		od.buySoap();
		od.buySoap("Lux");
		od.buySoap(50);
		od.buySoap(20, "Lux");
		od.buySoap("Lux", 100);

	}

}

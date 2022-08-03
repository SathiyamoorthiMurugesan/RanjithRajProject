package overloading;

public class OverloadingStaticDemo {
	
	public static void buySoap() {
		System.out.println("Buy soap");
	}
		
	public static void buySoap(String soapName) {
		System.out.println("Buy "+soapName+ " soap");
	}
	
	public static void buySoap(int soapAmount) {
		System.out.println("Buy soap for "+soapAmount);
	}
	
	public static void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy "+soapName+ " for amount "+soapAmount);
	}
	
	public static void buySoap(int soapAmount, String soapName) {
		System.out.println("For amount "+soapAmount+ ", buy "+soapName+" soap");
	}

	public static void main(String[] args) {
		buySoap();
		buySoap(10);
		buySoap("lux");
	}

}

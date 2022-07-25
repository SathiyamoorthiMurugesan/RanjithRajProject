package day4ObjectCreation;

public class Purchase {

	public void buySnacks() {

	}

	public void buySoap() {

	}

	public int buyOneSoap() {
		return 100;
	}

	public String buyLuxSoap() {

		return "Lux";
	}

	public void buySoap(int amount) {
		
	}
	
	public void buySoap(String soapName) {

	}
	
	int soapAmount = 10;
	
	/*
	 * public String buySoap(int amount, String soapName) { // amount =100;
	 * soapAmount = amount; // soapName = "Lux"; return soapName;
	 * 
	 * }
	 */	
	public void buySoap(int amount, String soapName) {
//		amount =100;
		soapAmount = amount;
//		soapName = "Lux";
		
		
		
	}

	void buyRice() {
		System.out.println(soapAmount);
	}

	public static void buyShampoo() {

	}
	
	public static void main(String[] args) {
		Purchase obj1 = new Purchase();
//		System.out.println(obj1.buySoap(100, "Lux"));
		obj1.buySoap(100, "Lux");
		obj1.buyRice();
	}

	/*
	 * WE SHOULD NOT CREATE A METHOD INSIDE ANOTHER METHOD. Instead we can call another method from/inside a method
	 * WE SHOULD NOT BE USING JAVA PRE-DEFINED KEYWORDS as a variable/method or Class name
	 * public, default, protected, private - access modifier void - return type
	 * return types can be - data type, Class buySoap(), buyShampoo(), etc.. -
	 * Method name or Method Signature (Method name + parameters
	 * 
	 * What is return type and Why method return type is needed
	 * Methods can be - static or no static methods/parameterized or non-parameterized methods
	 * how to access/use/call non static methods - By creating Object
	 */

}

// * When a variable or object is created inside a method, its belong to the method. No other method can use it.
//		Thise methods or variable's visibility ends once the holding method get executed. In order to use the variable's 
//		value outside the method, we have return type concepts.
// * Whenever we use a return type in a method, store the method return value in a variable and use that variable wherever we want to use the method.
// * Whenever there is return type mentioned, at the end of method, we need to use "return" keyword, after that we should not be writing anything
//   		* means, return should be always at end of the methods 
// * Return type can be anything such as Class, primitive and non-premitive data type, String, Array, Collections and Objects too
// * So, whenever we have a method with return type, it does some work and give us some value
// * Either we can directly use the method in some other method or we assign method's return type to respective variable
// * Return keyword can have exact return type or its variable name
//	* Parameters can be methods with return type too

package returnType;

public class Returntype {
	
	static {
		System.out.println("Hello ");
	}
	
	
//	* buyRice and then buy soap
	
	public static int buyRice() {
		int amount = 100;
		int rice = 50;
		int balance = amount - rice; 
		System.out.println("Balace Amount after buying Rice "+balance);
//		return balance;  
		return amount - rice; 
//		System.out.println("abc");
	}
	
//	public static void buySoap(int balanceAmount) {
//		int soap = balanceAmount;
//		System.out.println("bought soap");
//	}
	
	public static void buySoap() {
		int soap = buyRice(); // this line is nothing but, int soap = balance;
		System.out.println("bought soap with balance amount");
	}
	
//	* buy rice and buy many other things with the balance amount 
	
	public static void buyShampoo()	{
		int shampoo = buyRice();
		System.out.println("bought shampoo with balance amount");
	}
	
	public static void buyConditioner()	{
		int conditioner = buyRice();
		System.out.println("bought conditioner with balance amount");
	}
	
//	* simplifying above methods
	
	static int balanceAmount = buyRice();
	
	public static void buySoap1() {
		int soap = balanceAmount;
		System.out.println(soap);
		System.out.println("bought soap with balance amount");
	}
	
	
	public static void buyShampoo1()	{
		int shampoo = balanceAmount;
		System.out.println(shampoo);
		System.out.println("bought shampoo with balance amount");
	}
	
	public static void buyConditioner1()	{
		int conditioner = balanceAmount;
		System.out.println(conditioner);
		System.out.println("bought conditioner with balance amount");
	}
	
	
	
	
	
	
	public static void main(String[] args) {
//		buyRice();
//		buySoap();
		
		
//		buySoap();
//		buyShampoo();
//		buyConditioner();
		
		
		System.out.println();
		
		buySoap1();
		buyShampoo1();
		buyConditioner1();
		
		
//		* Example for return type with String 
		String str = "Sathya";
		String str2 = str.concat("abc");
		str.concat("cb");
		str.charAt(0);
		str.toCharArray();
		
		char ch = str.concat("cb").charAt(0);
		System.out.println(ch);
		
//		WebDriver driver = new ChromeDriver();
//		driver.findElement(By.id("abc")).click();
//		WebElement ws = driver.findElement(By.id("abc"));
//		ws.click();
		
	}

}

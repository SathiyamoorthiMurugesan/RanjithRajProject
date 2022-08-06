package returnType;

public class ReturnTypePractice {
	
	int balanceAmount;
	int a;
	
//	ReturnTypePractice ab = new ReturnTypePractice();
	
	public int buyRice(int amount) {
		int riceAmount = 80;
		int balance = amount - riceAmount;
		System.out.println("bought rice for "+riceAmount);
//		balanceAmount = balance;
		
		return balance;
	}
	
	public void buySnack() {
		ReturnTypePractice test1 = new ReturnTypePractice();
		a = test1.buyRice(200);
//		test1.buyRice(200);
		System.out.println("Bought snacks for "+a);
	}
	
	public void buyChoco(int test) {
		System.out.println("Bought choco for " +test);
	}

	public static void main(String[] args) {
		ReturnTypePractice test = new ReturnTypePractice();
//		test.buyRice(200);
//		test.buySnack();
		test.buyChoco(test.buyRice(200));
		
		String str = "Sathiyamoorthi";
		char singleLetter = str.charAt(3);
		System.out.println(singleLetter);
		
		
		boolean testing = str.isEmpty();
		System.out.println(testing);
		
		System.out.println(str.isEmpty());
	}

}

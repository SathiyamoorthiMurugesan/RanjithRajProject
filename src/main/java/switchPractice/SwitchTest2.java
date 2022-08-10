package switchPractice;

public class SwitchTest2 {

	public static void main(String[] args) {

		SwitchTest1 te = new SwitchTest1();
		int c = te.getANumber();
		checkANumber(c);
	}
	
	public static void checkANumber(int a) {
		if(a>10) {
			System.out.println(" its greater than 10");
		}
		else 
			System.out.println("less than 10");
	}

}

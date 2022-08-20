package getterSetter;

public class GetterSetterPractice2 extends GetterSetterPractice1{
	
//	* we can use getter setter with/without Inheritance concept

	static GetterSetterPractice2 GS2 = new GetterSetterPractice2();
	
	public static void main(String[] args) {
//		System.out.println(a);
		System.out.println(GS2.getHomeLoanInterest());
		
		GS2.setHomeLoanInterest(100);
		System.out.println(GS2.getHomeLoanInterest());
	}

}

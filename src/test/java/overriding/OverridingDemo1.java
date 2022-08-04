package overriding;

//	* Also called as runtime polymorphism and it happens between two classes
//	* In order to achieve this, we need to use inheritance concept and object creation 
//	where we create obj for child class with parent class as reference class
//	* It based on method signature.
//	* Inorder to achieve this, 
//	* Method name should be same
//	* Type, order and number of parameter should same between parent and child
//	* Return type of methods between child and parent must be same
//	* Overriding is not possible between two static methods. Overriding is based on object creation only.
//		* But to call static methods, we dont need to create Object. 
//		* Since there is no need to create object, overriding is not possible with static methods


public class OverridingDemo1 extends Parent{

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.buyRice();
		parent.buySoap();
		
		
		OverridingDemo1 child1 = new OverridingDemo1();
		child1.buyChocolate();
		child1.buySoap();
		child1.buyRice();
		
		
//		This is called overriding. Here we create Object for child with parent as Reference. 
//		We expect parent method to run but while run time JVM will pick child class method
		Parent test1 = new OverridingDemo1();
		test1.buyRice();
		test1.buySoap();
		
	}
	
	public void buySoap() {
		System.out.println("Buy Lux soap");
	}
	
	public void buyChocolate() {
		System.out.println("Buy chocolate");
	}
	
	public void buyTV(String name) {
		System.out.println("Buy "+name+ " TV");
	}
	

}

class Parent {
	
	public void buySoap() {
		System.out.println("Buy Hamam soap");
	}
	
	public void buyRice() {
		System.out.println("Buy rice for food");
	}
	
	public void buyTV(int amount) {
		System.out.println("Buy TV for amount "+amount);
	}
	
}
/*
		* int, double, char, float, short, boolean, long, byte - all are primitive data types
		* means, they can hold a value but they are not having any inbuild methods.
		* Simply, datatypes are not Objects
		* Wrapper classes helps us to use primitive data type as Objects
		* int - Integer
		* char - Character
		* boolean - Boolean and so on.
		* int a = 5; primitive datatype
		* Integer a = 5; Object
		* 
		* 
		*/
		

package wrapper;

public class WrapperDemo {



	public static void main(String[] args) {
		int a = 5;
		Integer a1 = 5; 
		System.out.println(a);
		System.out.println(a1);
//		a. - not going to show any methods 
//		a1. - it contains many methods
		
		Character ch = 'a';
		
		
		Integer[] intArray = new Integer[3];
		intArray[0]  = 1;
		intArray[1]  = 2;
		intArray[2]  = 3;
		
//		intArray[0].compareTo(1)
		
	}


}

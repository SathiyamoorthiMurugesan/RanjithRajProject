package string;

import array.StringArrayPratice;

public class TestString {
	
	static StringArrayPratice sap = new StringArrayPratice();

	public static void main(String[] args) {
		String str = "NavaRanjith";
		String[] arr = str.toLowerCase().split("");
		sap.printArray(arr);
		System.out.println();

	    for(int i = arr.length-1; i >=0 ;i--)	{
	    	System.out.print(arr[i]);
	    }
	}
	
	
	
	
	

}

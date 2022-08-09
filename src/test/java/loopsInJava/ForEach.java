package loopsInJava;

public class ForEach {

	public static void main(String[] args) {
		
		int a[] = { 1, 2, 3, 4, 5 };
		
		for(int eachValue : a) {
			System.out.println(eachValue);
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}

package forLoopsInJava;

public class MultipleForLoop {

	public static void main(String[] args) {

		for (int a = 0; a < 10; a++) {
			String str = "Sathya";
			System.out.println("I am A value " + a);
			
			for (int i = 0; i < 5; i++) {
				int c=10;
				System.out.println(i);
				System.out.println(str);
				break;
//				continue;
			}
			
//			System.out.println(c);

		}

	}

}

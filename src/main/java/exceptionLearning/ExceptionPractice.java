package exceptionLearning;

public class ExceptionPractice {

	public static void main(String[] args) {

		method1(10, 0);
		
	}

	public static void method1(int a, int b) {

		try {
			System.out.println(a / b);
		}

//			catch(Exception e) {
//				System.out.println(e.getMessage());
//			}

//		catch (NullPointerException e) {
//			String message = e.getMessage();
//			System.out.println(message);
//		}

//		catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}
		
//		finally {
//			System.out.println("Hello");
//		}
		
		catch (Exception AE) {
			System.out.println(AE.getMessage());
		}
		
		finally {
			System.out.println("Hello");
		}

		System.out.println("Exception learning");
	}

}

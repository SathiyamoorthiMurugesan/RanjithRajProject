package practiseExceptionHandling;

public class CustomException extends Exception{
	
	public CustomException() {
		System.out.println("No password Entered");
	}
	
	public CustomException(String str) {
		System.out.println("Password lenth is less than 4 digit");
		
	}
	
	public CustomException(boolean boo) {
		System.out.println("Incorrect password");
	}
	
	
}

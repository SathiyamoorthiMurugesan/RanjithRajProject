// * throw keyword we uses to throw an exception volunteerly which we predict during complile time itself
// * Whenever we throw an exception, the method associated needs to have throws keyword followed by respective Exception or its super class.
// * We generally use throw keyword to throw custom created exceptions
// * All other exceptions except Runtime exceptions can be throwed during complie time.
//		* means, we can not throw Exception which extends to RunTimeException class. 


package practiseExceptionHandling;

import java.nio.file.FileAlreadyExistsException;

public class Throws {

	public static void main(String[] args) throws FileAlreadyExistsException, CloneNotSupportedException, ReflectiveOperationException, InterruptedException {
		
// throw new FileAlreadyExistsException("");
		
//		throw new ClassCastException();
		
//		throw new NoSuchElementException();
		
//		throw new CloneNotSupportedException();
		
//		throw new ClassNotFoundException();
		
//		throw new InterruptedException();
		
		throw new ArithmeticException();
 
		
	}
	
	public static void method1() throws ClassNotFoundException {
		try {
		throw new ClassNotFoundException();
		}
		finally {
			
		}
	}
	
	public void method2() throws ClassNotFoundException {
		method1();
	}

}

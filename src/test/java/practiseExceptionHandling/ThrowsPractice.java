package practiseExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;

public class ThrowsPractice {

	public static void main(String[] args) {

	}

	public void method() throws FileNotFoundException {
//		throw new ArithmeticException();
//		throw new ArrayStoreException();
		throw new FileNotFoundException();
//		throw new FileAlreadyExistsException();
	}
	
	public void method1() throws FileNotFoundException {
		ThrowsPractice tp = new ThrowsPractice();
		tp.method();
		tp.testFileIsExist();
	}
	
	public void testFileIsExist( ) {
		File file = new File(".test.txt");
	}

}

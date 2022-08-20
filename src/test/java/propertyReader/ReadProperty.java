package propertyReader;

import java.io.FileReader;
import java.util.Properties;

public class ReadProperty {

	public static void main(String[] args) throws Exception {

		FileReader propFile = new FileReader(
				"C:\\Users\\LENOVO\\git\\RanjithRajProject\\src\\test\\resources\\practice.properties");

		Properties prop = new Properties();
		prop.load(propFile);

		System.out.println(prop.get("name"));

		FileReader propFile1 = new FileReader(
				".\\src\\test\\resources\\practice2.txt");

		prop.load(propFile1);

		System.out.println(prop.get("name"));
		
		System.out.println(System.getProperty("user.dir"));
	}

}

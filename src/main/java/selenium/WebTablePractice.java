package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTablePractice {
	
	WindowHandling wh = new WindowHandling();
WebDriver driver;
	public static void main(String[] args) {
		
		WebTablePractice wt = new WebTablePractice();
		wt.readWebTable();

	}
	
	public void readWebTable() {
		driver = wh.launchApplicationAndReturnDriver("https://www.techlistic.com/p/demo-selenium-practice.html");
		WebElement customerTable = driver.findElement(By.id("customers"));
		List<WebElement> allRows = customerTable.findElements(By.tagName("tr"));
		System.out.println(allRows.size());
		
		List<WebElement> allHeaders = customerTable.findElements(By.tagName("th"));
		for(WebElement eachHeader: allHeaders ) {
			System.out.println(eachHeader.getText());
		}
		
		System.out.println(customerTable.findElement(By.xpath("//tr[4]/td[3]")).getText());
		
		System.out.println("********************************************");
		for(int i=1; i<=allRows.size();i++) {
			System.out.println(customerTable.findElement(By.xpath("//tr["+i+"]/td[2]")).getText());
		}
		
		
	}

}

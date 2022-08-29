package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractice {
	
	WebDriver driver;
	WindowHandling basicSel = new WindowHandling();

	public static void main(String[] args) {
		DropDownPractice ddp = new DropDownPractice();
		ddp.dropDown1();
	}
	
	public void dropDown1() {
		driver = basicSel.launchApplicationAndReturnDriver("http://demo.guru99.com/test/newtours/register.php");
		driver.findElement(By.name("country")).isDisplayed();
		Select select = new Select(driver.findElement(By.name("country")));
		select.selectByVisibleText("INDIA");
		select.selectByValue("PAKISTAN");
		select.selectByIndex(15);
		
		
		System.out.println(select.isMultiple());
		
		List<WebElement> allOptions = select.getOptions();
//		System.out.println(allOptions.toString());
		for(WebElement eachElement: allOptions) {
			System.out.println(eachElement.getText());
		}
	}

}

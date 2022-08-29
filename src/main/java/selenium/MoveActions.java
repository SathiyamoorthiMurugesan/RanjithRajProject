package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveActions extends WindowHandling{

	
	Actions action;
	
	public static void main(String[] args) {
		MoveActions ma = new MoveActions();
		ma.mouseActionPractice();
	}
	
	public void mouseActionPractice() {
		launchApplication("https://demo.guru99.com/test/newtours/register.php");
		WebElement signOn = driver.findElement(By.linkText("SIGN-ON"));
//		clickElementUsingMouse(signOn);
		clickElementUsingMouse(driver.findElement(By.name("firstName")));
		action = new Actions(driver);
		action.scrollByAmount(300, 300).build().perform();;
//		action.scrollToElement(driver.findElement(By.name("submit"))).build().perform();
//		action.sendKeys("Sathya").build().perform();
//		clickOnElementThreeTimesUsingMouse(driver.findElement(By.xpath("//*[contains(text(),'To create your account')]")));
	}
	
	public void clickElementUsingMouse(WebElement ele) {
		action = new Actions(driver);
		action.click(ele).build().perform();
	}
	
	public void rightClickUsingMouse() {
		action = new Actions(driver);
		action.contextClick().build().perform();
	}
	
	public void clickOnElementThreeTimesUsingMouse(WebElement ele) {
		action = new Actions(driver);
		action.doubleClick(ele).click().build().perform();
	}

}

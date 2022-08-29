package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitInSelenium extends WindowHandling{
	
	WebDriverWait wait;

	public static void main(String[] args) {
		WaitInSelenium ws = new WaitInSelenium();
		ws.waitPractice1();
		
	}
	
	public void waitPractice1() {
		launchApplication("https://demoqa.com/alerts");
		waitForAnElementToBeClickable(driver.findElement(By.id("timerAlertButton")),5);
		driver.findElement(By.id("timerAlertButton")).click();
//		driver.findElement(ById.id(""));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.switchTo().alert();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert();
	}
	
	public void findElementByXpath(String xpath) {
		driver.findElement(By.xpath(xpath));
	}
	
	public void clickElementById(String id) {
		driver.findElement(By.id(id)).click();
	}
	
	public void waitForAnAlert(long seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitForAnElementToBeClickable(WebElement ele, long seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	
	public void waitForAnElementToBeClickableById(String idValue, long seconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(By.id(idValue)));
	}

}

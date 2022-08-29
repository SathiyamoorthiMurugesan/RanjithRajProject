package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ScrollingInSelenium {

	WebDriver driver;
	WindowHandling wh = new WindowHandling();
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		ScrollingInSelenium	sc = new ScrollingInSelenium();
//		sc.scrollToBottomOfPageUsingJavaScriptExecutor();
//		Thread.sleep(3000);
//		sc.scrollToTopOfPageUsingJavaScriptExecutor();
//		sc.scrollToAnElementUsingJavaScriptExecutor(sc.driver.findElement(By.xpath("//p[text() = ' Frame ']")));
		
		sc.scrollToBottomOfPageUsingRobot();
		sc.scrollToBottomOfPageUsingActionClass();
	}
	
	public void scrollToBottomOfPageUsingJavaScriptExecutor() {
		driver = wh.launchApplicationAndReturnDriver("https://letcode.in/test");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	}
	
	public void scrollToTopOfPageUsingJavaScriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		
	}
	
	public void scrollToAnElementUsingJavaScriptExecutor(WebElement ele) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
	}
	
	public void scrollToBottomOfPageUsingRobot() throws AWTException {
		driver = wh.launchApplicationAndReturnDriver("https://letcode.in/test");
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_END);
		robo.keyRelease(KeyEvent.VK_END);
		robo.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	public void scrollToBottomOfPageUsingActionClass() {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	}
	
}

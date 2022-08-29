package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RobotPractice {
	
	WindowHandling wh = new WindowHandling();
	WebDriver driver;

	public static void main(String[] args) throws Exception {
		RobotPractice rp = new RobotPractice();
//		rp.roboMethod1();
		rp.moveMouseTo();
	}
	
	public void roboMethod1() throws Exception {
		driver = wh.launchApplicationAndReturnDriver("https://letcode.in/file");
		driver.findElement(By.className("file-icon")).click();
		Thread.sleep(5000);
		
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_SHIFT);
		robo.keyPress(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_D);
		robo.keyRelease(KeyEvent.VK_SHIFT);
		
		robo.keyPress(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_E);
		
		robo.keyPress(KeyEvent.VK_S);
		robo.keyRelease(KeyEvent.VK_S);
		
		robo.keyPress(KeyEvent.VK_K);
		robo.keyRelease(KeyEvent.VK_K);
		
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_T);
		
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		
		robo.keyPress(KeyEvent.VK_P);
		robo.keyRelease(KeyEvent.VK_P);
		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("*****************");
		
		
	}
	
	public void moveMouseTo() throws Exception {
		driver = wh.launchApplicationAndReturnDriver("https://letcode.in/file");
		Robot robo = new Robot();
		robo.mouseMove(10, 10);
	}

}

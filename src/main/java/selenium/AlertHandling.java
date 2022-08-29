package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	
	WebDriver driver;
	static AlertHandling ah;

	public static void main(String[] args) throws InterruptedException {
		ah = new AlertHandling();
		ah.alertHanding();
		
	}
	
	public void alertHanding() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		System.out.println("Application is launch");
		driver.manage().window().maximize();

//		driver.findElement(By.id("alertButton")).click();
//		ah.acceptAlert();
//		driver.findElement(By.id("timerAlertButton")).click();
//		Thread.sleep(5000);
//		ah.dismissAlert();
		
		ah.validateTextAfterAlert();
		
//		driver.switchTo().frame(0);
//		driver.switchTo().defaultContent();
//		https://demoqa.com/frames
		
	}
	
	public Alert switchToAlert() {
		Alert alert  = driver.switchTo().alert();
		return alert;
	}
	
	public void acceptAlert() {
		switchToAlert().accept();
	}
	
	public void dismissAlert() {
		switchToAlert().dismiss();
	}
	
	public void sendTextToAlert(String text) {
		switchToAlert().sendKeys(text);
		switchToAlert().accept();
	}
	
	public String getTextFromAlert() {
		return switchToAlert().getText();
	}
	
	public void validateTextAfterAlert() {
		driver.findElement(By.id("confirmButton")).click();
		acceptAlert();
		String confirmationText = driver.findElement(By.xpath("//span[@id = 'confirmResult']")).getText();
		System.out.println(confirmationText);
	}
	
	

}

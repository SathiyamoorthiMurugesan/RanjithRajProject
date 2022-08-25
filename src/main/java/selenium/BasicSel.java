package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSel {

	static BasicSel basicSel = new BasicSel();
	static WebDriver driver;
	String parentWindowHandle;

	public static void main(String[] args) {
		basicSel.launchApplication("https://phptravels.com/demo");
		System.out.println(driver.findElement(By.className("pull-left")).isDisplayed());

		String givenMonthlyText = "Monthly subscriptions and onetime payment both options are now available.";
		System.out.println(driver.findElement(By.className("pull-left")).getText());
		String monthlyText = driver.findElement(By.className("pull-left")).getText();
		if (monthlyText.equals(givenMonthlyText)) {
			System.out.println("correct");
		}

		driver.findElement(By.linkText("Sign up")).click();

		Set<String> allWindowHandle = driver.getWindowHandles();
		for (String eachWindow : allWindowHandle) {
			driver.switchTo().window(eachWindow);
			try {
				driver.findElement(By.id("inputPhone")).isDisplayed();
				System.out.println(driver.getTitle() + "************");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				System.out.println("#####################################");
			}

		}

//		basicSel.switchToChildWindow();

//		basicSel.switchToParentWindow();

		driver.close();

//		basicSel.switchToParentWindow();

//		System.out.println(driver.getTitle());
	}

	public void switchToChildWindow() {
		Set<String> allWindowHandle = driver.getWindowHandles();
		for (String eachWindow : allWindowHandle) {
			driver.switchTo().window(eachWindow);
			if (!driver.getWindowHandle().equals(parentWindowHandle))
				System.out.println(driver.getTitle());
		}
	}

	public void switchToWindowUsingTitle(String title) {
		Set<String> allWindowHandle = driver.getWindowHandles();
		for (String eachWindow : allWindowHandle) {
			driver.switchTo().window(eachWindow);
			if (driver.getTitle().contains(title))
				System.out.println(driver.getTitle());
		}
	}

	public void switchToParentWindow() {
		driver.switchTo().window(parentWindowHandle);
	}

	public void launchApplication(String url) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Application is launch");
		maximizeScreen();
		parentWindowHandle = driver.getWindowHandle();
	}

	public void maximizeScreen() {
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
	}

}

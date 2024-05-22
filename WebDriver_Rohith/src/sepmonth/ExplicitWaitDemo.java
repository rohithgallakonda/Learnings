package sepmonth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		//create obejct for webdriverwait class
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(200));
		//wait until element is clickable
		mywait.until(ExpectedConditions.elementToBeClickable(By.linkText("Create new account")));
		driver.findElement(By.linkText("Create new account")).click();
		//wait unti element is visible
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
		driver.findElement(By.name("firstname")).sendKeys("Testinfg");

	}

}

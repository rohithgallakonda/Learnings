package javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollToparticular {

	public static void main(String[] args) throws Throwable {
		//write java script to scroll to particular  element in webpage
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://jqueryui.com/droppable/'");
		Thread.sleep(5000);
		//store menu link into webelement
		WebElement menulink = driver.findElement(By.linkText("Menu"));
		//scroll to menu link
		js.executeScript("document.scrollIntoView", menulink);
		menulink.click();
	}

}

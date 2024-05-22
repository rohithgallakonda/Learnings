package javascripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollToptoBottom {

	public static void main(String[] args) throws Throwable {
		//write java script to scroll top to bottom and bottom to top and scroll to certain pixel
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='https://amazon.in'");
		Thread.sleep(5000);
		//scroll top to bottom vertically
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(5000);
		//scroll bottom to top vertically
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		Thread.sleep(5000);
		//scroll verticall to certain pixell
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(5000);
		driver.quit();
	}

}

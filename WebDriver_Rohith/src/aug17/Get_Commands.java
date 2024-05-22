package aug17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Commands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		//capture gmail text
		String visibleText = driver.findElement(By.linkText("Gmail")).getText();
		System.out.println(visibleText);
		//capture gmail link url
		String gmaillink = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(gmaillink);
		driver.quit();
	}

}

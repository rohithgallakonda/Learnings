package javascripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locateElements1 {

	public static void main(String[] args) throws Throwable {
		//write java script to locate elements
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(5000);
		//whenever you run this just change the values
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("(//a[text()='Register'])[1]")).click();
		js.executeScript("document.querySelector('#input-firstname').value='Akhilesh'");
		js.executeScript("document.getElementById('input-lastname').value='selenium'");
		js.executeScript("document.getElementById('input-email').value='test@gmail.com'");
		js.executeScript("document.querySelector(\"#input-password\").value='test@!234'");
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#input-newsletter-yes\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"input[value='1'][name='agree']\").click()");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"button[type='submit']\").click()");

	}

}

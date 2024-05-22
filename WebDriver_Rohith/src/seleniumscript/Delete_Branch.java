package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Delete_Branch {

	public static void main(String[] args) throws Throwable {
		//write a script to delete branch from branch details page
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();
		//click branches button
		driver.findElement(By.xpath("(//img)[5]")).click();
		Thread.sleep(5000);
		//click delete button
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		//capture alert message
		String alert_Message = driver.switchTo().alert().getText();
		System.out.println(alert_Message);
		Thread.sleep(5000);
		//click cancel button
		driver.switchTo().alert().dismiss();
		//click delete button
		driver.findElement(By.xpath("(//img)[11]")).click();
		Thread.sleep(5000);
		//capture alert message
		String alert_Message1 = driver.switchTo().alert().getText();
		System.out.println(alert_Message1);
		Thread.sleep(5000);
		//click ok to delete record
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		String alert_message2= driver.switchTo().alert().getText();
		System.out.println(alert_message2);
		Thread.sleep(5000);
		////click ok to alert window
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.quit();

	}

}

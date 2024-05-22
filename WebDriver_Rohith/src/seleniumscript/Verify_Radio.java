package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Radio {

	public static void main(String[] args) throws Throwable {
		//Write a script to verify webelement status in facebook
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[starts-with(@id,'u_0')])[6]")).click();
		Thread.sleep(1000);
		//verify firstname textbox is enebale or not
		WebElement firstName = driver.findElement(By.xpath("(//*[contains(@id,'u_')])[8]"));
		boolean First_Isenebaled =firstName.isEnabled();
		System.out.println(First_Isenebaled);
		//verify reneter email textbox is displayed or hidden
		WebElement reenterTextbox = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		boolean mail_isDiaplayed = reenterTextbox.isDisplayed();
		System.out.println(mail_isDiaplayed);
		//verify radio button is true or false
		WebElement radiobutton = driver.findElement(By.xpath("(//*[@value='1'])[4]"));
		boolean radio_isselected = radiobutton.isSelected();
		System.out.println(radio_isselected);
		driver.quit();
	}

}

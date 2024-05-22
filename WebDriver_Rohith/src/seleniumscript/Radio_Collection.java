package seleniumscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Collection {

	public static void main(String[] args) throws Throwable {
		//write a script to get collection of radio buyttons and print each radio button name
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://flights.qedgetech.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("pranga82@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("ranga123");
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		Thread.sleep(5000);
		//get collection of radio buttons
		List<WebElement> radio_buttons= driver.findElements(By.xpath("//div[@class='radio_b']"));
		System.out.println("No of radio buttons are::"+radio_buttons.size());
		for (WebElement each : radio_buttons) {
			System.out.println(each.getText());
		}
		driver.quit();
	}

}

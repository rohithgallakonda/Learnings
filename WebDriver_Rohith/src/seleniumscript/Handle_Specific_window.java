package seleniumscript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Specific_window {

	public static void main(String[] args) throws Throwable {
		//write a script to handle specific  window among all windows
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://gmail.com");
		Thread.sleep(5000);
		//Click on links like help,privacy and terms link to open in new tabs
		driver.findElement(By.linkText("Help")).click();
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Terms")).click();
		//store all windows into arraylist
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		//switch to google account help window and click link
		driver.switchTo().window(brw.get(2));
		Thread.sleep(5000);
		//click link
		driver.findElement(By.linkText("Community")).click();
		Thread.sleep(5000);
		driver.close();
		////switch to privay window and click link
		driver.switchTo().window(brw.get(3));
		driver.findElement(By.linkText("Technologies")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

} 

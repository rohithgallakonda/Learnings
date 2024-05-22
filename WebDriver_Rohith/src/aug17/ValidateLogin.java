package aug17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://orangehrm.qedgetech.com/");
		Thread.sleep(5000);
		//store username into wbelement
		WebElement username = driver.findElement(By.name("txtUsername"));
		//clear text
		username.clear();
		username.sendKeys("test");
		//capture user value into one variable
		String Objuservalue =username.getAttribute("value");
		//store password into wbelement
		WebElement password = driver.findElement(By.name("txtPassword"));
		//clear text
		password.clear();
		password.sendKeys("Qedge123!@#");
		//capture password value into one variable
		String objpassvalue = password.getAttribute("value");
		//print user and password value
		System.out.println(Objuservalue+"   "+objpassvalue);
		//click login button
		driver.findElement(By.name("Submit")).submit();
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual = driver.getCurrentUrl();
		if(Actual.contains(Expected))
		{
			System.out.println("Login Success::"+Expected+"     "+Actual);
		}
		else
		{
			//capture error message
			String error_message =driver.findElement(By.id("spanMessage")).getText();
			System.out.println(error_message+"    "+Expected+"        "+Actual);
		}
		driver.quit();
		
	}

}

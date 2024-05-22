package javascripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin1 {

	public static void main(String[] args) throws Throwable {
		//write java script to validate login 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.location='http://orangehrm.qedgetech.com/'");
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\"#txtUsername\").value='Admin123'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('txtPassword').value='Qedge123!@#'");
		Thread.sleep(3000);
		js.executeScript("document.getElementById('btnLogin').click()");
		Thread.sleep(5000);
		String Expected ="dashboard";
		String Actual =js.executeScript("return document.URL").toString();
		if(Actual.contains(Expected))
		{
			System.out.println("Login success::"+Expected+"     "+Actual);
		}
		else
		{
			//capture error message
			String Error_message = js.executeScript("return document.getElementById('spanMessage').innerHTML").toString();
			System.out.println(Error_message+"   "+Expected+"     "+Actual);
		}
		
		


	}

}

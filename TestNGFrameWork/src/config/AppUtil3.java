package config;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class AppUtil3 {
public static WebDriver driver;
@BeforeMethod
public static void setUp()
{
	driver=new ChromeDriver();
	driver.get("http://calc.qedgetech.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Reporter.log("Running precondition", true);
}
@AfterMethod
public static void tearDown()
{
	driver.close();
	Reporter.log("Running Postcondition", true);

}
}

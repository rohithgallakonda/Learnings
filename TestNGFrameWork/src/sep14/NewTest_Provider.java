package sep14;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class NewTest_Provider {
	WebDriver driver;
	 @BeforeTest
	  public void setUp() {
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://orangehrm.qedgetech.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
	  }
  @Test(dataProvider = "dp")
  public void validate_login(String user, String pass) {
driver.findElement(By.name("txtUsername")).sendKeys(user);	 
driver.findElement(By.name("txtPassword")).sendKeys(user);	  
driver.findElement(By.name("Submit")).click();
String expected = "dashboard";
String actual = driver.getCurrentUrl();
if(expected.contains(actual))
{
	Reporter.log("Login sucess"+expected+"  "+actual);
	
}
else
{
	Reporter.log("Login fail"+expected+"  "+actual);
	
}

  }

  @DataProvider
  public Object[][] dp() {
  Object login [][]= new Object [4][2];
  login [0][0]="Admin";
  login [0][1]="Qedge123!@#";
  login [1][0]="Admin";
  login [1][1]="Qedge123!@#";
  login [2][0]="Admin";
  login [2][1]="Qedge123!@#";
  login [3][0]="Admin";
  login [3][1]="Qedge123!@#";
return login;
  
  }

  @AfterTest
  public void tearDown() {
	  driver.quit();
  }

}

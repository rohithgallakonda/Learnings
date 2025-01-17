package sepchild;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil3;

public class ThirdTestNgScript extends AppUtil3 {
@Test
public void addition()
	{
		driver.findElement(By.name("display")).sendKeys("20");
		driver.findElement(By.xpath("(//input[@id='btn'])[6]")).click();
		driver.findElement(By.name("display")).sendKeys("74");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String addres = driver.findElement(By.name("display")).getAttribute("");
		Reporter.log(addres+"  "+"Executing Addition Test", true);
		
		
	}
@Test
public void division()
	{
		driver.findElement(By.name("display")).sendKeys("245350");
		driver.findElement(By.xpath("(//input[@id='btn'])[21]")).click();
		driver.findElement(By.name("display")).sendKeys("3453");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String divres = driver.findElement(By.name("display")).getAttribute("value");
		Reporter.log(divres+"  "+"Executing Addition Test", true);
}
@Test
public void multiplication()
	{
		driver.findElement(By.name("display")).sendKeys("748");
		driver.findElement(By.xpath("(//input[@id='btn'])[16]")).click();
		driver.findElement(By.name("display")).sendKeys("56");
		driver.findElement(By.xpath("(//input[@id='btn'])[20]")).click();
		String mulres = driver.findElement(By.name("display")).getAttribute("");
		Reporter.log(mulres+"  "+"Executing Addition Test", true);
	}
}
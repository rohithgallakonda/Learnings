package sepchild;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import config.AppUtil2;

public class SecondTestNgScript extends AppUtil2 {
@Test
public void branches()
{
	driver.findElement(By.xpath("(//img)[5]")).click();
	Reporter.log("Executing branches Test", true);
}
@Test
public void roles()
{
	driver.findElement(By.xpath("(//img)[6]")).click();
	Reporter.log("Executing roles test",true);
}
@Test
public void users()
{
	driver.findElement(By.xpath("(//img)[7]")).click();
	Reporter.log("Executing users test",true);
}
}
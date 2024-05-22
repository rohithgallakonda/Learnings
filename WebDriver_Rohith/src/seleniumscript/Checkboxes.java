package seleniumscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws Throwable {
		///write a script to count no o f checkboxes in webpagge
		//veywhichh check box is true or false
		//capture each check box name
		//select checkbox whichh is not seleted and uncheck which is selected
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Rohith/Downloads/checkbox_1_lyst1698.html");
		Thread.sleep(5000);
		///get collectin of checkboxes in web page
		List<WebElement> all_Checkboxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No of checkboxes are::"+all_Checkboxes.size());
		//iterate all checkboxes
		for (WebElement each : all_Checkboxes) {
			//verify each checkbox which is true or false
			boolean value =each.isSelected();
			//capture each box name
			String checkbox_Name =each.getAttribute("value");
			System.out.println(checkbox_Name+"    "+value);
			//check checkbox whic are not selected uncheck whic are selected
			Thread.sleep(5000);
			each.click();
		}
		Thread.sleep(5000);
		driver.quit();
	}

}

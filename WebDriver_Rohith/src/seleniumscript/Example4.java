package seleniumscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example4 {

	public static void main(String[] args) throws Throwable {
		//write a script to select 0 to 10 items and get collection of items which are selected and print each item name which are selected
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///C:/Users/Rohith/Downloads/MultiListboxHtmlpage_lyst3659.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		//select 0 to 10 items
		for(int i=0;i<=10;i++)
		{
			Thread.sleep(1000);
			dropdown.selectByIndex(i);
		}
		//print no of items selected
		List<WebElement> selected_Items =dropdown.getAllSelectedOptions();
		System.out.println("No of items selected::"+selected_Items.size());
		//print name of each item which are selected
		for (WebElement each : selected_Items) {
			System.out.println(each.getText());
		}
		Thread.sleep(5000);
		driver.quit();

	}

}

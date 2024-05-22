package seleniumscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example3 {

	public static void main(String[] args) throws Throwable {
		//write a script to verify listbox is single or multi seelction
		//select 0 to 8 items in listbox
		//delect from selection 
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.get("file:///C:/Users/Rohith/Downloads/MultiListboxHtmlpage_lyst3659.html");
				Thread.sleep(5000);
				Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
				//verify listbox is single or multi selection
				boolean value = dropdown.isMultiple();
				System.out.println(value);
				//select 0 to 8 items in listbox
				for(int i=0;i<8;i++)
				{
					Thread.sleep(2000);
					dropdown.selectByIndex(i);
				}
				//deselect from selection
				dropdown.deselectByIndex(5);
				Thread.sleep(5000);
				dropdown.deselectByVisibleText("Blue");
				Thread.sleep(5000);
				dropdown.deselectAll();
				Thread.sleep(5000);
				driver.quit();

	}

}

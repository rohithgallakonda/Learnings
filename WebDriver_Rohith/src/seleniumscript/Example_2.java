package seleniumscript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_2 {

	public static void main(String[] args) throws Throwable {
		//write a script to verify expected item with actual item in listbox
		//String Expected_Items ="books";
				String Expected_Items ="hyderabad";
				boolean item_Exist =false;
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https:/amazon.in");
				Thread.sleep(5000);
				Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
				//get items ciollection
				List<WebElement> all_Items =dropdown.getOptions();
				System.out.println("No of items are::"+all_Items.size());
				Thread.sleep(5000);
				for (WebElement each : all_Items) {
					Thread.sleep(1000);
					String Actual_Items =each.getText();
					System.out.println(Actual_Items);
					if(Actual_Items.equalsIgnoreCase(Expected_Items))
					{
						item_Exist=true;
						break;
					}
				}
				if(item_Exist)
				{
					//if item exist is true
					System.out.println(Expected_Items+"    "+"Item Found in Listbox");
				}
				else
				{
					//if item exist is true
					System.out.println(Expected_Items+"    "+"Item Not Found in Listbox");
				}
				driver.quit();


	}

}

package sepmonth;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_1 {

	public static void main(String[] args) throws Throwable {
		//write a script to check country found in table
		String Expected_Country ="canada";
				boolean Country_Exist =false;
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.navigate().to("https://www.w3schools.com/html/html_tables.asp");
				Thread.sleep(5000);
				WebElement webtable =driver.findElement(By.id("customers"));
				List<WebElement> rows,cols;
				rows = webtable.findElements(By.tagName("tr"));
				int row = rows.size()-1;
				System.out.println("No of rows are::"+row);
				for (WebElement eachrow : rows) {
					cols = eachrow.findElements(By.tagName("td"));
					for (WebElement eachcell : cols) {
						String Actual_Data =eachcell.getText();
						System.out.print("\n"+Actual_Data);
						if(Actual_Data.equalsIgnoreCase(Expected_Country))
						{
							Country_Exist=true;
							break;
						}
					}
					System.out.println();
					System.out.println("====================================");
					
				}
				if(Country_Exist)
				{
					System.out.println(Expected_Country+"    "+"Country Found in Table");
				}
				else
				{
					System.out.println(Expected_Country+"    "+"Country Not Found in Table");
				}
				driver.quit();
	}

}

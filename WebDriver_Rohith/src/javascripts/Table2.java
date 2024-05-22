package javascripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws Throwable {
//write a script to count no of rows in table and print no of columns in each row
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement object
		WebElement webtable = driver.findElement(By.className("dataTable"));
		//get collection of rows in table
		List<WebElement> rows = webtable.findElements(By.tagName("tr"));
		int row=rows.size()-1;
		System.out.println("No of rows are::"+row);
		//iterate all rows
		for(int i=1;i<rows.size();i++)
		{
			//get cell collection in each row
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			System.out.println("Row No."+i+"  "+"Column size::"+cols.size());
			
		}
		
		driver.quit();
	}

}

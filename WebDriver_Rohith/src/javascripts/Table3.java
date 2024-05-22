package javascripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) throws Throwable {
		// write a script to print each row cell data
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement webtable = driver.findElement(By.className("dataTable"));
		List<WebElement> rows,cols;
		//get row collection from table
		rows = webtable.findElements(By.tagName("tr"));
		int row = rows.size()-1;
		System.out.println("No of rows are::"+row);
		Thread.sleep(5000);
		//iterate all rows
		for (WebElement eachrow : rows) {
			//get each row cell collection
			cols=eachrow.findElements(By.tagName("td"));
			//ietrate all cells
			for (WebElement eachcell : cols) {
				Thread.sleep(500);
				System.out.print("\n"+eachcell.getText());
			}
			System.out.println();
			System.out.println("========================================================");
		}
		driver.quit();


	}

}

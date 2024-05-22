package aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String Expected_Title = "google";
		String Actual_Title =driver.getTitle();
		//verify expected title equals to actual title
		if(Expected_Title.equalsIgnoreCase(Actual_Title))
		{
			System.out.println("Title is Matching::"+Expected_Title+"     "+Actual_Title);
		}
		else
		{
			System.out.println("Title is Not Matching::"+Expected_Title+"     "+Actual_Title);
		}
		driver.quit();
		
	}

}

package aug17;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Url {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://yahoo.com/");
		String Expected ="https://";
		String Actual = driver.getCurrentUrl();
		if(Actual.startsWith(Expected))
		{
			System.out.println("Url is Secured:::"+Expected+"       "+Actual);
		}
		else
		{
			System.out.println("Url is Not Secured:::"+Expected+"       "+Actual);
		}
		driver.quit();

	}

}

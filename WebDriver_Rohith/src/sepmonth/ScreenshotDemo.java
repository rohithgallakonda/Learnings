package sepmonth;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotDemo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        //create java time stamp
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
        String datef = df.format(date);
        File screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen, new File ("D://Screenshot/"+datef+"__"+"new.png"));
        driver.quit();
        
        
       
        
        
	}

}

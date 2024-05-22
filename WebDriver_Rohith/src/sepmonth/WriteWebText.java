package sepmonth;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteWebText {

	public static void main(String[] args)throws Throwable {
		// TODO Auto-generated method stub
		File f = new File("D://sample.doc");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Thread.sleep(5000) ;
		String para1 =driver.findElement(By.xpath("(//p[position()=1])[2]")).getText();
		String para2 =driver.findElement(By.xpath("//p[position()=2]")).getText();
		bw.write(para1);
		bw.newLine();
		bw.newLine();
		bw.write(para2);
		bw.flush();
		bw.close();
		driver.quit();
	}

}

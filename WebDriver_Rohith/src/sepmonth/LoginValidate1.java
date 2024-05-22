package sepmonth;

import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginValidate1 {

	public static void main(String[] args) throws Throwable {
		// Read path of file
				FileReader fr = new FileReader("D:/Login.txt");
				@SuppressWarnings("resource")
				BufferedReader br = new BufferedReader(fr);
				String str ="";
				while((str=br.readLine())!=null)
				{
					//split notpad data into array
					String login[] =str.split(";");
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("http://orangehrm.qedgetech.com/");
					Thread.sleep(5000);
					driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
					driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
					driver.findElement(By.name("Submit")).click();
					Thread.sleep(3000);
					String Expected="dashboard";
					String Actual = driver.getCurrentUrl();
					if(Actual.contains(Expected))
					{
						System.out.println("Login Success::"+Expected+"     "+Actual);
					}
					else
					{
						//capture error message
						String Error_Message = driver.findElement(By.id("spanMessage")).getText();
						System.out.println(Error_Message+"   "+Expected+"    "+Actual);
					}
					driver.quit();
				}
				

			}

		

	}



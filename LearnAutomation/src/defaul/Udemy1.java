package defaul;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Siddhant pawar");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
				
			// Initialize browser
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.spicejet.com");
			
			//wait for application to load
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			//Maximize launched website
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
					
			driver.findElement(By.xpath("//a[@value='AMD']")).click(); //click on ahmedabad in From selection
			driver.findElement(By.xpath("//a[@value='BLR']")).click(); //click on Bangalore in TO selection
			
			System.out.println("This ends the execution");
			
			driver.close();
					
		}

}

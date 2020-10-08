package defaul;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Udemy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Siddhant pawar - To aiye shuru karte hai bina kisi bukchodi kee");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
				
			// Initialize browser
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.makemytrip.com/flights/");
			
			//wait for application to load
			driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
			
			//Maximize launched website
			driver.manage().window().maximize();
			
			WebElement source = driver.findElement(By.id("fromCity"));
			source.clear();
			source.sendKeys("AHM");
			//wait for application to load
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			source.click();
			
			WebElement destination = driver.findElement(By.id("toCity"));
			destination.clear();
			destination.sendKeys("MUM");
			destination.sendKeys(Keys.ARROW_DOWN);
			destination.sendKeys(Keys.ENTER);
			
			/*int i =1;
			while(i<4)
			{
				destination.sendKeys(Keys.ARROW_DOWN);
				i++;
				
			}*/
		    			
			System.out.println("This is the end of run");
			
			
			
		
			
			
	}

}

package Assert;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
	

	public void verifyApplicationTitle()
	
	{
	System.out.println("Siddhant - You have to do it this time, take wotever time yo want");
	System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
	
	// Initialize browser
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js = (JavascriptExecutor) driver;

	//Maximize launched website
	driver.manage().window().maximize();
	
	//Launch webpage
	driver.get("http://learn-Automation.com");
	
	//wait for application to load
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
	
	//verify title and assert to check if that matches expected value
	String mytitle=driver.getTitle();
	System.out.println("Title is:" +mytitle);
	String expectedtitle="Selenium Webdriver tutorial for beginners";
	
	Assert.assertEquals(mytitle,expectedtitle);
	
	System.out.println("Comparision completed");
	
	}
	}


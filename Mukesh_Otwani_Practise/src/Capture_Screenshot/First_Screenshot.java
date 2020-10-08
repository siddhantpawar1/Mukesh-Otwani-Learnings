package Capture_Screenshot;

import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import library.utility;

public class First_Screenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Siddhant - lets capture screenshots!");
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		// Initialize browser
		WebDriver driver=new ChromeDriver();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
	
		driver.get("https://www.facebook.com");
	
	
		//wait for application to load
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		//Maximize launched Website
		driver.manage().window().maximize();
		
		utility.captureScreenshot(driver, "Login Page");
						
		driver.quit();
		
	}

}

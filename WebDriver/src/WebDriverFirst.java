import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Siddhant - You have to do it this time, take wotever time yo want");
		
		System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		// Initialize browser
	WebDriver driver=new ChromeDriver();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.get("http://www.calculator.net/");
	
	
	//wait for application to load
	 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	//Maximize launched website
	driver.manage().window().maximize();
	
	js.executeScript("scrollBy(0,2500)");
	
	
	//click on text field based on text name
	driver.findElement(By.linkText("Math Calculators")).click();
	
	//click on text field based on text name
	driver.findElement(By.linkText("Percentage Calculator")).click();
		
	//Click on first text box
	driver.findElement(By.id("cpar1")).sendKeys("10");
	
	//Click on second text box
	driver.findElement(By.id("cpar2")).sendKeys("50");
		
		
	//Click on button 
	driver.findElement(By.xpath("//input[@value='Calculate' and @type='image']")).click();
	
	
	String result = driver.findElement(By.xpath(".//*[@id='content']/p[2]/span/font/b")).getText();
	
	//Print a Log In message to the screen
	System.out.println(" The Result is " + result);
	
    driver.close();

	}

}

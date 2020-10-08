package defaul;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemypractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Siddhat Pawar - Practice set 1 begin");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
				
			// Initialize browser
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/");
			
			//wait for application to load
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
			//Maximize launched website
			driver.manage().window().maximize();
			
			
			
			
			WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
			System.out.println("Checkbox1 selection state is : "+checkbox1.isSelected());
			checkbox1.click();
			System.out.println("Checkbox1 Seltion state is : "+checkbox1.isSelected());
			checkbox1.click();
			System.out.println("Checkbox1 Seltion state is : "+checkbox1.isSelected());
			
			List<WebElement> boxes = driver.findElements(By.xpath("//*[@type='checkbox']"));
			System.out.println("Count for checkboxes on the page :" +boxes.size());
			
			
				

	}

}

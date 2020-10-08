import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First_Demo {

	public static void main(String[] args) {
		
		System.out.println("Siddhant - lets open Firefox!!");
		
		System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Firefox Driver\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		
		// Initialize browser
	WebDriver driver=new FirefoxDriver(); 
	
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("email")).sendKeys("9016587127");
	driver.findElement(By.name("pass")).sendKeys("mummyrocks");
	
	driver.findElement(By.id("u_0_2")).click();
	
	

	}

}

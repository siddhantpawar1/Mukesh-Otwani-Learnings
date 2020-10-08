import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_RadioButton {

public static void main(String[] args) {

System.out.println("This is the beginning!");

System.setProperty("webdriver.chrome.driver","C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");
		
// Initialize browser
WebDriver driver=new ChromeDriver();

driver.get("http://www.ironspider.ca/forms/checkradio.htm");

//wait for application to load
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
//Maximize launched Website
driver.manage().window().maximize();

List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox'and @name='color']"));

for(int i=0;i<checkbox.size();i++)
{
	
WebElement ele = checkbox.get(i);
String value=ele.getAttribute("value");
if(value.equalsIgnoreCase("orange")); {
ele.click();
break;
}
}
}
}



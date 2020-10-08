package defaul;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Udemypractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Siddhat Pawar - Practice set 1 begin");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\siddhantpawar\\Desktop\\Siddhant\\Learn Selenium\\Software\\Chrome driver\\chromedriver_win32\\chromedriver.exe");

		// Initialize browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");

		// wait for application to load
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Maximize launched website
		driver.manage().window().maximize();

		// WebElement Radiobutton =
		// driver.findElement(By.xpath("//*[@id='SearchForm']/nav/ul/li[1]/label/strong"));
		// Radiobutton.isSelected();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']")).click();

		System.out.println("Is this executed");

	}

}

package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vmadmin\\Downloads\\Drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin ()
	{
		driver.get("https://www.thetestroom.com/webapp/index.html");
		driver.findElement(By.id("adoption_link")).click();
		
		driver.findElement(By.id("about_link")).click();		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
		
	}
	

}

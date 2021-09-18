package jupiter.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
  
	public WebDriver driver;
	
	@BeforeMethod
	public void OpenBrowser()
	{   
		driver=new FirefoxDriver(); 
		driver.manage().window().maximize(); //maximize the web home/landing page
		driver.get("https://jupiter.cloud.planittesting.com/"); //open the url mentioned for website
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //implicit wait
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	} 
}

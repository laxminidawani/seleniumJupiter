package jupiter.tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import jupiter.base.BaseClass;

public class ContactPage extends BaseClass {
	@Test(invocationCount=5)
	  public void testContact() throws  IOException, InterruptedException 
	    {
		 try {
			boolean home=driver.findElement(By.xpath("//div[@class='hero-unit']")).isDisplayed(); //check if the object on home page is displayed before proceeding further to contact page
			if(home==true)
				{
					driver.findElement(By.id("nav-contact")).click(); //click on contact page
					
					driver.findElement(By.id("forename")).sendKeys("Laxmi"); //Pass value to text box Forename *
					driver.findElement(By.id("email")).sendKeys("laxmin12@gmail.com"); //Pass value to text box Email *
					driver.findElement(By.id("message")).sendKeys("I would like to have a franchise. Would love to speak and know more about your business"); //Pass value to text box Email *
					WebElement submit=driver.findElement(By.xpath("//a[@class='btn-contact btn btn-primary']"));
			        submit.click(); //click on the submit button
			        
			        Thread.sleep(5000);
			        
			        String expected="Thanks Laxmi, we appreciate your feedback.";
			        Thread.sleep(2000);
					String success=driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
					  if(success.equals(expected))
							Reporter.log("The registration is successful");
				}
		   }catch(Exception e)
		 {
			 Reporter.log("The Registration is not successful");
		 }
	   }  		
}
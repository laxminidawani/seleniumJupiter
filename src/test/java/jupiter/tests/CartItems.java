package jupiter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import jupiter.base.BaseClass;

public class CartItems extends BaseClass{
	@Test
	public void Items() 
	{
		try {
				driver.findElement(By.id("nav-shop")).click();  //click on shop tab
				
				WebElement eFun=driver.findElement(By.xpath("//li[@id='product-6']/div/p/a"));  //buy 2Funny Cow
				for(int i=0;i<2;i++)
				eFun.click();
				
				driver.findElement(By.xpath("//li[@id='product-4']/div/p/a")).click(); //buy 1 Fluffy bunny
				
				driver.findElement(By.id("nav-cart")).click(); //click on cart
				
				Thread.sleep(2000);
				
				String count1=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[1]/td[3]/input")).getAttribute("value");//get items added in the cart
				String itemType1=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[1]/td[1]")).getText(); //get item type added in the cart
				Reporter.log("First Row in a cart has"  + itemType1  +  "with count" + count1); //Write results to report
				
				String count2=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[2]/td[3]/input")).getAttribute("value");//get items added in the cart
				String itemType2=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[2]/td[1]")).getText(); //get item type added in the cart
				Reporter.log("Second Row in a cart has"  + itemType2  +  "with count"  + count2); //Write results to report
		  }
		catch(Exception e)
		  {
			  Reporter.log("The Items in the cart failed to be verified");
		  }
	  }
}
 

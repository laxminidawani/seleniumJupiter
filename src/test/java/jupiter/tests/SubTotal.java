package jupiter.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import jupiter.base.BaseClass;

public class SubTotal extends BaseClass {
	@Test
	public void subitems() throws InterruptedException
	{   
		try {
				driver.findElement(By.id("nav-shop")).click(); //click on shop tab
				
				WebElement e1=driver.findElement(By.xpath("//li[@id='product-2']/div/p/a"));//click on Stuffed frog
				    for(int i=0;i<2;i++)
					e1.click();
				    Thread.sleep(1000);
				
				WebElement e2=driver.findElement(By.xpath("//li[@id='product-4']/div/p/a"));//buy 5 item of Fluffy bunny
                    for(int i=0;i<5;i++)
                    e2.click();
                    Thread.sleep(1000);
				
                WebElement e3=driver.findElement(By.xpath("//li[@id='product-7']/div/p/a"));//buy 3 Valentine Bear 
                    for(int i=0;i<3;i++)
                     e3.click();
                 
				driver.findElement(By.id("nav-cart")).click(); //click on the cart
				Thread.sleep(1000);
				
				String expectedRow1Value="$21.98";
				String actualRow1Value=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[1]/td[4]")).getText();//get sub total value of row1 from the cart
				  if(expectedRow1Value.equals(actualRow1Value))
					 Reporter.log("Sub total for 2 Stuffed Frog  is"    + actualRow1Value);
					
				String expectedRow2Value="$49.95";
				String actualRow2Value=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[2]/td[4]")).getText();//get sub total value of row2 from the cart
				  if(expectedRow2Value.equals(actualRow2Value))
					 Reporter.log("Sub total for 5 Fluffy Bunny is"    + actualRow2Value);
				
				String expectedRow3Value="$44.97";
				String actualRow3Value=driver.findElement(By.xpath("//table[@class='table table-striped cart-items']/tbody/tr[3]/td[4]")).getText();//get sub total value of row3 from the cart
				  if(expectedRow3Value.equals(actualRow3Value))
					 Reporter.log("Sub total for 3 Valentine Bear is"     + actualRow3Value);
						
		  }catch(Exception e)
		    {
			     Reporter.log("The sub total in the cart failed to be verified");
		    }
	} 
}


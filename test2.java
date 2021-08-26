package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class test2 extends Base {
	@Test
	public void testtwo()
	{
		
	//enter customer id in customer id field
	MobileElement custid=driver.findElement(By.name("Customer id"));
	custid.sendKeys("101");
	
	//click on signup btn
	MobileElement signupbtn=driver.findElement(By.name("Signup"));
	signupbtn.click();
	
	//click on settings
	MobileElement settbtn=driver.findElement(By.id("Settings"));
	settbtn.click();
	
	MobileElement dispcustid=driver.findElement(By.id("Changecustid"));
	dispcustid.click();
	
	
	MobileElement cancelcustidpopup=driver.findElement(By.name("cancel"));
	cancelcustidpopup.click();


	
	
	}
}

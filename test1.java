package Tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;

public class test1 extends Base {

	@Test
	public void testone()
	{
		//enter customer id in customer id field
		MobileElement custid=driver.findElement(By.name("Customer id"));
		custid.sendKeys("101");
		
		//click on signup btn
		MobileElement signupbtn=driver.findElement(By.name("Signup"));
		signupbtn.click();
		
		//click on settings
		MobileElement settbtn=driver.findElement(By.name("Settings"));
		settbtn.click();
		
		//get customer id
		MobileElement dispcustid=driver.findElement(By.id("Changecustid"));
		String s=dispcustid.getText();
		
		//verify whether it shows correct customer id
		Assert.assertEquals(s, 000101);
		
		
		
	}
}

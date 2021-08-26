package Tests;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	AppiumDriver<MobileElement> driver;
	WebDriverWait wait;	
	@BeforeTest
	public void setup() throws Exception
	{
		
		// Create an object for Desired Capabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// Name of mobile web browser to automate. capabilities.setCapability("browsername", "chrome");
		
		// Which mobile OS platform to use - iOS, Android, or FirefoxOS
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "7.1.2");
		//device name
				capabilities.setCapability("deviceName", "GalaxyS4");
				//udid
				
				capabilities.setCapability("udid", "456594ab");
				
				capabilities.setCapability("appPackage", "com.myos.pia");
				capabilities.setCapability("appActivity", "com.myos.pia2");
				
				//app path for native app
				capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Tanmay\\Downloads\\pia-sdk-android-release-sample-2.4.0.apk");
				
				// Activity name for the Android activity you want to launch from package capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
				// Initialize the driver object with the URL to Appium Server passing the capabilities. Server Url may vary
				URL url = new URL("http://127.0.0.1:4723/wd/hub");
				
				driver=new AppiumDriver<MobileElement>(url, capabilities);
				
				//we can use os pecific also(andoid/iOs)
				//driver=new AndroidDriver<MobileElement>(url, capabilities);
				//driver=new IOSDriver<MobileElement>(url, capabilities);
				
				
				wait = new WebDriverWait(driver, 5);
	}
	@Test
	public void check() {
		System.out.println("This is  for check");
		
	}
	@AfterTest
	public void teardown() {
		driver.quit();
		
		
	}
}

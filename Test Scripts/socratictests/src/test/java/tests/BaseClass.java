package tests;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class BaseClass {
	
	AndroidDriver<MobileElement> driver;
	int passedCase = 0;
    int failedCase = 0;
	
	@BeforeTest
	public void setup() throws Exception
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel4_API29");
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		
		
		URL url = new URL("http://127.0.0.1:4723/");
		
		driver = new AndroidDriver<MobileElement>(url, caps);
	}
	
	/*@Test
	public void testOne()
	{
        System.out.println("Completed");
	}*/
	
	@AfterTest
	public void teardown()
	{
		System.out.println("Total Test cases "+(passedCase+failedCase));
        System.out.println("Test cases passed "+passedCase);
        System.out.println("Test cases failed "+failedCase);
		driver.quit();
	}
}

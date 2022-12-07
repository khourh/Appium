package khouapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;



public class khnouapp {
	@Test


	public void Apptest() throws MalformedURLException{
		
	
DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
caps.setCapability(MobileCapabilityType.APP, "/home/wathek/eclipse-workspace/Appium/src/test/java/ressource/ApiDemos-debug.apk");
AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
driver.findElement(AppiumBy.accessibilityId("Content")).click();
	}
}

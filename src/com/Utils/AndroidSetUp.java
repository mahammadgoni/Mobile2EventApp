package com.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidSetUp extends ReadAndWriteTestData{
	@SuppressWarnings("rawtypes")
	protected static AndroidDriver driver;
	
    String home = System.getProperty("user.dir");


	@SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium()throws IOException {
		
		String DeviceName = getCellData(1, 0);
		
		String UDID = getCellData(1, 1);
		
		String PlatformVersion =  getCellData(1, 2);

		String apkPath =  getCellData(1, 3);
		
		String appPackageName =  getCellData(1, 4);
		
		String activityName =  getCellData(1, 5);

//		Property Settings are done here
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		System.out.println("===============================================");

		System.out.println("Setting Up the Device Configuaration ");

		// capabilities.setCapability("appium-version", "1.7.1");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", PlatformVersion);

		capabilities.setCapability("deviceName", DeviceName);

		capabilities.setCapability("udid", UDID);

		capabilities.setCapability("app", home+apkPath);

		capabilities.setCapability("appPackage", appPackageName);

		capabilities.setCapability("appActivity", activityName);
		
//		capabilities.setCapability("noResetValue", "false");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}
	
	protected void installApp() throws IOException{
		
		System.out.println("Installing the Application ");
		
		String apkPath =  getCellData(1, 3);
		
		driver.installApp(home+apkPath);
		
		System.out.println("Successfully Installed the Application ");
		
	}
	
	protected void uninstallApp() throws IOException{
		
		String appPackageName =  getCellData(1, 4);
		
		System.out.println("Uninstalling the Application the Application");
		
		driver.removeApp(appPackageName);
		
		System.out.println("Successfully Uninstalled the Application");
		
		System.out.println("       ");
		
		System.out.println("===============================================");
		
	}

	protected void gotoHome() {
		
		System.out.println("Going Back to Home");

		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

	protected void openTheApp() throws IOException {
			
		System.out.println("Opening the App Again to Check the Changed Password");
		
		String appPackageName =  getCellData(1, 4);
		
		String activityName =  getCellData(1, 5);

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appPackage", appPackageName);

		caps.setCapability("appActivity", activityName);

	}
	
	public void scrollDown(){
		
		System.out.println("Scrolling Down");
		
		try {
			
		    
			
			driver.pressKeyCode(AndroidKeyCode.ACTION_DOWN);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_UP);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			
		} catch (Exception e) {
			
		}
		

	}
	
	
	protected void swipeRightToLeft(){
		

		
	
	}


}

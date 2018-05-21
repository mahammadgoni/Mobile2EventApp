package com.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AndroidSetUp {
	@SuppressWarnings("rawtypes")
	protected static AndroidDriver driver;

	String appPackagename = "ws.e2m.main";

	String activityName = "ws.e2m.main.screens.SplashScreen";
	
//	String apkPath = "/Users/goni/Documents/workspace/WebSpiders/Event2MobileApp/APP's/e2m_V5.0_UAT.apk";
	
	String apkPath = "/Users/goni/Documents/workspace/WebSpiders/Event2MobileApp/APP's/e2m_Generic_V5.0_Root_LIVE.apk";


	@SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium(String DeviceName, String UDID, String PlatformVersion)throws MalformedURLException {
		// protected void prepareAndStartAppium() throws MalformedURLException {

		DesiredCapabilities capabilities = new DesiredCapabilities();

		System.out.println("===============================================");

		System.out.println("Setting Up the Device Configuaration ");

		// capabilities.setCapability("appium-version", "1.7.1");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", PlatformVersion);

		// capabilities.setCapability("platformVersion", "4.4.4");

		// capabilities.setCapability("deviceName", "emulator-5554");
		//
		// capabilities.setCapability("udid", "emulator-5554");
		//
		capabilities.setCapability("deviceName", DeviceName);

		capabilities.setCapability("udid", UDID);

		capabilities.setCapability("app", apkPath);

		capabilities.setCapability("appPackage", appPackagename);

		capabilities.setCapability("appActivity", activityName);
		
//		capabilities.setCapability("noResetValue", "false");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

	}
	
	protected void installApp(){
		
		System.out.println("Installing the Application ");
		
		driver.installApp(apkPath);
		
		System.out.println("Successfully Installed the Application ");
		
	}
	
	protected void uninstallApp(){
		
		System.out.println("Uninstalling the Application the Application");
		
		driver.removeApp(appPackagename);
		
		System.out.println("Successfully Uninstalled the Application");
		
		System.out.println("       ");
		
		System.out.println("===============================================");
		
	}

	protected void gotoHome() {
		
		System.out.println("Going Back to Home");

		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

	protected void openTheApp() {
	
		
		System.out.println("Opening the App Again to Check the Changed Password");

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appPackage", appPackagename);

		caps.setCapability("appActivity", activityName);

	}
	
	
	protected void swipeRightToLeft(){
		

		
	
	}


}

package com.TestCases;

import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.MobilePages.LoginPage;
import com.Utils.AndroidSetUp;

public class E2MAppTestCases extends AndroidSetUp{
	
	String DeviceName = "Google Nexus 9";
	
	String UDID = "192.168.57.101:5555";
	
	String PlatformVersion = "6.0";
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
	}
	
	@Test(priority = 1)
	public void uninstallAppTest(){
		
		System.out.println("Executing : Uninstall Application Test");
		
		uninstallApp();	
		
	}
	
	@Test(priority = 2)
	public void installAppTest() throws MalformedURLException{
		
		System.out.println("Executing : Install Application Test");
				
		installApp();
		
	}
	
	@Test(priority = 3)
	public void loginToAccountTest() throws MalformedURLException{
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
		
		System.out.println("Executing : Login to your Account Test");
		
		new LoginPage(driver).accountLogin("zianzay@yopmail.com", "#e2m321");
		
	}

}

package com.TestCases;

import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.LoginPage.LivePage;
import com.LoginPage.LoginPage;
import com.Utils.AndroidSetUp;

public class E2MAppTestCases extends AndroidSetUp{
	
	String DeviceName = "Google Nexus 5";
	
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
	
//	@Test(priority = 1)
//	public void uninstallAppTest(){
//		
//		System.out.println("Executing : Uninstall Application Test");
//		
//		uninstallApp();	
//		
//	}
//	
//	@Test(priority = 2)
//	public void installAppTest() throws MalformedURLException{
//		
//		System.out.println("Executing : Install Application Test");
//				
//		installApp();
//		
//	}
//	
//	@Test(priority = 3)
//	public void loginToAccountTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Login to your Account Test");
//		
//		new LoginPage(driver).accountLogin("brucewills@yopmail.com", "#e2m321");
//		
//	}
//	
//	@Test(priority = 4)
//	public void forgotPasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Forgot Password Test");
//		
//		new LoginPage(driver).forgotPassword("brucewills@yopmail.com", "#e2m321");
//		
//	}
//	
//	@Test(priority = 5)
//	public void changePasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Chanege Password Test");
//		
//		new LoginPage(driver).changePassword("brucewills@yopmail.com", "#e2m321","123456");
//		
//	}
//	
//	
//	@Test(priority = 6)
//	public void revertPasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Revert Back to Default Password Test");
//		
//		new LoginPage(driver).changePassword("brucewills@yopmail.com", "123456","#e2m321");
//		
//	}
	
	@Test(priority = 7)
	public void homePageVerifyTest() throws MalformedURLException, InterruptedException{
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
		
		System.out.println("Executing : Home Page Verify Test");
		
		new LoginPage(driver).homePageVerify("brucewills@yopmail.com","#e2m321");
		
	}
		
//	@Test(priority = 4)
//	public void socialWallTest() throws MalformedURLException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Social Wall Posting Test");
//		
//		new LivePage(driver).SocialWall("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Comment");
//		
//		
//	}

}

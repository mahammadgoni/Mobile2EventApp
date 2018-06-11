package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LocationAndTiming extends BaseSetUp{
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By submitBtn = By.id("ws.e2m.main:id/tv_submit");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
//	Clicking On My Profile Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnLocation = By.xpath("//*[@content-desc='Location & Timing']");
	
	By popUpBtn = By.xpath("//*[@content-desc='Popup button up']");
	
	By locationList = By.id("ws.e2m.main:id/lv_venu_list");
	
	By clickOn1stLocation = By.xpath("//*[@bounds='[27,920][1053,993]']");
	
	By venueTitle = By.id("ws.e2m.main:id/tv_venu_title");
	
	

	public LocationAndTiming(WebDriver driver) {
		super(driver);
		
	}
	
//	Common Login Method
	
	public void commonActivity(String userName,String password) throws InterruptedException{
		
		System.out.println("Clicking on Your Email ");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		System.out.println("Entering the Email  :" + userName);

		driver.findElement(emailId).sendKeys(userName);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn1);

		driver.findElement(proceedBtn1).click();
		
		Thread.sleep(2000);

		System.out.println("Entering the Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(clickOnEtc);

		driver.findElement(clickOnEtc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Location and Timing");

		waitForClickabilityOf(clickOnLocation);

		driver.findElement(clickOnLocation).click();
		
	}

//	Location and Timing Method
	
	public LocationAndTiming locationAndTiming(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Pop Up to see the Vanue List");

		waitForClickabilityOf(popUpBtn);

		driver.findElement(popUpBtn).click();
		
		Thread.sleep(2000);
		
		String Location = driver.findElement(clickOn1stLocation).getText();
		
		driver.findElement(clickOn1stLocation).click();
		
		Thread.sleep(2000);
		
		String Location1 = driver.findElement(venueTitle).getText();
		
//		Verifying the Details
		
		if (Location.equals(Location1)) {
			
			System.out.println("Successfully Verified the Loaction details");
			
		} else {
			
			System.out.println("Failed to verify the Location Details");

		}


		
		
		return new LocationAndTiming(driver);
	}



}

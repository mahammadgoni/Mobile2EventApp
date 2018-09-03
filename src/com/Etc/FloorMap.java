package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class FloorMap extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By progressBar = By.id("progress_small");
	
//	Clicking On Floor Map Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnFloorMap = By.xpath("//*[@content-desc='Floor Map']");
	
	By floorMap1stTitle = By.id("tv_maps_value");
	
	By chooseFloorMap = By.id("tv_floormap");
	
	By selectFloorMap = By.id("android:id/text1");
	
	By clickOnOK = By.id("btn_csdialog_cancel");
	
	By wayfinder = By.xpath("//*[@content-desc='Wayfinder']");
	
	By source = By.id("tv_source");
	
	By selectSource = By.id("android:id/text1");
	
	By destination = By.id("tv_destination");
	
	By selectDestination = By.id("android:id/text1");
	
	By getDirection = By.id("tv_getdirection");
	
	By routePopUp = By.id("iv_routeUP");
	
	By detailRoute = By.xpath("//*[@text='Detail Route']");
	
	

	public FloorMap(WebDriver driver) {
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
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu Option ");

		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(clickOnEtc);

		driver.findElement(clickOnEtc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Floor Map");

		waitForClickabilityOf(clickOnFloorMap);

		driver.findElement(clickOnFloorMap).click();
		
	}
	
	public FloorMap viewFloorMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Floor Map to see the details");

		waitForClickabilityOf(floorMap1stTitle);
		
		boolean Info = driver.findElement(floorMap1stTitle).isDisplayed();

		driver.findElement(floorMap1stTitle).click();
		
//		Verifying the Details
		
		if (Info==true) {
			
			System.out.println("Successfully Viewed the Floor Map Details");
			
		} else {
			
			System.out.println("Failed to View the Floor Map Details");

		}
		
		
		return new FloorMap(driver);
	}
	
	public FloorMap wayFinder(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Clicking on 1st Floor Map");

			waitForClickabilityOf(floorMap1stTitle);
			
			driver.findElement(floorMap1stTitle).click();
			
		} catch (Exception e) {
			
		}
		

		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Way Finder");

		waitForClickabilityOf(wayfinder);
		
		driver.findElement(wayfinder).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Source");

		waitForClickabilityOf(source);
		
		driver.findElement(source).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the Source");

		waitForClickabilityOf(selectSource);
		
		driver.findElement(selectSource).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Destination");

		waitForClickabilityOf(destination);
		
		driver.findElement(destination).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the Destination");

		waitForClickabilityOf(selectDestination);
		
		driver.findElement(selectDestination).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Get Direction");

		waitForClickabilityOf(getDirection);
		
		driver.findElement(getDirection).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Detail Route Pop Up");

		waitForClickabilityOf(routePopUp);
		
		driver.findElement(routePopUp).click();
		
		Thread.sleep(2000);
		
		String Route = driver.findElement(detailRoute).getText();
				
//		Verifying the Details
		
		if (Route.equals("Detail Route")) {
			
			System.out.println("Successfully Verified the Way Finder");
			
		} else {
			
			System.out.println("Failed to verify the Way Finder");

		}
		
		
		return new FloorMap(driver);
		
	}

}

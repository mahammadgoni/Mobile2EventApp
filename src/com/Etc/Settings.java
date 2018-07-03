package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Settings extends BaseSetUp{
	
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By progressBar = By.id("progress_small");
	
//	Clicking On Settings Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnSettings = By.xpath("//*[@content-desc='Settings']");
	
	By aboutApp = By.xpath("//*[@text='About App']");
	
	By aboutTitle = By.id("txt_topHeading");
	
	By refreshData = By.xpath("//*[@text='Refresh Data']");
	
	

	public Settings(WebDriver driver) {
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
		
		System.out.println("Clicking on Settings");

		waitForClickabilityOf(clickOnSettings);

		driver.findElement(clickOnSettings).click();
		
	}
	
	public Settings refreshData(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Refresh Data ");

		waitForClickabilityOf(refreshData);

		driver.findElement(refreshData).click();
		
		Thread.sleep(2000);
		
		boolean Info = driver.findElement(refreshData).isDisplayed();
		
//		Verifying the Details
		
		if (Info==false) {
			
			System.out.println("Successfully Refreshed the Data");
			
		} else {
			
			System.out.println("Failed to Refresh the Data");

		}
		
		
		
		
		return new Settings(driver);
	}
	
	public Settings aboutApp(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on About App");

		waitForClickabilityOf(aboutApp);

		driver.findElement(aboutApp).click();
		
		Thread.sleep(2000);
		
		String Title = driver.findElement(aboutTitle).getText();
		
		Thread.sleep(2000);
		
//		Verifying the Details
		
		if (Title.equals("About")) {
			
			System.out.println("Successfully Verified About App details");
			
		} else {
			
			System.out.println("Failed to verify the About App Details");

		}
		
		
		return new Settings(driver);
	}

}

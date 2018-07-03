package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class UsefullInfo extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By progressBar = By.id("progress_small");
	
//	Clicking On Useful Info Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnUsefulInfo = By.xpath("//*[@content-desc='Useful Info']");
	
	By infoTitle = By.id("tv_name_value");
	

	
	

	public UsefullInfo(WebDriver driver) {
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
		
		System.out.println("Clicking on Useful Info");

		waitForClickabilityOf(clickOnUsefulInfo);

		driver.findElement(clickOnUsefulInfo).click();
		
	}
	
	public UsefullInfo viweUsefulInfo(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		boolean Info = driver.findElement(infoTitle).isDisplayed();
		
//		Verifying the Details
		
		if (Info==true) {
			
			System.out.println("Successfully Viewed the Useful Info");
			
		} else {
			
			System.out.println("Failed to View the Useful Info");

		}
		
		
		return new UsefullInfo(driver);
	}

}

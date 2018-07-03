package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Home extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By progressBar = By.id("progress_small");
	
//	Clicking On Home Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnHome = By.xpath("//*[@content-desc='Home']");
	
	By homeTitle = By.id("txt_topHeading");
	
	

	public Home(WebDriver driver) {
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
		
		System.out.println("Clicking on Home");

		waitForClickabilityOf(clickOnHome);

		driver.findElement(clickOnHome).click();
		
	}
	
	public Home home(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		String homeScreen = driver.findElement(homeTitle).getText();
				
//		Verifying the Details
		
		if (homeScreen.equals("Home")) {
			
			System.out.println("Successfully Verified the Home Option");
			
		} else {
			
			System.out.println("Failed to verify the Home Option");

		}
		
		
		return new Home(driver);
	}

}

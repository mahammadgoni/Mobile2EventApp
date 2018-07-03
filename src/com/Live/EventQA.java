package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class EventQA extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Event QA Elements
	
	By clickOnLive = By.xpath("//*[@content-desc='Live']");
	
	By clickOnEventQA = By.xpath("//*[@content-desc='Event QA']");
	
	By typeAQuestion = By.id("edit_txt");
	
	By btnSubmit = By.id("tv_rightButton");
	

	public EventQA(WebDriver driver) {
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
		
		System.out.println("Clicking on Live ");

		waitForClickabilityOf(clickOnLive);

		driver.findElement(clickOnLive).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Event QA");

		waitForClickabilityOf(clickOnEventQA);

		driver.findElement(clickOnEventQA).click();
		
	}
	
	public EventQA eventQA(String userName,String password,String Question) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Question");

		waitForClickabilityOf(typeAQuestion);

		driver.findElement(typeAQuestion).clear();
		
		driver.findElement(typeAQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		System.out.println("Successfully Posted the Question");
		
		
		
		return new EventQA(driver);
	}

}

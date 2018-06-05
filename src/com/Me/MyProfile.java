package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class MyProfile extends BaseSetUp{
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By forgotPassBtn = By.id("ws.e2m.main:id/tv_forgot_pswd");
	
	By submitBtn = By.id("ws.e2m.main:id/tv_submit");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
//	Clicking On My Profile Elements
	
	By clickOnMe = By.xpath("//*[@content-desc='Me']");
	
	By clickOnMyProfile = By.xpath("//*[@content-desc='My Profile']");
	
	By editMyProfile = By.xpath("//*[@content-desc='Edit profile']");
	
	By tagTab = By.xpath("//*[@text='Tag']");
	
	By genTab = By.xpath("//*[@text='General']");
		
	By firstName = By.id("ws.e2m.main:id/et_myprofile_firstName");
	
	By lastName = By.id("ws.e2m.main:id/et_myprofile_lastName");
	
	By designation = By.id("ws.e2m.main:id/et_myprofile_desig");
	
	By company = By.id("ws.e2m.main:id/et_myprofile_company");
	
	By phoneNo = By.id("ws.e2m.main:id/et_myprofile_phone");
	
	By description = By.id("ws.e2m.main:id/tv_myprofile_description_header");
	
	By addDescription = By.xpath("//*[@bounds='[0,384][1080,984]']");
	
	By doneBtn = By.id("ws.e2m.main:id/tv_rightButton");
	
	By selectTag = By.id("ws.e2m.main:id/Checkbox_selectCategory");
	
	
	
	

	public MyProfile(WebDriver driver) {
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
		
		System.out.println("Clicking on Me ");

		waitForClickabilityOf(clickOnMe);

		driver.findElement(clickOnMe).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Profile");

		waitForClickabilityOf(clickOnMyProfile);

		driver.findElement(clickOnMyProfile).click();
		
	}
	
	public MyProfile editMyProfile(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		
		
		return new MyProfile(driver);
	}

}

package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Exhibitors extends BaseSetUp{
	
	
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By forgotPassBtn = By.id("ws.e2m.main:id/tv_forgot_pswd");
	
	By submitBtn = By.id("ws.e2m.main:id/tv_submit");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
//	Exhibitors Elements
	
	By clickOnAgenda = By.xpath("//android.widget.ImageView[@content-desc='Agenda']");
	
	By clickOnExhibitors = By.xpath("//*[@text='Exhibitors']");
	
	By exhibitorOne = By.xpath("//*[@bounds='[2,567][1080,785]']");
	
	By exhibitorName = By.xpath("//*[@bounds='[204,606][349,671]']");
	
	By exhibitorOneName = By.xpath("//*[@bounds='[237,340][826,413]']");
	
	By exhibitorType = By.xpath("//*[@bounds='[237,462][826,511]']");
	
	

	public Exhibitors(WebDriver driver) {
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
		
		System.out.println("Clicking on My Agenda ");

		waitForClickabilityOf(clickOnAgenda);

		driver.findElement(clickOnAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Exhibitors ");

		waitForClickabilityOf(clickOnExhibitors);

		driver.findElement(clickOnExhibitors).click();
		
	}
	
//	Exhibitors Name Test Method
	
	public Exhibitors exhibitorsName(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		String ExbtrOne = driver.findElement(exhibitorName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Exhibitor");

		waitForClickabilityOf(exhibitorName);

		driver.findElement(exhibitorName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Exhibitor Details ");
		
		String ExbtrOne1 = driver.findElement(exhibitorOneName).getText();	
		
		Thread.sleep(2000);
		
		String ExbtrType = driver.findElement(exhibitorType).getText();	
		
		System.out.println("Exhibitor Name  : "+ExbtrOne1);
		
		System.out.println("Exhibitor Type  : "+ExbtrType);
		
//		Verifying the Exhibitors Details
		
		if (ExbtrOne.equals(ExbtrOne1)) {
			
			System.out.println("Successfully Verified the Exhibitors Name");
			
		} else {
			
			System.out.println("Failed to Verify the Exhibitors Name");

		}

		
		
		return new Exhibitors(driver);
		
	}


}

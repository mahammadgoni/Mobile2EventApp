package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Sponsors extends BaseSetUp{
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Sponsors Elements
	
	By clickOnAgenda = By.xpath("//android.widget.ImageView[@content-desc='Agenda']");
	
	By clickOnSponsors = By.xpath("//*[@text='Sponsors']");
	
	By clickOnType = By.xpath("//*[@text='Type']");
	
	By clickOnSaveToContact = By.xpath("//*[@content-desc='Save to contacts']");
		
	By sponsorsName = By.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
	
	By sponsorsTypeName = By.xpath("//android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]");
		
	By sponsorsOneName = By.id("tv_exhibitor_company");
	
	By clickOnBookmark = By.xpath("//*[@content-desc='Add bookmark']");
	
	By clickOnWebsite = By.xpath("//*[@content-desc='Website']");
	
	By sponsorsType = By.xpath("//*[@bounds='[237,462][826,511]']");
	
	

	public Sponsors(WebDriver driver) {
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
		
		System.out.println("Clicking on Sponsors ");

		waitForClickabilityOf(clickOnSponsors);

		driver.findElement(clickOnSponsors).click();
		
	}
	
//	Sponsors Name Test 
	
	public Sponsors sponsorsName(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		String SpsnsOne = driver.findElement(sponsorsName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Sponsor");

		waitForClickabilityOf(sponsorsName);

		driver.findElement(sponsorsName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Sponsors Details ");
		
		String SpsnsOne1 = driver.findElement(sponsorsOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
				
		try {
			
			System.out.println("Clicking on Bookmark Sponsors");

			waitForClickabilityOf(clickOnBookmark);

			driver.findElement(clickOnBookmark).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Sponsors Website");

			waitForClickabilityOf(clickOnWebsite);

			driver.findElement(clickOnWebsite).click();
			
//			Going Back to Sponsors
			
			Thread.sleep(2000);
			
			driver.navigate().back();
					
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
				
		System.out.println("Sponsors Name  : "+SpsnsOne1);
		
//		Verifying the Sponsors Details
		
		if (SpsnsOne.equals(SpsnsOne1)) {
			
			System.out.println("Successfully Verified the Sponsors Name");
			
		} else {
			
			System.out.println("Failed to Verify the Sponsors Name");

		}
	
		
		return new Sponsors(driver);
	}
	
//	Exhibitor Type Test Method
	
	public Sponsors sponsorsType(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors Type");

		waitForClickabilityOf(clickOnType);

		driver.findElement(clickOnType).click();
		
		Thread.sleep(2000);
		
		String SpsnsOne = driver.findElement(sponsorsTypeName).getText();		
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Sponsors");

		waitForClickabilityOf(sponsorsTypeName);

		driver.findElement(sponsorsTypeName).click();
		
		Thread.sleep(2000);
		
		System.out.println("Checking the Sponsors Details");
		
		String SpsnsOne1 = driver.findElement(sponsorsOneName).getText();	
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Contact");

		waitForClickabilityOf(clickOnSaveToContact);

		driver.findElement(clickOnSaveToContact).click();
		
		Thread.sleep(2000);
		
		try {

			System.out.println("Clicking on Bookmark Sponsors");

			waitForClickabilityOf(clickOnBookmark);

			driver.findElement(clickOnBookmark).click();
			
		} catch (Exception e) {
			
		}
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Sponsors Website");

		waitForClickabilityOf(clickOnWebsite);

		driver.findElement(clickOnWebsite).click();
		
//		Going Back to Sponsors
		
		Thread.sleep(2000);
		
		driver.navigate().back();
	
		Thread.sleep(2000);
		
		System.out.println("Exhibitor Name  : "+SpsnsOne1);
		
//		Verifying the Sponsors Details
		
		if (SpsnsOne.equals(SpsnsOne1)) {
			
			System.out.println("Successfully Verified the Sponsors Type");
			
		} else {
			
			System.out.println("Failed to Verify the Sponsors Type");

		}
		
		
		return new Sponsors(driver);
		
		
	}


}

package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class OneToOneMessage extends BaseSetUp{
	
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	One To One Message Elements
	
	By clickOnLive = By.xpath("//android.widget.ImageView[@content-desc='Live']");
	
	By clickOnOneToOneMsg = By.xpath("//*[@content-desc='One to one message']");
	
	By clickOnEditMsg = By.xpath("//*[@content-desc='Write a message']");
	
	By select1stAttendee = By.xpath("//android.widget.ListView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]");
	
	By writeHere = By.xpath("//*[@text='Write here']");
	
	By sendBtn = By.id("btn_send");
	
	

	public OneToOneMessage(WebDriver driver) {
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
		
		System.out.println("Clicking on One To One Message ");

		waitForClickabilityOf(clickOnOneToOneMsg);

		driver.findElement(clickOnOneToOneMsg).click();
		
	}
	
	public OneToOneMessage oneToOneMsg(String userName,String password,String Message) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Write Message Button ");

		waitForClickabilityOf(clickOnEditMsg);

		driver.findElement(clickOnEditMsg).click();
		
		Thread.sleep(2000);
		
		try {
			
			System.out.println("Selecting Attendee to Send the Message");

			waitForClickabilityOf(select1stAttendee);

			driver.findElement(select1stAttendee).click();
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Message");

		waitForClickabilityOf(writeHere);

		driver.findElement(writeHere).clear();
		
		driver.findElement(writeHere).sendKeys(Message);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Send Button ");

		waitForClickabilityOf(sendBtn);

		driver.findElement(sendBtn).click();
		
		Thread.sleep(4000);
		
//      Verifying Condition 
		
		String SentMsg = driver.findElement(By.xpath("//*[@text='"+Message+"']")).getText();
		
		if (SentMsg.equals(Message)) {
			
			System.out.println("Successfully Sent the One To One Message");
			
		} else {
			
			System.out.println("Failed to Send the One To One Message");

		}
		
		
		
		
		return new OneToOneMessage(driver);
		
	}

}

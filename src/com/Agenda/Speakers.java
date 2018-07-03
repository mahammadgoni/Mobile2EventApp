package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Speakers extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Schedule Elements
	
	By clickOnAgenda = By.xpath("//android.widget.ImageView[@content-desc='Agenda']");
	
	By clickOnSpeakers = By.xpath("//*[@text='Speakers']");
	
	By speakerOne = By.xpath("//android.view.View[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.RelativeLayout");
	
	By speakerTwo = By.xpath("//android.view.View[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout");
	
	By speakerThree = By.xpath("//android.view.View[2]/android.widget.RelativeLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.RelativeLayout");
	
	By speakerName = By.id("tv_speaker_name");
	

	public Speakers(WebDriver driver) {
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
		
		System.out.println("Clicking on Schedule ");

		waitForClickabilityOf(clickOnSpeakers);

		driver.findElement(clickOnSpeakers).click();
		
	}
	
//	Verify Speaker Details
	
	public Speakers speakerDetails(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on 1st Speaker ");

		waitForClickabilityOf(speakerOne);
		
		String SpeakerNameOne = driver.findElement(speakerOne).getText();

		driver.findElement(speakerOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Verifying Speaker Details ");

		waitForClickabilityOf(speakerName);
		
		String SpeakerNameOne1 = driver.findElement(speakerName).getText();
		
//		Verifying Condition
		
		if (SpeakerNameOne.equals(SpeakerNameOne1)) {
			
			System.out.println("Successfully Verified Speaker Details");
			
		} else {
			
			System.out.println("Failed to Verify Speaker Details");

		}
				
		
		
		return new Speakers(driver);
		
	}
	
	
	
	

}

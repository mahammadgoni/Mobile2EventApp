package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;
import com.Utils.AndroidSetUp;



public class PlayCenter extends BaseSetUp{
	
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Play Center Elements
	
	By clickOnLive = By.xpath("//*[@content-desc='Live']");
	
	By clickOnPlayCenter = By.xpath("//*[@content-desc='Play Center']");
	
	By clickOnQuizMap = By.xpath("//*[@text='Quiz Map']");
	
	By howToPlay = By.id("h_to_play_iv");
	
	By clickOnProceed = By.id("proceed_iv");
	
	By progressStatus = By.id("module_progress_rl");
	
	By clickOnMkFriendMap = By.xpath("//*[@text='Making Friend Map']");	
	
	By clickOnLocationMap = By.xpath("//*[@text='Location Map']");
	
	

	public PlayCenter(WebDriver driver) {
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
		
		System.out.println("Scrolling till Play Center");
		
		AndroidSetUp setUp = new AndroidSetUp();
		
		setUp.scrollDown();
							
		Thread.sleep(2000);
		
		System.out.println("Clicking on Play Center");

		waitForClickabilityOf(clickOnPlayCenter);

		driver.findElement(clickOnPlayCenter).click();
		
	}
	
//	Play Quiz Method 
	
	public PlayCenter quizMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Quiz Map");

		waitForClickabilityOf(clickOnQuizMap);

		driver.findElement(clickOnQuizMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(progressStatus).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Quiz Map");
			
		} else {
			
			System.out.println("Failed to Verify the Quiz Map");

		}
			
		
		return new PlayCenter(driver);
		
	}
	
//	Making Friend Method
	
	public PlayCenter makingFriendMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Making Friend");

		waitForClickabilityOf(clickOnMkFriendMap);

		driver.findElement(clickOnMkFriendMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(progressStatus).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Making Friend Map");
			
		} else {
			
			System.out.println("Failed to Verify the Making Friend Map");

		}
		
		
		
		return new PlayCenter(driver);
		
	}
	
	public PlayCenter locationMap(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Location Map");

		waitForClickabilityOf(clickOnLocationMap);

		driver.findElement(clickOnLocationMap).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on How to Play");

		waitForClickabilityOf(howToPlay);

		driver.findElement(howToPlay).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(clickOnProceed);

		driver.findElement(clickOnProceed).click();
		
//      Verifying Condition 
		
		boolean ModuleStatus = driver.findElement(progressStatus).isDisplayed();
		
		if (ModuleStatus==true) {
			
			System.out.println("Successfully Verified the Location Map");
			
		} else {
			
			System.out.println("Failed to Verify the Location Map");

		}
				
		
		
		return new PlayCenter(driver);
		
	}

}

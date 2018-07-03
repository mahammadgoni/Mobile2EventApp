package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Bookmarks extends BaseSetUp{

	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Clicking On Bookmark Elements
	
	By clickOnMe = By.xpath("//*[@content-desc='Me']");
	
	By clickOnBookmarks = By.xpath("//*[@content-desc='Bookmarks']");
		
	By clickOnSchedule = By.xpath("//android.widget.LinearLayout[1]/android.widget.TextView");
		
	By unBookmark = By.xpath("//*[@content-desc='Remove bookmark']");
	
	
	
	public Bookmarks(WebDriver driver) {
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
		
		System.out.println("Clicking on Bookmarks");

		waitForClickabilityOf(clickOnBookmarks);

		driver.findElement(clickOnBookmarks).click();
		
	}
	
	public Bookmarks bookmarked(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Schedule");

		waitForClickabilityOf(clickOnSchedule);

		driver.findElement(clickOnSchedule).click();
		
//      Verifying Condition 
		
		boolean BookmarkStatus = driver.findElement(unBookmark).isDisplayed();
		
		if (BookmarkStatus==true) {
			
			System.out.println("Successfully Verified the Bookmark Check");
			
		} else {
			
			System.out.println("Failed to Verify the Bookmark Check");

		}
		
		
		return new Bookmarks(driver);
	}

}

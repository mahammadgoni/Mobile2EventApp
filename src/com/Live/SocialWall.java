package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class SocialWall extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By liveOption = By.xpath("//*[@content-desc='Live']");
	
	By menu = By.id("btn_home");
	
	By socialWall = By.xpath("//*[@content-desc='Social Wall']");
	
	By addTopic = By.id("btn_right");
	
//	By addTopic = By.xpath("//android.widget.ImageView[@content-desc='Add topic']");
	
	By addComment = By.id("et_comment");
	
	By submitComment = By.id("tv_rightButton");
	
	By postedComment = By.xpath("//android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView");
	

	public SocialWall(WebDriver driver) {
		super(driver);

	}
	
//	This Login Method will perform Login actions,Just need to call it in Method
	
	public void Login(String userName,String password) throws InterruptedException{
		
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
		
	}
	
	public SocialWall socialWall(String userName,String password,String Comment) throws InterruptedException{
		
		Login(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Menu to Expand Options");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Live Option");
		
		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Social Wall");
		
		waitForClickabilityOf(socialWall);

		driver.findElement(socialWall).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Topic Button to add Status");
		
		waitForClickabilityOf(addTopic);

		driver.findElement(addTopic).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Status Comment"+Comment);
		
		waitForClickabilityOf(addComment);

		driver.findElement(addComment).sendKeys(Comment);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Submit to Add  Status Comment");
		
		waitForClickabilityOf(submitComment);

		driver.findElement(submitComment).click();
		
		Thread.sleep(4000);
		
		waitForClickabilityOf(postedComment);
		
		String PostedComment = driver.findElement(postedComment).getText();
		
		Thread.sleep(2000);
			
		if (Comment.equals(PostedComment)) {
			
			System.out.println("Successfully Posted the Comment");
			
		} else {
			
			System.out.println("Failed to Post the Comment");

		}
	
		
		return new SocialWall(driver);
		
	}
	

}

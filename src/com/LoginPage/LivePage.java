package com.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LivePage extends BaseSetUp{
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By liveOption = By.xpath("//*[@content-desc='Live']");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
	By socialWall = By.xpath("//*[@content-desc='Social Wall']");
	
	By addTopic = By.id("ws.e2m.main:id/btn_right");
	
//	By addTopic = By.xpath("//android.widget.ImageView[@content-desc='Add topic']");
	
	By addComment = By.id("ws.e2m.main:id/et_comment");
	
	By submitComment = By.id("ws.e2m.main:id/tv_rightButton");
	
	By postedComment = By.xpath("//*[@resource-id='ws.e2m.main:id/tv_topic' and @instance='4']");
	


	public LivePage(WebDriver driver) {
		super(driver);
		
	}
	
//	This Login Method will perform Login actions,Just need to call it in Method
	
	public void Login(String userName,String password){
		
		System.out.println("Clicking on Your Email ");

		waitForClickabilityOf(emailId);

		driver.findElement(emailId).clear();

		System.out.println("Entering the Email  :" + userName);

		driver.findElement(emailId).sendKeys(userName);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn1);

		driver.findElement(proceedBtn1).click();

		System.out.println("Entering the Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
	}
	
	
	public LivePage SocialWall(String userName,String password,String Comment){
		
		Login(userName, password);
		
		System.out.println("Clicking on Menu to Expand Options");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		System.out.println("Clicking on Live Option");
		
		waitForClickabilityOf(liveOption);

		driver.findElement(liveOption).click();
		
		System.out.println("Clicking on Social Wall");
		
		waitForClickabilityOf(socialWall);

		driver.findElement(socialWall).click();
		
		System.out.println("Clicking on Add Topic Button to add Status");
		
		waitForClickabilityOf(addTopic);

		driver.findElement(addTopic).click();
		
		System.out.println("Entering Status Comment"+Comment);
		
		waitForClickabilityOf(addComment);

		driver.findElement(addComment).sendKeys(Comment);
		
		System.out.println("Clicking On Submit to Add  Status Comment");
		
		waitForClickabilityOf(submitComment);

		driver.findElement(submitComment).click();
		
		String PostedComment = driver.findElement(postedComment).getText();
		
//		System.out.println("Comment is : "+Comment);
//		
//		System.out.println("Posted Comment is : "+PostedComment);
		
		if (Comment.equals(PostedComment)) {
			
			System.out.println("Successfully Posted the Comment");
			
		} else {
			
			System.out.println("Failed to Post the Comment");

		}
	
		
		return new LivePage(driver);
		
	}

}

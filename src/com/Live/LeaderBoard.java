package com.Live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LeaderBoard extends BaseSetUp{
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Leader Board Elements
	
	By clickOnLive = By.xpath("//*[@content-desc='Live']");
	
	By clickOnLeaderBoard = By.xpath("//*[@content-desc='Leaderboard']");
	
	By usersTab = By.xpath("//*[@text='Users']");
	
	By usersPoints = By.id("tvScore");
	
	By groupTab = By.xpath("//*[@text='Group']");
	
	By groupPoints = By.id("tvScore");
	
	By myAchievementsTab = By.xpath("//*[@text='MyAchievements']");
	
	By myPoints = By.id("tvRank");
	
	By activityNo1 = By.xpath("//*[@bounds='[0,744][289,797]']");
	
	By activityNo2 = By.xpath("//*[@bounds='[0,890][311,943]']");
	
	By activityName1 = By.xpath("//*[@bounds='[289,744][719,797]']");
	
	By activityName2 = By.xpath("//*[@bounds='[311,890][597,943]']");
	

	public LeaderBoard(WebDriver driver) {
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
		
		System.out.println("Clicking on Leader Board");

		waitForClickabilityOf(clickOnLeaderBoard);

		driver.findElement(clickOnLeaderBoard).click();
		
	}
	
	public LeaderBoard leaderBoardDetails(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
				
		waitForClickabilityOf(usersPoints);
		
		String UserPoints = driver.findElement(usersPoints).getText();
		
		System.out.println("Users Point : "+UserPoints);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Group Tab");
		
		waitForClickabilityOf(groupTab);

		driver.findElement(groupTab).click();
		
		Thread.sleep(2000);
		
		try {
			
			waitForClickabilityOf(groupPoints);
			
			String GroupPoints = driver.findElement(groupPoints).getText();
			
			System.out.println("Groups Point : "+GroupPoints);
			
		} catch (Exception e) {
			
		}
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Achievements Tab");

		waitForClickabilityOf(myAchievementsTab);
		
		driver.findElement(myAchievementsTab).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(myPoints);
		
		String MyPoints = driver.findElement(myPoints).getText();
		
		System.out.println("My Achievements Point : "+MyPoints);
		
		Thread.sleep(2000);
		
		try {
			
			waitForClickabilityOf(activityNo1);
			
			String Activity1 = driver.findElement(activityNo1).getText();
			
			System.out.println("My Activity : "+Activity1);
			
			Thread.sleep(2000);
			
			waitForClickabilityOf(activityNo2);
			
			String Activity2 = driver.findElement(activityNo2).getText();
			
			System.out.println("My Activity  : "+Activity2);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		String Total = UserPoints+" Points";
		
//		Verify the Condition
		
		if (Total.equals(MyPoints)) {
			
			System.out.println("Successfully Verified Leader Board Details");
			
		} else {
			
			System.out.println("Failed to Verify Leader Board Details");

		}
		
		
		
		return new LeaderBoard(driver);
		
	}

}

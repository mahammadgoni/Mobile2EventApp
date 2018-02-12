package com.MobilePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LoginPage extends BaseSetUp{
	
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By addTopic = By.id("ws.e2m.main:id/btn_right");
	
	By addComment = By.id("ws.e2m.main:id/et_comment");
	
	By submitComment = By.id("ws.e2m.main:id/et_comment");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
	By profile = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public LoginPage accountLogin(String userName,String password){
		
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
		
		waitForClickabilityOf(menu);
				
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Succefully Logged in to your Account");
			
		} else {
			
			System.out.println("Failed to Login to your");

		}
		
			
		return new LoginPage(driver);
		
	}
	
	public LoginPage accountLogout(){
		
		
		return new LoginPage(driver);
		
	}



}

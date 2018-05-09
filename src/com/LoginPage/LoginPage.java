package com.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class LoginPage extends BaseSetUp{
	
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By forgotPassBtn = By.id("ws.e2m.main:id/tv_forgot_pswd");
	
	By submitBtn = By.id("ws.e2m.main:id/tv_submit");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
	By profile = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	By logoutBtn = By.xpath("//*[@text='Log out']");
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
//	Login to Account Method
	
	public LoginPage accountLogin(String userName,String password) throws InterruptedException{
		
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
		
		waitForClickabilityOf(menu);
				
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Successfully Logged in to your Account");
			
		} else {
			
			System.out.println("Failed to Login to your Account");

		}
		
			
		return new LoginPage(driver);
		
	}
	
//	Forgot Password Method
	
	public LoginPage forgotPassword(String userName,String password) throws InterruptedException{
		
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
		
		System.out.println("Clicking on Forgot Password Button ");

		waitForClickabilityOf(forgotPassBtn);

		driver.findElement(forgotPassBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(submitBtn);

		driver.findElement(submitBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering the New Pin  :" + password);

		waitForClickabilityOf(pass);
		
		driver.findElement(pass).clear();

		driver.findElement(pass).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(menu);
				
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Successfully Logged in to with New Password");
			
		} else {
			
			System.out.println("Failed to Login with New Password");

		}
		
		
		
		
		
		
		
		return new LoginPage(driver);
		
	}
	
//	Logout from Account Method
	
	public LoginPage accountLogout(){
		
		System.out.println("Logging out From Account");
		
		waitForClickabilityOf(menu);
		
		driver.findElement(menu).click();
		
		waitForClickabilityOf(logoutBtn);
		
		driver.findElement(logoutBtn).click();
		
		
		return new LoginPage(driver);
		
	}



}

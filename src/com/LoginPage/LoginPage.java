package com.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.BaseSetup.BaseSetUp;

public class LoginPage extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By profile = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	By logoutBtn = By.xpath("//*[@text='Log out']");
	
//	Change Password Elements
	
	By clickOnMe = By.xpath("//android.widget.ImageView[@content-desc='Me']");
	
	By myProfile = By.xpath("//android.widget.ImageView[@content-desc='My Profile']");
	
	By changePassword = By.id("tv_chang_pass");
	
	By oldPassword = By.xpath("//*[@bounds='[66,492][696,591]']");
	
	By newPassword = By.xpath("//*[@bounds='[66,723][696,822]']");
	
	By confirmPassword = By.xpath("//*[@bounds='[66,954][696,1053]']");
	
	By successMessage = By.xpath("//*[@bounds='[147,528][933,918]']");
	
	By saveBtn = By.xpath("//android.widget.Button[@content-desc='Save']");
	
//	Verify Home Page Elements 
	
	By noOfOptions = By.id("item_image");
		
	
	
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
		
		Thread.sleep(4000);
		
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

//	Change Password Method
	
	public LoginPage changePassword(String userName,String password,String NewPassword) throws InterruptedException{
		
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
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Menu Option ");
		
		waitForClickabilityOf(menu);

		driver.findElement(menu).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Me Option ");
		
		waitForClickabilityOf(clickOnMe);

		driver.findElement(clickOnMe).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on My Profile ");
		
		waitForClickabilityOf(myProfile);

		driver.findElement(myProfile).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Change Password");
		
		waitForClickabilityOf(changePassword);

		driver.findElement(changePassword).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering Old Password");
		
		waitForClickabilityOf(oldPassword);

		driver.findElement(oldPassword).clear();
		
		driver.findElement(oldPassword).sendKeys(password);
		
		Thread.sleep(2000);
		
		System.out.println("Entering New Password");
		
		waitForClickabilityOf(newPassword);

		driver.findElement(newPassword).clear();
		
		driver.findElement(newPassword).sendKeys(NewPassword);
		
		Thread.sleep(2000);
		
		System.out.println("Entering Confirm Password");
		
		waitForClickabilityOf(confirmPassword);

		driver.findElement(confirmPassword).clear();
		
		driver.findElement(confirmPassword).sendKeys(NewPassword);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Button");
		
		waitForClickabilityOf(saveBtn);

		driver.findElement(saveBtn).click();
		
		Thread.sleep(2000);
				
		waitForClickabilityOf(successMessage);
		
		if (driver.findElement(successMessage).isDisplayed()==true) {
			
			System.out.println("Successfully Changed the Password");
			
		} else {
			
			System.out.println("Failed to Change the Password");

		}
				
		
		return new LoginPage(driver);
		
	}
	
//	Verify Home Page Method
	
	public LoginPage homePageVerify(String userName,String password) throws InterruptedException{
		
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
		
		Thread.sleep(4000);
		
		System.out.println("Clicking on Proceed Button ");

		waitForClickabilityOf(proceedBtn2);

		driver.findElement(proceedBtn2).click();
		
		Thread.sleep(4000);
		
		waitForClickabilityOf(menu);
		
		if (driver.findElement(menu).isDisplayed()==true) {
			
			System.out.println("Home Page is Loaded and Verified Properly");
			
		} else {
			
			System.out.println("Failed to Load and Verify the Home Page");

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

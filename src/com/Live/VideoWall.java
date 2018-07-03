package com.Live;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class VideoWall extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Video Wall Elements
	
	By clickOnLive = By.xpath("//android.widget.ImageView[@content-desc='Live']");
	
	By clickOnVideoWall = By.xpath("//*[@content-desc='VideoWall']");
	
	By clickOnVideo = By.xpath("//*[@content-desc='Upload Video']");
	
	By proceedBtn = By.id("btn_record_procced");
	
	By takeVideo = By.id("upld_vid_take");
	
	By clickOnRecord = By.xpath("//*[@content-desc='Record']");
	
	By clickOnSave = By.xpath("//*[@content-desc='Save']");
	
	By videoCaption = By.id("edt_UV_caption");
	
	By uploadBtn = By.id("tv_rightButton");
	
	By existingVideo = By.id("upld_vid_lib");
	
	By select1stVideo = By.xpath("//android.widget.RelativeLayout/android.widget.GridView/android.widget.FrameLayout[1]");
	
	By listView = By.xpath("//*[@content-desc='List view']");
	
	By justNow = By.xpath("//*[@text='Just now']");
	

	public VideoWall(WebDriver driver) {
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
		
		System.out.println("Clicking on Video Wall");

		waitForClickabilityOf(clickOnVideoWall);

		driver.findElement(clickOnVideoWall).click();
		
	}
	
	public VideoWall videoUpload(String userName,String password,boolean Take,String Caption) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Video Symbol");

		waitForClickabilityOf(clickOnVideo);

		driver.findElement(clickOnVideo).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Proceed Button");

		waitForClickabilityOf(proceedBtn);

		driver.findElement(proceedBtn).click();
		
		if (Take==true) {
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Take Video");

			waitForClickabilityOf(takeVideo);

			driver.findElement(takeVideo).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Record Button to start video");

			waitForClickabilityOf(clickOnRecord);

			driver.findElement(clickOnRecord).click();
			
			Thread.sleep(2000);
			
			System.out.println("Recording Video now");
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			System.out.println("Clicking on Stop Button ");

			waitForClickabilityOf(clickOnRecord);

			driver.findElement(clickOnRecord).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Save Button");

			waitForClickabilityOf(clickOnSave);

			driver.findElement(clickOnSave).click();
			
		} else {
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Existing Video");

			waitForClickabilityOf(existingVideo);

			driver.findElement(existingVideo).click();
			
			Thread.sleep(2000);
			
			System.out.println("Selecting the Video");

			waitForClickabilityOf(select1stVideo);

			driver.findElement(select1stVideo).click();

		}
		
		Thread.sleep(2000);
		
		System.out.println("Entering the Video Caption");

		waitForClickabilityOf(videoCaption);

		driver.findElement(videoCaption).clear();
		
		driver.findElement(videoCaption).sendKeys(Caption);
		
		Thread.sleep(2000);
		
		System.out.println("Uploading the Video");

		waitForClickabilityOf(uploadBtn);

		driver.findElement(uploadBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On List View");

		waitForClickabilityOf(listView);

		driver.findElement(listView).click();
		
		Thread.sleep(2000);
		
		boolean Video = driver.findElement(justNow).isDisplayed();

		Thread.sleep(2000);
		
		if (Video==true) {
			
			System.out.println("Successfully Uploaded the Video");
			
		} else {
			
			System.out.println("Failed to Upload the Video");

		}
		
		
		return new VideoWall(driver);
	}

}

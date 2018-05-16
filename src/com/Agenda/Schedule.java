package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class Schedule extends BaseSetUp{
	
	By emailId = By.id("ws.e2m.main:id/et_email");
	
	By pass = By.id("ws.e2m.main:id/et_password");
	
	By proceedBtn1 = By.id("ws.e2m.main:id/tv_proceed");
	
	By proceedBtn2 = By.id("ws.e2m.main:id/rl_proceed");
	
	By forgotPassBtn = By.id("ws.e2m.main:id/tv_forgot_pswd");
	
	By submitBtn = By.id("ws.e2m.main:id/tv_submit");
	
	By menu = By.id("ws.e2m.main:id/btn_home");
	
//	Schedule Elements
	
	By clickOnAgenda = By.xpath("//android.widget.ImageView[@content-desc='Agenda']");
	
	By clickOnSchedule = By.xpath("//*[@bounds='[396,49][885,106]']");
	
	By timeTab = By.xpath("//*[@text='Time']");
	
	By session1st = By.xpath("//*[@bounds='[72,796][682,869]']");
	
	By bookmark = By.xpath("//*[@content-desc='Bookmark']");
	
	By addToCalender = By.xpath("//*[@text='Add To Calendar']");
	
	By rate = By.xpath("//*[@text='Rate']");
	
	By cancleRate = By.id("ws.e2m.main:id/btn_home");
	
	By takeNotes = By.xpath("//*[@text='Take Notes']");
	
	By addNote = By.id("ws.e2m.main:id/et_addnote_detail");
	
	By saveNote = By.id("ws.e2m.main:id/btn_right");
	
	By askAQuestion = By.xpath("//*[@text='Ask A Question']");
	
	By addQuestion = By.id("ws.e2m.main:id/et_ask");
	
	By saveQuestion = By.id("ws.e2m.main:id/tv_ask");
	
	By vote = By.xpath("//*[@text='Vote']");
	
	By addToAgenda = By.xpath("//*[@text='Add To Agenda']");
	
	By speakersList = By.id("ws.e2m.main:id/speaker_list_view_title");
	
	By tracksTab = By.xpath("//*[@text='Tracks']");
	
	By myAgendaTab = By.xpath("//*[@text='My Agenda']");
	
	

	public Schedule(WebDriver driver) {
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

		waitForClickabilityOf(clickOnSchedule);

		driver.findElement(clickOnSchedule).click();
		
	}
	
//	Checking Time Method
	
	@SuppressWarnings("rawtypes")
	public Schedule time(String userName,String password,String Notes,String Question) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Time Tab");

		waitForClickabilityOf(timeTab);

		driver.findElement(timeTab).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on the Session");

		waitForClickabilityOf(session1st);

		driver.findElement(session1st).click();
		
		Thread.sleep(2000);
		
		System.out.println("Bookmark This Session");

		waitForClickabilityOf(bookmark);

		driver.findElement(bookmark).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add To Calender");

		waitForClickabilityOf(addToCalender);

		driver.findElement(addToCalender).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Rate");

		waitForClickabilityOf(rate);

		driver.findElement(rate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");

		waitForClickabilityOf(cancleRate);

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Take Notes");

		waitForClickabilityOf(takeNotes);

		driver.findElement(takeNotes).click();
		
		Thread.sleep(2000);
		
		System.out.println("Adding Notes");

		waitForClickabilityOf(addNote);

		driver.findElement(addNote).clear();
		
		driver.findElement(addNote).sendKeys(Notes);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Right Simbol to Save Note");

		waitForClickabilityOf(saveNote);

		driver.findElement(saveNote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Add to Agenda");

		waitForClickabilityOf(addToAgenda);

		driver.findElement(addToAgenda).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Vote");

		waitForClickabilityOf(vote);

		driver.findElement(vote).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking Back Button");

		((AndroidDriver)driver).pressKeyCode(AndroidKeyCode.BACK);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask Question");

		waitForClickabilityOf(askAQuestion);

		driver.findElement(askAQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Addding New Question");

		waitForClickabilityOf(addQuestion);

		driver.findElement(addQuestion).clear();
		
		driver.findElement(addQuestion).sendKeys(Question);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Ask to Add Question");

		waitForClickabilityOf(saveQuestion);

		driver.findElement(saveQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Close Rate Option");
		
		boolean CancleBtn = driver.findElement(cancleRate).isDisplayed();

		driver.findElement(cancleRate).click();
		
		Thread.sleep(2000);		
		
		if (CancleBtn==true) {
			
			System.out.println("Successfully Verified All Schedule Time Elements");
			
		} else {
			
			System.out.println("Failed to Verify All Schedule Time Elements");

		}
		
		
				
		
		
		return new Schedule(driver);
		
	}

}
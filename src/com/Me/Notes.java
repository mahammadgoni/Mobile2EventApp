package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Notes extends BaseSetUp{
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Clicking On Notes Elements
	
	By clickOnMe = By.xpath("//*[@content-desc='Me']");
	
	By clickOnNotes = By.xpath("//*[@content-desc='Notes']");
		
	By clickOn1stSession = By.xpath("//android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.RelativeLayout");
	
	By addNotesBtn = By.xpath("//*[@content-desc='Add note']");
	
	By addNoteDetails = By.id("et_addnote_detail");
	
	By saveNoteBtn = By.xpath("//*[@content-desc='Save note']");
		
	By addedNote = By.xpath("//*[@content-desc='Remove bookmark']");

	public Notes(WebDriver driver) {
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
		
		System.out.println("Clicking on Notes");

		waitForClickabilityOf(clickOnNotes);

		driver.findElement(clickOnNotes).click();
		
	}
	
	public Notes addNote(String userName,String password,String Note) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Session");

		waitForClickabilityOf(clickOn1stSession);

		driver.findElement(clickOn1stSession).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Add Note");

		waitForClickabilityOf(addNotesBtn);

		driver.findElement(addNotesBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Note");

		waitForClickabilityOf(addNoteDetails);

		driver.findElement(addNoteDetails).sendKeys(Note);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Save Note");

		waitForClickabilityOf(saveNoteBtn);

		driver.findElement(saveNoteBtn).click();
		
		Thread.sleep(2000);
		
//      Verifying Condition 
		
		String SentMsg = driver.findElement(By.xpath("//*[@text='"+Note+"']")).getText();
		
		if (SentMsg.equals(Note)) {
			
			System.out.println("Successfully Added One Note");
			
		} else {
			
			System.out.println("Failed to Add the Note");

		}
		
		
		return new Notes(driver);
	}

}

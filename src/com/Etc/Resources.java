package com.Etc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Resources extends BaseSetUp{
	
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
	By progressBar = By.id("progress_small");
	
//	Clicking On Resources Elements
	
	By clickOnEtc = By.xpath("//*[@content-desc='Etc.']");
	
	By clickOnResources = By.xpath("//*[@content-desc='Resources']");
	
	By file1 = By.id("tv_badge1");
	
	By clickOnPdf = By.id("tv_caption");
	
	By addNote = By.xpath("//*[@content-desc='Add note']");
	
	By addBtn = By.xpath("//*[@content-desc='Add']");
	
	By noteListBtn = By.xpath("//*[@content-desc='Note list']");
	
	By noteDetails = By.id("et_addnote_detail");
	
	By saveBtn = By.xpath("//*[@content-desc='Save']");
	
	By shareBtn = By.xpath("//*[@content-desc='Share']");
	
	By sharePresentation = By.id("upld_view");
	
	By shareNotes = By.id("upld_take");
	
	By sharePreAndNotes = By.id("upld_lib");
	
	
	

	public Resources(WebDriver driver) {
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
		
		System.out.println("Clicking on Etc ");

		waitForClickabilityOf(clickOnEtc);

		driver.findElement(clickOnEtc).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Resources");

		waitForClickabilityOf(clickOnResources);

		driver.findElement(clickOnResources).click();
		
	}
	
	public Resources resources(String userName,String password,String Note) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		boolean File = driver.findElement(file1).isDisplayed();
		
		if (File==true) {
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Folder");

			waitForClickabilityOf(file1);

			driver.findElement(file1).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on PDF File");

			waitForClickabilityOf(clickOnPdf);

			driver.findElement(clickOnPdf).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Add Note Button");

			waitForClickabilityOf(addNote);

			driver.findElement(addNote).click();
			
			Thread.sleep(2000);
			
			boolean NoteDetails = driver.findElement(noteDetails).isDisplayed();
			
			if (NoteDetails==true) {
				
				Thread.sleep(2000);
				
				System.out.println("Entering the Note Details");

				waitForClickabilityOf(noteDetails);

				driver.findElement(noteDetails).clear();
				
				driver.findElement(noteDetails).sendKeys(Note);
				
			} else {
				
				Thread.sleep(2000);
				
				System.out.println("Clicking on Add Button");

				waitForClickabilityOf(addBtn);

				driver.findElement(addBtn).click();
				
				Thread.sleep(2000);
				
				System.out.println("Entering the Note Details");

				waitForClickabilityOf(noteDetails);

				driver.findElement(noteDetails).clear();
				
				driver.findElement(noteDetails).sendKeys(Note);

			}
						
			Thread.sleep(2000);
			
			System.out.println("Clicking on Save Button to Add Note");

			waitForClickabilityOf(saveBtn);

			driver.findElement(saveBtn).click();
						
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Presentation");

			waitForClickabilityOf(sharePresentation);

			driver.findElement(sharePresentation).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Notes");

			waitForClickabilityOf(shareNotes);

			driver.findElement(shareNotes).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Button");

			waitForClickabilityOf(shareBtn);

			driver.findElement(shareBtn).click();
			
			Thread.sleep(2000);
			
			System.out.println("Clicking on Share Presentation and Notes");

			waitForClickabilityOf(sharePreAndNotes);

			driver.findElement(sharePreAndNotes).click();
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			
		} else {
			
			System.out.println("There is No Resource file to open");

		}
		
		Thread.sleep(2000);

		waitForClickabilityOf(noteListBtn);

		driver.findElement(noteListBtn).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(By.xpath("//*[@text='"+Note+"']"));
		
		String AddedNote = driver.findElement(By.xpath("//*[@text='"+Note+"']")).getText();
		
		if (AddedNote.equals(Note)) {
			
			System.out.println("Successfully Verified Resource details");
			
		} else {
			
			System.out.println("Failed to verify the Resource Details");

		}
		
		
		
		return new Resources(driver);
	}

}

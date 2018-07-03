package com.Agenda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class Survey extends BaseSetUp{
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By forgotPassBtn = By.id("tv_forgot_pswd");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Survey Elements
	
	By clickOnAgenda = By.xpath("//android.widget.ImageView[@content-desc='Agenda']");
	
	By clickOnSurvey = By.xpath("//*[@text='Survey']");
	
//	Drop down Poll Elements
	
	By dropdownPoll = By.xpath("//*[@text='Automation Dropdown Poll Testing']");
	
	By selectAnOption = By.id("tv_option");
	
	By nextQuestion = By.xpath("//*[@text='Next Question']");
	
	By optionOne = By.xpath("//*[@bounds='[75,711][1005,855]']");
	
	By optionTwo = By.xpath("//*[@bounds='[75,854][1005,998]']");
	
	By optionThree = By.xpath("//*[@bounds='[75,997][1005,1136]']");
	
	By okBtn = By.xpath("//*[@text='OK']");
	
	By previousBtn = By.id("btn_prev_button");
	
	By btnSubmit = By.id("btn_submit");
	
	By thanksMsg = By.id("tv_thanks");
	
	By morePolls = By.id("btn_vw_more");
	
//	Free Text Poll Elements
	
	By freeTextPoll = By.xpath("//*[@text='Automation Free Text Poll Testing']");
	
//	Multiple Poll Elements
		
	By multiplePoll = By.xpath("//*[@text='Automation Multiple Poll Testing']");
	
	By mulOptionOne = By.xpath("//*[@bounds='[75,528][1005,663]']");
	
	By mulOptionTwo = By.xpath("//*[@bounds='[75,693][1005,828]']");
	
	By mulOptionThree = By.xpath("//*[@bounds='[75,858][1005,993]']");
	
//	Single Poll Elements
	
	By singlePoll = By.xpath("//*[@text='Automation Single Poll Testing']");
	
	
	
	

	public Survey(WebDriver driver) {
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
		
		System.out.println("Clicking on Survey ");

		waitForClickabilityOf(clickOnSurvey);

		driver.findElement(clickOnSurvey).click();
		
	}
	
//	Drop Down Survey Method
	
	public Survey surveyDropdownPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Drop Down Poll Survey ");

		waitForClickabilityOf(dropdownPoll);

		driver.findElement(dropdownPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(optionOne);

		driver.findElement(optionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(optionOne);

		driver.findElement(optionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(2000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Dropdown Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Dropdown Polls/Surveys");

		}
		
	
		
		return new Survey(driver);
	}
	
//	Free Text Survey Method
	
	public Survey surveyFreeTextPoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Free Text Poll Survey ");

		waitForClickabilityOf(freeTextPoll);

		driver.findElement(freeTextPoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).clear();
		
		driver.findElement(selectAnOption).sendKeys("German");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Select An Option ");

		waitForClickabilityOf(selectAnOption);

		driver.findElement(selectAnOption).clear();
		
		driver.findElement(selectAnOption).sendKeys("Germany");
				
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(2000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Free Text Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Free Text Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Multiple Survey Method
	
	public Survey surveyMultiplePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Multiple Choice Poll Survey ");

		waitForClickabilityOf(multiplePoll);

		driver.findElement(multiplePoll).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(2000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Multiple Choice Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Multiple Choice Polls/Surveys");

		}
		
		
		return new Survey(driver);
	}
	
//	Single Survey Method
	
	public Survey surveySinglePoll(String userName,String password) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Single Poll Survey ");

		waitForClickabilityOf(singlePoll);

		driver.findElement(singlePoll).click();
				
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Next Question ");

		waitForClickabilityOf(nextQuestion);

		driver.findElement(nextQuestion).click();
		
		Thread.sleep(2000);
		
		System.out.println("Selecting An Option ");

		waitForClickabilityOf(mulOptionOne);

		driver.findElement(mulOptionOne).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Submit Button ");

		waitForClickabilityOf(btnSubmit);

		driver.findElement(btnSubmit).click();
		
		Thread.sleep(2000);
		
		String Msg = driver.findElement(morePolls).getText();
		
//		Verifying Condition
		
		Thread.sleep(2000);
		
		if (Msg.equals("More Polls/Surveys")) {
			
			System.out.println("Successfully Verified the Single Polls/Surveys");
			
		} else {
			
			System.out.println("Failed to Verify the Single Polls/Surveys");

		}
		
		
		
		return new Survey(driver);
	}
	
	

}

package com.Me;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.BaseSetup.BaseSetUp;

public class MyProfile extends BaseSetUp{
	
	By emailId = By.id("et_email");
	
	By pass = By.id("et_password");
	
	By proceedBtn1 = By.id("tv_proceed");
	
	By proceedBtn2 = By.id("rl_proceed");
	
	By submitBtn = By.id("tv_submit");
	
	By menu = By.id("btn_home");
	
//	Clicking On My Profile Elements
	
	By clickOnMe = By.xpath("//*[@content-desc='Me']");
	
	By clickOnMyProfile = By.xpath("//*[@content-desc='My Profile']");
	
	By myCompanyName = By.id("tv_attende_company");
	
	By editMyProfile = By.xpath("//*[@content-desc='Edit profile']");
	
	By tagTab = By.xpath("//*[@text='Tag']");
	
	By genTab = By.xpath("//*[@text='General']");
		
	By firstName = By.id("et_myprofile_firstName");
	
	By lastName = By.id("et_myprofile_lastName");
	
	By designation = By.id("et_myprofile_desig");
	
	By company = By.id("et_myprofile_company");
	
	By phoneNo = By.id("et_myprofile_phone");
	
	By countryCode = By.id("tv_countryCode");
	
	By searchCountry = By.id("img_search");
	
	By selectCountry = By.id("tv_countryName");
	
	By description = By.id("tv_myprofile_description_header");
	
	By addDescription = By.xpath("//*[@bounds='[0,384][1080,984]']");
	
	By doneBtn = By.id("tv_rightButton");
	
	By selectTag = By.id("Checkbox_selectCategory");
	
	By saveButton = By.xpath("//*[@content-desc='Save']");
	
	
	
	

	public MyProfile(WebDriver driver) {
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
		
		System.out.println("Clicking on My Profile");

		waitForClickabilityOf(clickOnMyProfile);

		driver.findElement(clickOnMyProfile).click();
		
	}
	
	public MyProfile editMyProfile(String userName,String password,String Desig,String Comp,String Phone,String Description) throws InterruptedException{
		
		commonActivity(userName, password);
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(myCompanyName);
		
		String CompanyName = driver.findElement(myCompanyName).getText();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Edit My Profile");

		waitForClickabilityOf(editMyProfile);

		driver.findElement(editMyProfile).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Designation");

		waitForClickabilityOf(designation);

		driver.findElement(designation).clear();
		
		driver.findElement(designation).sendKeys(Desig);
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Company Name");

		waitForClickabilityOf(company);

		driver.findElement(company).clear();
		
		driver.findElement(company).sendKeys(Comp);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Country Code");

		waitForClickabilityOf(countryCode);

		driver.findElement(countryCode).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Search Country Code");

		waitForClickabilityOf(searchCountry);

		driver.findElement(searchCountry).click();
		
		driver.findElement(searchCountry).sendKeys("United States");
		
		Thread.sleep(2000);
		
		System.out.println("Selecting the Country");

		waitForClickabilityOf(selectCountry);

		driver.findElement(selectCountry).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Phone No");

		waitForClickabilityOf(phoneNo);

		driver.findElement(phoneNo).clear();
		
		driver.findElement(phoneNo).sendKeys(Phone);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Description");

		waitForClickabilityOf(description);

		driver.findElement(description).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entering new Description for My Profile");

		waitForClickabilityOf(addDescription);

		driver.findElement(addDescription).clear();
		
		driver.findElement(addDescription).sendKeys(Description);
		
		Thread.sleep(2000);
		
		System.out.println("Clicking on Done Button to Save Description");

		waitForClickabilityOf(doneBtn);

		driver.findElement(doneBtn).click();
		
		Thread.sleep(2000);
		
		System.out.println("Clicking On Tag Tab");

		waitForClickabilityOf(tagTab);

		driver.findElement(tagTab).click();
		
		try {
			
			Thread.sleep(2000);
			
			System.out.println("Selecting the Tag ");

			waitForClickabilityOf(selectTag);

			driver.findElement(selectTag).click();
			
		} catch (Exception e) {
			
		}
				
		Thread.sleep(2000);
		
		System.out.println("Clicking On Save Button to Update Profile Details");

		waitForClickabilityOf(saveButton);

		driver.findElement(saveButton).click();
		
		Thread.sleep(2000);
		
		waitForClickabilityOf(myCompanyName);
		
		String NewCompanyName = driver.findElement(myCompanyName).getText();
		
		Thread.sleep(2000);
		
		if (NewCompanyName.equals(CompanyName)) {
			
			System.out.println("Failed to Update My Profile Details");
			
		} else {
			
			System.out.println("Successfully Updated My Profile Details");

		}
		
		
		
		return new MyProfile(driver);
	}

}

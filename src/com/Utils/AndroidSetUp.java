package com.Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class AndroidSetUp extends ReadAndWriteTestData{
	@SuppressWarnings("rawtypes")
	protected static AndroidDriver driver;
	
    String home = System.getProperty("user.dir");


	@SuppressWarnings("rawtypes")
	protected void prepareAndStartAppium()throws IOException {
		
		String DeviceName = getCellData(1, 0);
		
		String UDID = getCellData(1, 1);
		
		String PlatformVersion =  getCellData(1, 2);

		String apkPath =  getCellData(1, 3);
		
		String appPackageName =  getCellData(1, 4);
		
		String activityName =  getCellData(1, 5);

//		Property Settings are done here
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

		System.out.println("===============================================");

		System.out.println("Setting Up the Device Configuaration ");

		// capabilities.setCapability("appium-version", "1.7.1");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion", PlatformVersion);

		capabilities.setCapability("deviceName", DeviceName);

		capabilities.setCapability("udid", UDID);

		capabilities.setCapability("app", home+apkPath);

		capabilities.setCapability("appPackage", appPackageName);

		capabilities.setCapability("appActivity", activityName);
		
//		capabilities.setCapability("automationName", "uiautomator2");
//		
//		capabilities.setCapability("newCommandTimeout", "160");
		
//		capabilities.setCapability("noResetValue", "false");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);

	}
	
	protected void installApp() throws IOException{
		
		System.out.println("Installing the Application ");
		
		String apkPath =  getCellData(1, 3);
		
		driver.installApp(home+apkPath);
		
		System.out.println("Successfully Installed the Application ");
		
	}
	
	protected void uninstallApp() throws IOException{
		
		String appPackageName =  getCellData(1, 4);
		
		System.out.println("Uninstalling the Application the Application");
		
		driver.removeApp(appPackageName);
		
		System.out.println("Successfully Uninstalled the Application");
		
		System.out.println("       ");
		
		System.out.println("===============================================");
		
	}

	protected void gotoHome() {
		
		System.out.println("Going Back to Home");

		driver.pressKeyCode(AndroidKeyCode.BACK);

		driver.pressKeyCode(AndroidKeyCode.HOME);
	}

	protected void openTheApp() throws IOException {
			
		System.out.println("Opening the App Again to Check the Changed Password");
		
		String appPackageName =  getCellData(1, 4);
		
		String activityName =  getCellData(1, 5);

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("appPackage", appPackageName);

		caps.setCapability("appActivity", activityName);

	}
	
	public void scrollDown(){
		
		System.out.println("Scrolling Down");
		
		try {
			
		    
			
			driver.pressKeyCode(AndroidKeyCode.ACTION_DOWN);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_UP);
			
			driver.pressKeyCode(AndroidKeyCode.KEYCODE_PAGE_DOWN);
			
		} catch (Exception e) {
			
		}
		

	}
	
	
	protected void swipeRightToLeft(){
		

		
	
	}
	
	public void sendMailReport(){
		
//		Creating object of Property file		
		Properties props = new Properties();
		
//		this will set host of server- you can change based on your requirement 	
		props.put("mail.smtp.host", "smtp.gmail.com");
		
//		set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");

//		set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

//		set the authentication to true
		props.put("mail.smtp.auth", "true");

//		set the port of SMTP server
		props.put("mail.smtp.port", "465");
		
//		This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {	protected PasswordAuthentication getPasswordAuthentication() {

					return new PasswordAuthentication("webspiders400@gmail.com", "webspiders2018");}});
		
		
		try {

//			Create object of MimeMessage class
			Message message = new MimeMessage(session);

//			Set the from address
			message.setFrom(new InternetAddress("webspiders400@gmail.com"));

//			Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("skmahammad.goni@webspiders.com"));
            
//         Add the subject link
			message.setSubject("Automation Test Execution Report");

//			Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

//			Set the body of email
			messageBodyPart1.setText("There is no Message Body");

//			Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

//			Mention the file which you want to send
			String filename = home+"/test-output/emailable-report.html";

//			Create data source and pass the filename
			DataSource source = new FileDataSource(filename);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));

//			set the file
			messageBodyPart2.setFileName(filename);

//			Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

//			add body part 1
			multipart.addBodyPart(messageBodyPart2);

//			add body part 2
			multipart.addBodyPart(messageBodyPart1);

//			set the content
			message.setContent(multipart);

//			finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}
		
		
		
	}




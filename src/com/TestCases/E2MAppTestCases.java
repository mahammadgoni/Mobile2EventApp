package com.TestCases;

import java.net.MalformedURLException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Agenda.Exhibitors;
import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Agenda.Sponsors;
import com.Agenda.Survey;
import com.Etc.LocationAndTiming;
import com.Etc.Resources;
import com.Live.Attendees;
import com.Live.EventQA;
import com.Live.LeaderBoard;
import com.Live.OneToOneMessage;
import com.Live.PhotoWall;
import com.Live.PlayCenter;
import com.Live.SocialWall;
import com.Live.VideoWall;
import com.LoginPage.LoginPage;
import com.Me.Bookmarks;
import com.Me.Logout;
import com.Me.MyProfile;
import com.Me.Notes;
import com.Utils.AndroidSetUp;

public class E2MAppTestCases extends AndroidSetUp{
	
	String DeviceName = "Google Nexus 5";
	
	String UDID = "192.168.57.101:5555";
	
	String PlatformVersion = "6.0";
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
		
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
		
	}
//	
//	@Test(priority = 1)
//	public void uninstallAppTest(){
//		
//		System.out.println("Executing : Uninstall Application Test");
//		
//		uninstallApp();	
//		
//	}
//	
//	@Test(priority = 2)
//	public void installAppTest() throws MalformedURLException{
//		
//		System.out.println("Executing : Install Application Test");
//				
//		installApp();
//		
//	}
//	
//	@Test(priority = 3)
//	public void loginToAccountTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Login to your Account Test");
//		
//		new LoginPage(driver).accountLogin("brucewills@yopmail.com", "#e2m321");
//		
//	}
//	
//	@Test(priority = 4)
//	public void forgotPasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Forgot Password Test");
//		
//		new LoginPage(driver).forgotPassword("brucewills@yopmail.com", "#e2m321");
//		
//	}
//	
//	@Test(priority = 5)
//	public void changePasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Chanege Password Test");
//		
//		new LoginPage(driver).changePassword("brucewills@yopmail.com", "#e2m321","123456");
//		
//	}
//	
//	
//	@Test(priority = 6)
//	public void revertPasswordTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Revert Back to Default Password Test");
//		
//		new LoginPage(driver).changePassword("brucewills@yopmail.com", "123456","#e2m321");
//		
//	}
//	
//	@Test(priority = 7)
//	public void homePageVerifyTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Home Page Verify Test");
//		
//		new LoginPage(driver).homePageVerify("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 8)
//	public void scheduleTimeTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Schedule Time Test");
//		
//		new Schedule(driver).time("brucewills@yopmail.com","#e2m321", "This is Automation Testing Notes", "Are you adding questions through Automation?");
//		
//	}
//	
//	@Test(priority = 9)
//	public void scheduleTracksLiveTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Schedule Tracks Live Test");
//		
//		new Schedule(driver).tracks("brucewills@yopmail.com","#e2m321", "This is Automation Testing Live Track Session Note", "Is this Live tracks Session?","Live");
//		
//	}
//	
//	@Test(priority = 10)
//	public void scheduleTracksPlatformsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Schedule Tracks Platforms Test");
//		
//		new Schedule(driver).tracks("brucewills@yopmail.com","#e2m321", "This is Automation Testing Platforms Track Session Note", "Is this Platforms tracks Session?","Platforms");
//		
//	}
//	
//	@Test(priority = 11)
//	public void scheduleMyAgendaTabTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Schedule My Agenda Tab Test");
//		
//		new Schedule(driver).myAgenda("brucewills@yopmail.com","#e2m321", "This is Automation Testing My Agenda Session Note", "Is this My Agenda Session?");
//		
//	}
//	
//	@Test(priority = 12)
//	public void speakerDetailsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Speaker Details Test");
//		
//		new Speakers(driver).speakerDetails("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 13)
//	public void exhibitorNameTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Exhibitor Name Test");
//		
//		new Exhibitors(driver).exhibitorsName("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 14)
//	public void exhibitorTypeTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Exhibitor Type Test");
//		
//		new Exhibitors(driver).exhibitorType("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 15)
//	public void sponsorsNameTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Sponsors Name Test");
//		
//		new Sponsors(driver).sponsorsName("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 16)
//	public void sponsorsTypeTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Sponsors Type Test");
//		
//		new Sponsors(driver).sponsorsType("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 17)
//	public void dropdownPollsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Drop Down Polls/Survey Test");
//		
//		new Survey(driver).surveyDropdownPoll("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	
//	@Test(priority = 18)
//	public void freeTextPollsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Free Text Polls/Survey Test");
//		
//		new Survey(driver).surveyFreeTextPoll("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	
//	@Test(priority = 19)
//	public void multiplePollsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Multiple Polls/Survey Test");
//		
//		new Survey(driver).surveyMultiplePoll("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	
//	@Test(priority = 20)
//	public void singlePollsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Single Polls/Survey Test");
//		
//		new Survey(driver).surveySinglePoll("brucewills@yopmail.com","#e2m321");
//		
//	}
//	
//	@Test(priority = 21)
//	public void attendeeDetailsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Attendee Details Test");
//		
//		new Attendees(driver).attendeeDetails("brucewills@yopmail.com","#e2m321", "Two");
//		
//	}
//	
//		
//	@Test(priority = 22)
//	public void socialWallTest() throws MalformedURLException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Social Wall Posting Test");
//		
//		new SocialWall(driver).socialWall("brucewills@yopmail.com", "#e2m321", "This is Automation Testing Comment");
//		
//		
//	}
//	
//	@Test(priority = 23)
//	public void oneToOneMsgTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : One To One Message Test");
//		
//		new OneToOneMessage(driver).oneToOneMsg("brucewills@yopmail.com", "#e2m321", "This Auto First O2O Message");
//		
//		
//	}
//
//	@Test(priority = 24)
//	public void photoWallTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Photo Wall Test");
//		
//		new PhotoWall(driver).photoUpload("brucewills@yopmail.com", "#e2m321", 10, "Automation Image Caption");
//		
//		
//	}
//
//	@Test(priority = 25)
//	public void videoRecordUploadTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Recoding Video Uploading Test");
//		
//		new VideoWall(driver).videoUpload("brucewills@yopmail.com", "#e2m321", true, "Recorded Video");
//		
//		
//	}
//	
//	@Test(priority = 26)
//	public void videoExistUploadTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Existing Video Uploading Test");
//		
//		new VideoWall(driver).videoUpload("brucewills@yopmail.com", "#e2m321", false, "Existing Video");
//		
//		
//	}
//	
//	@Test(priority = 27)
//	public void leaderBoardDetailsTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Leader Board Details Test");
//		
//		new LeaderBoard(driver).leaderBoardDetails("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
//	@Test(priority = 28)
//	public void eventQATest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Event QA Test");
//		
//		new EventQA(driver).eventQA("brucewills@yopmail.com", "#e2m321", "Is this an Automation Session?");
//		
//		
//	}
//	
//	@Test(priority = 29)
//	public void quizMapTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Quiz Map Test");
//		
//		new PlayCenter(driver).quizMap("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
//	@Test(priority = 30)
//	public void makingFriendMapTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Making Friend Map Test");
//		
//		new PlayCenter(driver).makingFriendMap("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
//	@Test(priority = 31)
//	public void locationMapTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Location Map Test");
//		
//		new PlayCenter(driver).locationMap("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
//	@Test(priority = 32)
//	public void bookmarksTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Bookmarks Check Test");
//		
//		new Bookmarks(driver).bookmarked("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
//	@Test(priority = 33)
//	public void addNoteTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Bookmarks Check Test");
//		
//		new Notes(driver).addNote("brucewills@yopmail.com", "#e2m321","Verify Me Before Session Ends");
//		
//		
//	}
//	
//	@Test(priority = 34)
//	public void updateMyProfileTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Update My Profile Details Test");
//		
//		new MyProfile(driver).editMyProfile("brucewills@yopmail.com", "#e2m321", "Devops", "E2M Crop", "2176008217", "I am an Admin User and i have all rights of Admin.");
//		
//		
//	}
//	
//	@Test(priority = 35)
//	public void logoutTest() throws MalformedURLException, InterruptedException{
//		
//		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
//		
//		System.out.println("Executing : Logout Test");
//		
//		new Logout(driver).logoutCheck("brucewills@yopmail.com", "#e2m321");
//		
//		
//	}
//	
	@Test(priority = 36)
	public void resourcesDataTest() throws MalformedURLException, InterruptedException{
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
		
		System.out.println("Executing : Resources Data Test");
		
		new Resources(driver).resources("brucewills@yopmail.com", "#e2m321", "Please Add Resource PDF If Not there");
		
		
	}
		
	@Test(priority = 37)
	public void locationAndTimingTest() throws MalformedURLException, InterruptedException{
		
		prepareAndStartAppium(DeviceName, UDID, PlatformVersion);
		
		System.out.println("Executing : Location and Timing Test");
		
		new LocationAndTiming(driver).locationAndTiming("brucewills@yopmail.com", "#e2m321");
		
		
	}
	
	
	
}

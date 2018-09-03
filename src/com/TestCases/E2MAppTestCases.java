package com.TestCases;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.Agenda.Exhibitors;
import com.Agenda.Schedule;
import com.Agenda.Speakers;
import com.Agenda.Sponsors;
import com.Agenda.Survey;
import com.Etc.FloorMap;
import com.Etc.Home;
import com.Etc.LocationAndTiming;
import com.Etc.Resources;
import com.Etc.Settings;
import com.Etc.UsefullInfo;
import com.Live.Attendees;
import com.Live.EventQA;
import com.Live.LeaderBoard;
import com.Live.OneToOneMessage;
import com.Live.PhotoWall;
import com.Live.SocialWall;
import com.Live.VideoWall;
import com.LoginPage.LoginPage;
import com.Me.Bookmarks;
import com.Me.Logout;
import com.Me.MyProfile;
import com.Me.Notes;
import com.Utils.AndroidSetUp;
import com.Utils.GetScreenShot;

//This Listener is to taking screen shot

@Listeners({ GetScreenShot.class })

public class E2MAppTestCases extends AndroidSetUp{

	
	@BeforeClass
	public void setUp() throws IOException{
		
		prepareAndStartAppium();
		
	}
	
	@AfterClass
	public void tearDown(){
		
		driver.quit();
		
	}
	
	@AfterSuite
	public void mailReport(){
		
//		sendMailReport();
	}
	
	@Test(priority = 1)
	public void uninstallAppTest() throws IOException{
		
		System.out.println("Executing : Uninstall Application Test");
		
		uninstallApp();	
		
	}
	
	@Test(priority = 2)
	public void installAppTest() throws IOException{
		
		System.out.println("Executing : Install Application Test");
				
		installApp();
		
	}
	
	@Test(priority = 3)
	public void loginToAccountTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Login to your Account Test");
		
		new LoginPage(driver).accountLogin(userName, password);
		
	}
//	
//	@Test(priority = 4)
//	public void forgotPasswordTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Forgot Password Test");
//		
//		new LoginPage(driver).forgotPassword(userName, password);
//		
//	}
//	
//	@Test(priority = 5)
//	public void changePasswordTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Chanege Password Test");
//		
//		new LoginPage(driver).changePassword(userName, password,"123456");
//		
//	}
//	
//	
//	@Test(priority = 6)
//	public void revertPasswordTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Revert Back to Default Password Test");
//		
//		new LoginPage(driver).changePassword(userName, "123456",password);
//		
//	}
	
	@Test(priority = 7)
	public void homePageVerifyTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Home Page Verify Test");
		
		new LoginPage(driver).homePageVerify(userName, password);
		
	}
	
	@Test(priority = 8)
	public void scheduleTimeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Time Test");
		
		new Schedule(driver).time(userName, password, "This is Appium Testing Notes", "Are you adding questions through Automation?");
		
	}
	
	@Test(priority = 9)
	public void scheduleTracksLiveTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Tracks Live Test");
		
		new Schedule(driver).tracks(userName, password, "This is Automation Testing Live Track Session Note", "Is this Live tracks Session?","Live");
		
	}
	
	@Test(priority = 10)
	public void scheduleTracksPlatformsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule Tracks Platforms Test");
		
		new Schedule(driver).tracks(userName, password, "This is Automation Testing Platforms Track Session Note", "Is this Platforms tracks Session?","Platforms");
		
	}
	
	@Test(priority = 11)
	public void scheduleMyAgendaTabTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Schedule My Agenda Tab Test");
		
		new Schedule(driver).myAgenda(userName, password, "This is Automation Testing My Agenda Session Note", "Is this My Agenda Session?");
		
	}
	
	@Test(priority = 12)
	public void speakerDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Speaker Details Test");
		
		new Speakers(driver).speakerDetails(userName, password);
		
	}
	
	@Test(priority = 13)
	public void exhibitorNameTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Name Test");
		
		new Exhibitors(driver).exhibitorsName(userName, password);
		
	}
	
	@Test(priority = 14)
	public void exhibitorTypeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Exhibitor Type Test");
		
		new Exhibitors(driver).exhibitorType(userName, password);
		
	}
	
	@Test(priority = 15)
	public void sponsorsNameTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsors Name Test");
		
		new Sponsors(driver).sponsorsName(userName, password);
		
	}
	
	@Test(priority = 16)
	public void sponsorsTypeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Sponsors Type Test");
		
		new Sponsors(driver).sponsorsType(userName, password);
		
	}
	
	@Test(priority = 17)
	public void dropdownPollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Drop Down Polls/Survey Test");
		
		new Survey(driver).surveyDropdownPoll(userName, password);
		
	}
	
	
	@Test(priority = 18)
	public void freeTextPollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Free Text Polls/Survey Test");
		
		new Survey(driver).surveyFreeTextPoll(userName, password);
		
	}
	
	
	@Test(priority = 19)
	public void multiplePollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Multiple Polls/Survey Test");
		
		new Survey(driver).surveyMultiplePoll(userName, password);
		
	}
	
	
	@Test(priority = 20)
	public void singlePollsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Single Polls/Survey Test");
		
		new Survey(driver).surveySinglePoll(userName, password);
		
	}
	
	@Test(priority = 21)
	public void attendeeDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Attendee Details Test");
		
		new Attendees(driver).attendeeDetails(userName, password, "One");
		
	}
	
		
	@Test(priority = 22)
	public void socialWallTest() throws IOException, InterruptedException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Social Wall Posting Test");
		
		new SocialWall(driver).socialWall(userName, password, "This is Jack Solly From Avatar");
		
		
	}
	
	@Test(priority = 23)
	public void oneToOneMsgTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : One To One Message Test");
		
		new OneToOneMessage(driver).oneToOneMsg(userName, password, "Bumbel Bee Reporting");
		
		
	}

	@Test(priority = 24)
	public void photoWallTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Photo Wall Test");
		
		new PhotoWall(driver).photoUpload(userName, password, 10, "Moto G Cap");
		
		
	}

	@Test(priority = 25)
	public void videoRecordUploadTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Recoding Video Uploading Test");
		
		new VideoWall(driver).videoUpload(userName, password, true, "Recorded Video");
		
		
	}
	
	@Test(priority = 26)
	public void videoExistUploadTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Existing Video Uploading Test");
		
		new VideoWall(driver).videoUpload(userName, password, false, "Existing Video");
		
		
	}
	
	@Test(priority = 27)
	public void leaderBoardDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Leader Board Details Test");
		
		new LeaderBoard(driver).leaderBoardDetails(userName, password);
		
		
	}
	
	@Test(priority = 28)
	public void eventQATest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Event QA Test");
		
		new EventQA(driver).eventQA(userName, password, "Is this is Uganda?");
		
		
	}
//	
//	@Test(priority = 29)
//	public void quizMapTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Quiz Map Test");
//		
//		new PlayCenter(driver).quizMap(userName, password);
//		
//		
//	}
//	
//	@Test(priority = 30)
//	public void makingFriendMapTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Making Friend Map Test");
//		
//		new PlayCenter(driver).makingFriendMap(userName, password);
//		
//		
//	}
//	
//	@Test(priority = 31)
//	public void locationMapTest() throws InterruptedException, IOException{
//		
//		String userName =  getCellData(1, 6);
//		
//		String password =  getCellData(1, 7);
//		
//		prepareAndStartAppium();
//		
//		System.out.println("Executing : Location Map Test");
//		
//		new PlayCenter(driver).locationMap(userName, password);
//		
//		
//	}
	
	@Test(priority = 32)
	public void bookmarksTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Bookmarks Check Test");
		
		new Bookmarks(driver).bookmarked(userName, password);
		
		
	}
	
	@Test(priority = 33)
	public void addNoteTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Add Note Test");
		
		new Notes(driver).addNote(userName, password,"This test is for 3rd Iteration ");
		
		
	}
	
	@Test(priority = 34)
	public void updateMyProfileTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Update My Profile Details Test");
		
		new MyProfile(driver).editMyProfile(userName, password, "Devops", "Code Crop", "2176008217", "No Place for Coding");
		
		
	}
	
	@Test(priority = 35)
	public void logoutTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Logout Test");
		
		new Logout(driver).logoutCheck(userName, password);
		
		
	}
	
	@Test(priority = 36)
	public void resourcesDataTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Resources Data Test");
		
		new Resources(driver).resources(userName, password, "Please Add Resource PDF If Not there");
		
		
	}
		
	@Test(priority = 37)
	public void locationAndTimingTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Location and Timing Test");
		
		new LocationAndTiming(driver).locationAndTiming(userName, password);
		
		
	}
	
	@Test(priority = 38)
	public void useFulInfoTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Useful Info Test");
		
		new UsefullInfo(driver).viweUsefulInfo(userName, password);
		
		
	}
	
	@Test(priority = 39)
	public void floorMapDetailsTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : View Floor Map Details Test");
		
		new FloorMap(driver).viewFloorMap(userName, password);
		
		
	}
	
	@Test(priority = 40)
	public void wayFinderTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Wayfinder Test");
		
		new FloorMap(driver).wayFinder(userName, password);
		
		
	}
	
	@Test(priority = 41)
	public void refreshDataTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Refresh Data Test");
		
		new Settings(driver).refreshData(userName, password);
		
	}
	
	@Test(priority = 42)
	public void aboutAppTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : About App Test");
		
		new Settings(driver).aboutApp(userName, password);
		
	}
	
	@Test(priority = 43)
	public void homeTest() throws InterruptedException, IOException{
		
		String userName =  getCellData(1, 6);
		
		String password =  getCellData(1, 7);
		
		prepareAndStartAppium();
		
		System.out.println("Executing : Home Test");
		
		new Home(driver).home(userName, password);
		
	}
	
	
}

package org.chattest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.chat.*;
import org.extentreport.ExtentManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utils.NewBaseDriver;

public class GroupChatTest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass(description = "Launch the Base Driver")
    public void driverLaunch()
    {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Chat Module", "Chat Module Test cases");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();
    }
    @Test(priority = 1,description = "Login into App")
    public void loginApp() {
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }
    @Test(priority = 2,description = "Dashboard Chat button")
    public void dashboardChatButton()
    {
        DashBoardChat chat = new DashBoardChat ((AndroidDriver)driver,test);
        chat.homeChat();
    }
    @Test(priority = 3,description = "Contact Chat Screen")
    public void ContactScreenChat()
    {
        GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
        groupChat.groupChatButton();
        groupChat.makeGroupAddButton();
        groupChat.groupName();
        groupChat.addParticipantForGroup();
      }
     @Test(priority = 4,description = "Click on User for add in Group")
      public void ClickOnListUsersFromChat()
      {
          GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
          groupChat.clickElementAtIndexForGroupUserList(1);
          groupChat.getTextFromSubElement(1);
          groupChat.clickElementAtIndexForGroupUserList(2);
          groupChat.getTextFromSubElement(2);
          groupChat.clickElementAtIndexForGroupUserList(3);
          groupChat.getTextFromSubElement(3);
      }
    @Test(priority = 5,description = "Click on Next Button After Select some Users")
      public void ClickOnNextButton()
      {
          GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
          groupChat.groupListNextButton();
      }
    @Test(priority = 6,description = "Validate All User Name list after click on next button")
      public void ValidateOnListAllUSer()
      {
          GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
          groupChat.getTextForFriendsNameValidation(0);
          groupChat.getTextForFriendsNameValidation(1);
          groupChat.getTextForFriendsNameValidation(2);

      }
    @Test(priority = 7,description = "Click on Group name , redirect to group info ")
      public void SaveAndRedirectToGroupInfo()
      {
          GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
          groupChat.saveGroupButton();
          groupChat.getTextFromToastMessage();
          groupChat.groupTitleName();
          groupChat.friendsName();
          groupChat.saveGroupButton();
          groupChat.groupTitleName();
          groupChat.friendsName();
      }
    @Test(priority = 8,description = " redirect to group info , Validate all UserName List")
      public void ValidateAtGroupInfoUserNameOfGroup()
      {
          GroupChat groupChat = new GroupChat((AndroidDriver)driver,test);
          groupChat.getTextForFriendsNameValidation(0);
          groupChat.getTextForFriendsNameValidation(1);
          groupChat.getTextForFriendsNameValidation(2);
          groupChat.getTextForFriendsNameValidation(3);
      }
    @AfterClass
    public void driverClose() {
        driver.quit();
        extent.flush();
    }
}

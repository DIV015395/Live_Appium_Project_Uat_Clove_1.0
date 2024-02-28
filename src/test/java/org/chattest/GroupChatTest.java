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
        groupChat.clickElementAtIndexForGroupUserList(0);
        groupChat.getTextFromSubElement(0);
        groupChat.clickElementAtIndexForGroupUserList(1);
        groupChat.getTextFromSubElement(1);
        groupChat.clickElementAtIndexForGroupUserList(2);
        groupChat.getTextFromSubElement(2);
        groupChat.clickElementAtIndexForGroupUserList(3);
        groupChat.getTextFromSubElement(3);
        groupChat.groupListNextButton();
        groupChat.saveGroupButton();
        groupChat.groupTitleName();
        groupChat.friendsName();
        groupChat.saveGroupButton();
        groupChat.groupTitleName();
        groupChat.friendsName();
        groupChat.getTextForFriendsNameValidation(0);
        groupChat.getTextForFriendsNameValidation(1);
        groupChat.getTextForFriendsNameValidation(2);
        groupChat.getTextForFriendsNameValidation(3);

    }

    @AfterClass
    public void driverClose() {
//        driver.quit();
        extent.flush();
    }
}

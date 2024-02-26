package org.chattest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.chat.*;
import org.desiredcapabilities.NewBaseDriver;
import org.extentreport.ExtentManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChatTest
{
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
        ContactScreenChat contactScreenChat = new ContactScreenChat((AndroidDriver)driver,test);
        contactScreenChat.contactButton();
        contactScreenChat.userNameClick();
    }
    @Test(priority = 4,description = "Searching the user for chatting and click on that user")
    public void chatSearchUser()
    {
        ChatScreen chatScreen = new ChatScreen((AndroidDriver)driver,test);
        chatScreen.chatOptionSearch();
        chatScreen.searchBar();
        ContactScreenChat contactScreenChat = new ContactScreenChat((AndroidDriver)driver,test);
        contactScreenChat.userNameClick();
    }
    @Test(priority = 5,description = "Sending Message to USer")
    public void chatWithUser()
    {
        UserChat userChat = new UserChat((AndroidDriver)driver,test);
          userChat.sendMessage();
          userChat.sendButton();
    }
    @Test(priority = 6,description = "Action Button Performing")
    public void chatScreenMessage()
    {
        ChatScreen chatScreen = new ChatScreen((AndroidDriver)driver,test);
        chatScreen.oneToOneChat();
        chatScreen.oneToOneChat();
        ChatListing chatListing = new ChatListing((AndroidDriver)driver,test);
        chatListing.listingUserNameClick();
        chatListing.textViewMessage();

    }

}

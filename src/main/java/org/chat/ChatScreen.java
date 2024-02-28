package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;

import java.util.ResourceBundle;

public class ChatScreen extends NewBaseDriver
{
    ExtentTest test;
    public ChatScreen(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_chatHeaderOption_search")
    private AndroidElement chatOptionSearch;
    public void chatOptionSearch()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            chatOptionSearch.click();
            test.log(Status.PASS,"Click on Chat Search Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Chat Option Search");
        }
    }
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("chatSearchUser");
    private String chatSearchUsers = resourceBundle.getString("chatSearchUsers");
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_searchBar")
    private AndroidElement searchBar;
    public void searchBar()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            searchBar.sendKeys(chatSearchUsers);
            test.log(Status.PASS,"Searching with Name");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to type search user");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_one_to_one")
    private AndroidElement oneToOneChat;
    public void oneToOneChat()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            oneToOneChat.click();
            test.log(Status.PASS,"Click on one to one chat");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on one to one Chat");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/switch_contactSpecialty")
    private AndroidElement switchContactSpecialty;
    public void switchContactSpecialty()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            switchContactSpecialty.click();
            test.log(Status.PASS,"Click on Switch Contact Specialty");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to click on Switch Contact Specialty");
        }
    }
}

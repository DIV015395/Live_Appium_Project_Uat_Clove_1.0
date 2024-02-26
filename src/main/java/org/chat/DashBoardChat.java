package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.NewBaseDriver;

public class DashBoardChat extends NewBaseDriver {
    ExtentTest test;
    public DashBoardChat(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_chat")
    private AndroidElement homeChat;
    public void homeChat()
    {
        try {
            homeChat.click();
            test.log(Status.PASS,"Click on homeChat Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on homeChat Button");
        }
    }
}

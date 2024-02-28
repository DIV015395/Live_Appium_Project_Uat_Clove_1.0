package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;

public class OneToOneChat extends NewBaseDriver
{
    ExtentTest test;
    public OneToOneChat(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/img_view_group")
    private AndroidElement groupChat;
    public void groupChat()
    {
        try
        {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            groupChat.click();
            test.log(Status.PASS,"Click on Group Chat");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Group Chat");
        }
    }
}

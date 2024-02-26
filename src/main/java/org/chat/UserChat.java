package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.NewBaseDriver;

public class UserChat extends NewBaseDriver {
    ExtentTest test;
    public UserChat(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/editTextChatMessage")
    private AndroidElement sendMessage;
    public void sendMessage()
    {
        try
        {
            sendMessage.sendKeys("Hello Sir What are you doing");
            test.log(Status.PASS,"Send Message to User");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to send Message");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/buttonSendMessage")
    private AndroidElement sendButton;
    public void sendButton()
    {
        try
        {
            sendButton.click();
            test.log(Status.PASS,"Click on Send Button ");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Send Button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/buttonSendSticker")
    private AndroidElement sendSticker;
    public void sendSticker()
    {
        try {
            sendSticker.click();
            test.log(Status.PASS,"Click on Sticker Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Sticker");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_copy_message")
    private AndroidElement messageCopyMessage;
    public void messageCopyMessage()
    {
        try
        {
            messageCopyMessage.click();
            test.log(Status.PASS,"Click on Copy Message");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Copy Message");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_message_reply")
    private AndroidElement messageReplyMessage;
    public void messageReplyMessage()
    {
        try
        {
            messageReplyMessage.click();
            test.log(Status.PASS,"Click on Reply Message");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Reply Message");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_forward_message")
    private AndroidElement messageForwardMessage;
    public void messageForwardMessage()
    {
        try {
            messageForwardMessage.click();
            test.log(Status.PASS,"Click on Message Forward");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Message Forward");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_message_delete")
    private AndroidElement messageDeleteMessage;
    public void messageDeleteMessage()
    {
        try {
            messageDeleteMessage.click();
            test.log(Status.PASS,"Click on Delete Message");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Delete Message");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_message_info")
    private AndroidElement messageInfoMessage;
    public void messageInfoMessage()
    {
        try {
            messageInfoMessage.click();
            test.log(Status.PASS,"Click on Info Message");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Info Message");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_cancel")
    private AndroidElement cancelButton;
    public void cancelButton()
    {
        try {
            cancelButton.click();
            test.log(Status.PASS,"Click on Cancel Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Cancel Button");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    private AndroidElement backButton;
    public void backButton()
    {
        try {
            backButton.click();
            test.log(Status.PASS,"Click on Back Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Back Button");
        }
    }




}

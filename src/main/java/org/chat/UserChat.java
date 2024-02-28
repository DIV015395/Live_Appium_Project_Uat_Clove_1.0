package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;

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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
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
            NewBaseDriver.setDriverWaitTenSecond(driver);
            backButton.click();
            test.log(Status.PASS,"Click on Back Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Back Button");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/messages_multi_select_action")
    private AndroidElement messageDeleteButton;
    public void messageDeleteButton()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            messageDeleteButton.click();
            test.log(Status.PASS,"Click on Message Delete Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Message Delete Button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_delete_for_me")
    private AndroidElement deleteForMe;
    public void deleteForMe()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            deleteForMe.click();
            test.log(Status.PASS,"Click on Message Delete for Me Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Message Delete for Me Button");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_delete_for_all")
    private AndroidElement deleteForAll;
    public void deleteForAll()
    {
        try
        {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            deleteForAll.click();
            test.log(Status.PASS,"Click on Message Delete for All Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Message Delete for All Button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_messageSendReply_cancel")
    private AndroidElement messageSendReplyCancel;
    public void messageSendReplyCancel()
    {
        try
        {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            messageSendReplyCancel.click();
            test.log(Status.PASS,"Click on Message Send Reply Cancel Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Message Send Reply Cancel Button");
        }
    }








}

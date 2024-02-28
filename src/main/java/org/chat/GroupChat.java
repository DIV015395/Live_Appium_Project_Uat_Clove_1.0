package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.utils.NewBaseDriver;

import java.util.List;

public class GroupChat extends NewBaseDriver {
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/img_view_group")
    private AndroidElement groupChatButton;

    public GroupChat(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void groupChatButton() {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            groupChatButton.click();
            test.log(Status.PASS, "Click on Group Chat Button");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on Group Chat Button");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_chatHeaderOption_add")
    private AndroidElement makeGroupAddButton;

    public void makeGroupAddButton() {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            makeGroupAddButton.click();
            test.log(Status.PASS, "click on plus button for Create the Group");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to click on plus button for Create the Group");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_add_participant")
    private AndroidElement addParticipantForGroup;

    public void addParticipantForGroup() {
        try {
            addParticipantForGroup.click();
            test.log(Status.PASS, "Click on Add Participant for Create a Group");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on Add Participant for Create a Group");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_group_name")
    private AndroidElement groupName;

    public void groupName() {
        try {
            groupName.sendKeys("Clove Special Group");
            test.log(Status.PASS, "Entered Group Name");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Entered Group Name");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/cl_root")
    private List<AndroidElement> groupUserList;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_userName")
    private AndroidElement subElementUserNameFromGroupUserList;

    public void clickElementAtIndexForGroupUserList(int index) {
        try {
            groupUserList.get(index).click();
            System.out.println(groupUserList.get(index));
            test.log(Status.PASS, "Click on " + index + " USer For Add the List");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on " + index + " USer For Add the List");
        }
    }
    public void getTextFromSubElement(int index) {
        AndroidElement subElement = (AndroidElement) groupUserList.get(index).findElement(By.id("com.clove.clover.uat:id/tv_userName"));
        String userNameText = subElement.getText();
        System.out.println("User Name: " + userNameText);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_next")
    private AndroidElement groupListNextButton;
    public void groupListNextButton()
    {

    }
}

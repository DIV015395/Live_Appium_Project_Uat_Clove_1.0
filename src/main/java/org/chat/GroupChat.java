package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    String groupTextName = "Clove Special Group 4";

    public void groupName()
    {
        try {
            groupName.sendKeys(groupTextName);
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
            test.log(Status.PASS, "Click on " + index + " USer For Add the List");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Click on " + index + " USer For Add the List");
        }
    }
    public void getTextFromSubElement(int index)
    {
        AndroidElement subElement = (AndroidElement) groupUserList.get(index).findElement(By.id("com.clove.clover.uat:id/tv_userName"));
        String userNameText = subElement.getText();
        System.out.println("User Name: " + userNameText);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_next")
    private AndroidElement groupListNextButton;
    public void groupListNextButton()
    {
       try
       {
           groupListNextButton.click();
           test.log(Status.PASS,"Click on Next button after select multiple User for create a group");
       }
       catch (Exception e)
       {
           test.log(Status.FAIL,"Failed to Click on Next button after select multiple User for create a group");
       }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/search")
    private AndroidElement saveGroupButton;
    public void saveGroupButton()
    {
        try
        {
            saveGroupButton.click();
            test.log(Status.PASS,"Click on save button select multiple User for creating a group");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on save button select multiple User for creating a group");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_title")
    private List<AndroidElement> groupTitleName;
    public void groupTitleName()
    {
        String type = groupTextName;
        for (WebElement option : groupTitleName) {
            if (option.getText().equals(type))
            {
                option.click();
                test.log(Status.PASS, "Click on Group Name");
                break;
            }
        }
    }
    @AndroidFindBy(id="com.clove.clover.uat:id/tv_friendname")
    private AndroidElement friendsName;
    public void friendsName()
    {
        try {
            friendsName.click();
            test.log(Status.PASS,"Click on Friends Name Information");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Friends Name Information");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_header_row")
    private List<AndroidElement> friendsListInfoName;

    public void getTextForFriendsNameValidation(int index)
    {
        AndroidElement subElement = (AndroidElement) friendsListInfoName.get(index).findElement(By.id("com.clove.clover.uat:id/textViewUserName"));
        String userNameText = subElement.getText();
        System.out.println("User Name: " + userNameText);



    }

}

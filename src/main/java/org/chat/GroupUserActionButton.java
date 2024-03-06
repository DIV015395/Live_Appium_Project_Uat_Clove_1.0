package org.chat;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;

public class GroupUserActionButton extends NewBaseDriver {

    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_view_profile")
    private AndroidElement viewProfile;

    public GroupUserActionButton(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void viewProfile()
    {
        try {
            viewProfile.click();
            test.log(Status.PASS,"Click on view profile");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on view profile");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_delete")
    private AndroidElement delete;
    public void delete()
    {
        try {
            delete.click();
            test.log(Status.PASS,"Click on delete button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on delete button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_add_remove_group_admin")
    private AndroidElement addRemoveGroupAdmin;
    public void addRemoveGroupAdmin()
    {
        try {
            addRemoveGroupAdmin.click();
            test.log(Status.PASS,"Click on add Remove Group Admin");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on delete button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_remove_participant")
    private AndroidElement removeParticipant;
    public void removeParticipant()
    {
        try {
            removeParticipant.click();
            test.log(Status.PASS,"Click on Remove Participant");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on Remove Participant");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_cancel")
    private AndroidElement cancelButton;
    public void cancelButton()
    {
        try
        {
            cancelButton.click();
            test.log(Status.PASS,"Click on Cancel Button");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to click on Cancel Button");
        }
    }
}

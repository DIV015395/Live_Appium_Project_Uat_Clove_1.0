package org.assets;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;

import java.util.ResourceBundle;

public class AssetTransfer extends NewBaseDriver {

    ExtentTest test;

    public AssetTransfer(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/customEditText")
    private AndroidElement remarksText;

    private ResourceBundle resourceBundle = ResourceBundle.getBundle("assetsTransfer");
    private String remarks = resourceBundle.getString("remarks");

    public void setRemarksText()
    {
        try
        {
            remarksText.sendKeys(remarks);
            test.log(Status.PASS,"Remarks Entered ");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/im_thumnail")
    private AndroidElement imagesUpload;

    public void imagesUpload()
    {
        try
        {
           imagesUpload.click();
            test.log(Status.PASS,"Click on upload for Images");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to Click on upload for Images");
        }
    }
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private AndroidElement permissionButton;

    public void permissionButton()
    {
        try
        {
            permissionButton.click();
            test.log(Status.PASS,"Click for give the Permission");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to Click for give the Permission");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/im_cross")
    private AndroidElement deleteImages;
    public void deleteImages()
    {
        try
        {
            deleteImages.click();
            test.log(Status.PASS,"Click for delete Images");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to Click for delete Images");
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
    private AndroidElement shutterButton;
    @AndroidFindBy(id = "com.android.camera2:id/done_button")
    private AndroidElement shutterDone;
    public void shutterDone()
    {
        try {
            shutterButton.click();
            NewBaseDriver.setDriverWaitTenSecond(driver);
            shutterDone.click();
            NewBaseDriver.setDriverWaitTenSecond(driver);
            test.log(Status.PASS,"Capture Done ");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to Capture the Images");
        }
    }

}

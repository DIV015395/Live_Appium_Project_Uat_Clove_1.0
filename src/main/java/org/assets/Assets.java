package org.assets;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.desiredcapabilities.NewBaseDriver;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assets extends NewBaseDriver
{
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/nav_assets")
    private WebElement assetsMenuButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/openDrawer")
    private AndroidElement menu;
    public Assets(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    public void assetsMenuButton()
    {
         try
         {
             assetsMenuButton.click();
             test.log(Status.PASS,"Click on assets Button from Menu");
         }
         catch (Exception e)
         {
             test.log(Status.PASS,"Failed to Click on assets Button from Menu");
         }
    }

    public void setMenu()
    {
        try
        {
            menu.click();
            test.pass("Successful Click on Menu Button");
        } catch (Exception e) {
            test.fail("Failed to click on Menu Button ");
        }

    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_arrowDown")
    private AndroidElement assetListArrowDown;
    public void assetListArrowDown()
    {
        try {
            assetListArrowDown.click();
            test.log(Status.PASS,"Click on assets Arrow Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on assets Arrow Button");
        }
    }

    //
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionButton")
    private List<AndroidElement> listOfActionButton;

    //
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_assetNameTitle")
    private AndroidElement listAssetName;

    public void listAssetNameGetText()
    {
        try {
            listAssetName.getText();
            test.log(Status.PASS,"Click on assets Arrow Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on assets Arrow Button");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_doctorName")
    private AndroidElement listDoctorName;
    public void listDoctorName()
    {
        try {
            listDoctorName.getText();
            test.log(Status.PASS,"Click on assets Arrow Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on assets Arrow Button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_assetQRCode")
    private AndroidElement listAssetQrCode;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_assetIssueDate")
    private AndroidElement listAssetIssueDate;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_assetId")
    private AndroidElement  ListAssetSerialNo;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_categoryName")
    private AndroidElement categoryName;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_showCategory")
    private AndroidElement listAssetSearchCategory;


}

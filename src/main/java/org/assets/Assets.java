package org.assets;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.NewBaseDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

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

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView")
    private AndroidElement listTransferButton;

    public void listTransferButton()
    {
        try
        {
            listTransferButton.click();
            test.log(Status.PASS,"Click on Transfer for assets");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on assets Arrow Button");
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.clove.clover.uat:id/txt_layout_hint")
    private List<WebElement> selectTypeDoctorName;
    public void selectType()
    {
        String type = "Doctor";
        for (WebElement option : selectTypeDoctorName) {
            if (option.getText().equals(type)) {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }
    public void selectDoctorType()
    {
        String type = "Select Doctor";
        for (WebElement option : selectTypeDoctorName) {
            if (option.getText().equals(type)) {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }
    public void selectAccessory()
    {
        String type = "Select Accessory";
        for (WebElement option : selectTypeDoctorName) {
            if (option.getText().equals(type)) {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> allTypeNameDoctorName;
    public void allTypeNameDoctor() {
        String type = "Doctor";
        for (WebElement option : allTypeNameDoctorName) {
            if (option.getText().equals(type)) {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }
    public void doctorName() {
        String type = "Jaipur Bani Park 2 (VRCN7002B)";
        for (WebElement option : allTypeNameDoctorName) {
            if (option.getText().equals(type)) {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }
    public void allTypeNameIT()
    {
        String type = "IT";
        for (WebElement option : allTypeNameDoctorName)
        {
            if (option.getText().equals(type))
            {
                option.click();
                test.log(Status.PASS, "Click on Add files ");
                break;
            }
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_cancel")
    private AndroidElement cancelButton;
    public void cancelButton()
    {
        try {
            cancelButton.click();
            test.log(Status.PASS, "Click on cancel Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Cancel button");
        }
    }
    ////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.clove.clover.uat:id/save_text")
    private AndroidElement doneSave;
    public void doneSave()
    {
        try {
            doneSave.click();
            test.log(Status.PASS, "Click on Done Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Cancel button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_actionSave")
    private AndroidElement actionSubmit;
    public void actionSubmit()
    {
        try
        {
            actionSubmit.click();
            test.log(Status.PASS, "Click on Submit button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Submit Button");
        }
    }

    //////////////////////////////////////////////////////////////////////////////





}

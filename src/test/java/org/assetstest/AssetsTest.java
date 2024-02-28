package org.assetstest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.assets.AssetTransfer;
import org.assets.Assets;
import org.utils.NewBaseDriver;
import org.extentreport.ExtentManager;
import org.schedule.testcase.firstpage.ScheduleScreen;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AssetsTest
{

    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch()
    {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Asset Module", "Assets Test Cases");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();
    }
    @Test(priority = 1)
    public void loginApp() {
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }

    @Test(priority = 2)
    public void redirectToSchedule() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ScheduleScreen obj = new ScheduleScreen((AndroidDriver) driver, test);
        obj.homeSchedule();
    }

    @Test(priority = 3)
    public void assetModule() {
        Assets assets = new Assets((AndroidDriver) driver, test);
////////////////////
        assets.setMenu();
        assets.assetsMenuButton();
        assets.assetListArrowDown();
        assets.listTransferButton();
        assets.selectType();
        assets.allTypeNameDoctor();
        assets.selectDoctorType();
        assets.doctorName();
        assets.selectAccessory();
        assets.doneSave();


        AssetTransfer assetTransfer = new AssetTransfer((AndroidDriver)driver,test);
        assetTransfer.imagesUpload();
        assetTransfer.permissionButton();
        assetTransfer.shutterDone();
        assetTransfer.deleteImages();
        assets.actionSubmit();


    }


}

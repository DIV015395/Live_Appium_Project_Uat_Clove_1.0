package org.applogintest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.desiredcapabilities.NewBaseDriver;
import org.extentreport.ExtentManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class AppLoginNewTest
{
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Login Module", "Login test cases");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();
    }
    @Test(priority = 1 ,description = "Negative Scenario")
    public void loginNegativeScenario() {
        AppLoginNew obj = new AppLoginNew((AndroidDriver) driver, test);
        //
        obj.goClickButton();
        obj.permissionAllowed();
        obj.bothBlankToastMessage();
        //
        obj.userName();
        obj.goClickButton();
        obj.onlyUserNameFill();
        obj.clearUserName();

        //
        obj.userPassword();
        obj.goClickButton();
        obj.onlyPasswordFillToast();
        obj.cleaUserPassword();
        //
        obj.wrongUserName();
        obj.userPassword();
        obj.goClickButton();
        obj.unAuthorisedToast();
        obj.clearUserName();
        obj.cleaUserPassword();
        //
//        obj.userName();
//        obj.userPassword();
//        obj.goClickButton();
//        obj.authorisedToast();
    }
    @Test(priority = 2 ,description = "Positive Scenario")
    public void loginPositiveScenarios() {
        AppLoginNew obj = new AppLoginNew((AndroidDriver) driver, test);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.authorisedToast();
        test.pass("Test Case Execution complete");
    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }
}

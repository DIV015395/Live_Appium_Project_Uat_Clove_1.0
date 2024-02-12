package org.applogintest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.applogin.testcase.TestCase1;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppLoginNewTest {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case 1", "Description of Test Case 1");
//        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }
    }
    @Test(priority = 1 ,description = "Negative Scenario")
    public void loginNegativeScenario() {
        AppLoginNew obj = new AppLoginNew((AndroidDriver) driver, test);

        obj.goClickButton();
        obj.permissonAllowed();
        obj.bothBlankToastMessage();


        obj.userName();
        obj.goClickButton();
        obj.onlyUserNameFill();
        obj.clearUserName();

        //
//        obj.userPassword();
//        obj.goClickButton();
//        obj.printToatMessage();
//        obj.cleaUserPassword();
////
//        obj.wrongUserName();
//        obj.userPassword();
//        obj.goClickButton();
//        obj.printToatMessage();

        test.pass("Test case passed successfully.");
    }



//    @Test(priority = 2 ,description = "Negative Scenario")
//    public void main() {
//        TestCase1 obj = new TestCase1((AndroidDriver) driver, test);
//        obj.userName();
//        obj.goClickButton();
//        obj.permissonAllowed();
//        obj.toastMessage();
//        obj.toastMassageValidation();
//        test.pass("Test case passed successfully.");
//    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
        extent.flush();
    }
}

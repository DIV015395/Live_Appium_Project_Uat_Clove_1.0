package org.expensestest.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.expenses.testcases.ExpenseAddTestCase4;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ExpenseAddTest5 {

    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test case 3", "Expense Add Test Cases 3");
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }

    }

    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void main() throws InterruptedException {
        ExpenseAddTestCase4 obj = new ExpenseAddTestCase4((AndroidDriver) driver);
        obj.expensesClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.nextButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setAddexpense();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setAttachFiles();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setPermissionOne();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setAllowFirstTime();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setAllowSecondtime();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setCamera();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setShutterButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.setDoneCapture();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
    }
}

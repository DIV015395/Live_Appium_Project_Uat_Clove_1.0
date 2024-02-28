package org.scheduletest.testcases.firstpage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.utils.NewBaseDriver;
import org.extentreport.ExtentManager;
import org.schedule.testcase.firstpage.ScheduleScreen;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ScheuleScreenTest
{
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Testcase 1", "description of schedule first page test case 1");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();

    }

    @Test(priority = 1)
    public void loginApp() {
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }

    @Test(priority = 2)
    public void main() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ScheduleScreen obj = new ScheduleScreen((AndroidDriver) driver, test);
        obj.homeSchedule();
        obj.appointmentPlus();
        obj.toastMassageValidation();
        obj.dateChange();
        obj.selectClinicDropdown();
        obj.appointmentPlus();
        obj.screenTitleValidation();
        test.pass("Test is successful pass");
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
        extent.flush();
    }
}

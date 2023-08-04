package org.scheduletest.testcases.secondpage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.SchedulePageTemp;
import org.schedule.testcase.secondpage.TestCase7;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase7Test {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            logger.info("Wrong URL ");
        }
    }

    @Test(priority = 1)
    public void loginApp() {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void schedulePage() {
        SchedulePageTemp obj2 = new SchedulePageTemp((AndroidDriver) driver);
        obj2.homeSchedule();
        obj2.selectClinicDropdown();
        obj2.selectDoctorDropdown();
        obj2.appointmentPlus();
    }

    @Test(priority = 3)
    public void appointmentTestCase() {
        test = extent.createTest("Test case 6", "Schedule second page Test case 6");
        TestCase7 obj1 = new TestCase7((AndroidDriver) driver);
        obj1.detailsPatient();
        obj1.dateSelection();
        obj1.slot_selection();
        obj1.duration_selection();
        obj1.setDoctorName();
        obj1.scrolling();
        obj1.painElements();
        obj1.Chief_Note();
        obj1.saveend();
        obj1.toastMassageValidation();
        test.pass("Test case passed Successfully");
    }

//    @AfterClass
//    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
//        extent.flush();
//    }

}

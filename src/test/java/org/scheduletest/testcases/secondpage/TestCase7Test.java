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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase7Test {
    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    TestCase7 obj;

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
        SchedulePageTemp obj = new SchedulePageTemp((AndroidDriver) driver);
        obj.homeSchedule();
        obj.selectClinicDropdown();
        obj.appointmentPlus();
    }
    @Test(priority = 3)
    public void appointmentTestCase() {
        test = extent.createTest("Test case 7", "Schedule second page Test case 7");
        TestCase7 obj = new TestCase7((AndroidDriver) driver);
        obj.mobileNumberPatient();
        obj.namePatient();
        obj.dateSelection();
        obj.slotSelection();
        obj.durationSelection();
        obj.setDoctorName();
        obj.scrolling();
        obj.painElements();
        obj.chiefNote();
        obj.submitButton();
        obj.toastMassageValidation();
    }
    @Test(priority = 4)
    public void validationDataMessage() {
        obj = new TestCase7((AndroidDriver) driver);
        obj.validatePatientDetails();
        obj.validateClinicName();
        obj.validateAppointmentType();
        obj.validateDoctorName();
        obj.validatePatientId();
        test.pass("Test case passed Successful");
    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }
}

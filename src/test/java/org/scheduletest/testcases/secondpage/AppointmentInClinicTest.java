package org.scheduletest.testcases.secondpage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.utils.DesireCap;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.SchedulePage;
import org.schedule.testcase.secondpage.AppointmentInClinic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppointmentInClinicTest {

    private AppiumDriver driver;
    private ExtentReports extent;
    private ExtentTest test;
    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Scan Appointment", "Scan Appointment");
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
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }

    @Test(priority = 2)
    public void schedulePage() {
        SchedulePage obj = new SchedulePage((AndroidDriver) driver, test);
        obj.homeSchedule();
        obj.selectClinicDropdown();
        obj.selectDoctorDropdown();
        obj.appointmentPlus();
    }
    @Test(priority = 3)
    public void appointmentTestCase() {
        AppointmentInClinic obj = new AppointmentInClinic((AndroidDriver) driver, test);

        obj.calenderOpen();
        obj.previousDate();
        obj.nextButtonInCalender();
        obj.nextButtonInCalender();
        obj.afterTwoMonthDate();
        obj.backButtonInCalender();
        obj.backButtonInCalender();
        obj.previousDate();
        obj.selectDate();
        obj.calenderOkButton();

        obj.scrollingDown();
        obj.submitButton();
        obj.numberToastValidation();
        //
        obj.scrollingUp();
        obj.mobileNumberPatient();
        obj.scrollingDown();
        obj.submitButton();
        obj.nameToastValidation();
        //
        obj.scrollingUp();
        obj.namePatient();
        obj.clearMobileNumberPatient();
        obj.mobileNumberNineDigit();
        obj.scrollingDown();
        obj.submitButton();
        obj.mobileNoInvalidToast();

        obj.scrollingUp();
        obj.clearMobileNumberPatient();
        obj.mobileNumberPatient();
        obj.calenderOpen();
        obj.selectDate();
        obj.calenderOkButton();
        obj.slotSelection();
        obj.durationSelection();
        obj.painElements();
        obj.chiefNote();

        test.pass("Test case passed Successfully");
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
        extent.flush();
    }
}

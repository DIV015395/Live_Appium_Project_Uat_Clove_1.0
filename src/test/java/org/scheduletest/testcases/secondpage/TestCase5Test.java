package org.scheduletest.testcases.secondpage;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.SchedulePage;
import org.schedule.testcase.secondpage.TestCase5;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase5Test {
    public AndroidDriver driver;

    @BeforeClass
    public void driverLaunch() {
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://17.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            System.out.println("URL is not Valid");
            logger.error("Error: Malformed URL - {}", e.getMessage());
            e.printStackTrace();
        }
    }

    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void schedulePage() {
        SchedulePage obj2 = new SchedulePage(driver);
        obj2.homeSchedule();
        obj2.selectClinicDropdown();
        obj2.selectDoctorDropdown();
        obj2.appointmentPlus();
    }

    @Test(priority = 3)
    public void appointmentTestCase() {
        TestCase5 obj1 = new TestCase5(driver);
        obj1.mobileNumberNineDigit();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.scrolling();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.saveend();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.scrollingUp();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.patientName();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.scrolling();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.saveend();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.toastMassageValidation();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}

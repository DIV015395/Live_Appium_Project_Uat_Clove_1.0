package org.scheduletest.testcases.secondpage;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.SchedulePage;
import org.schedule.testcase.secondpage.TestCase2;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase2Test {

    public AndroidDriver driver;

    @BeforeClass
    public void driverLaunch() throws MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

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
        TestCase2 obj1 = new TestCase2(driver);
        obj1.detailsPatient();
        obj1.Scrolling();
        obj1.saveend();
        obj1.toastMassageValidation();
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
    }
}

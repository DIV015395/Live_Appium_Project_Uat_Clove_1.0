package org.scheduletest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.AppointmentPage;
import org.schedule.SchedulePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppointmentPageTest {
    public AppiumDriver driver;

    @BeforeClass
    public void driverLaunch() throws MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 1)
    public void loginpage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void schedulePage() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        SchedulePage obj1 = new SchedulePage((AndroidDriver) driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.homeSchedule();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.selectClinicDropdown();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.selectDoctorDropdown();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.appointmentPlus();
    }

    @Test(priority = 3)
    public void main() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppointmentPage obj1 = new AppointmentPage((AndroidDriver) driver);
        obj1.detailsPatient();
        obj1.dateSelection();
        obj1.slot_selection();
        obj1.duration_selection();
        obj1.scrolling();
        obj1.painElements();
        obj1.Chief_Note();
        obj1.saveend();
    }

    @AfterClass
    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
    }
}

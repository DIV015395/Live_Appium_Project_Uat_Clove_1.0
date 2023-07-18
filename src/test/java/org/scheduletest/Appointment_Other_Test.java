package org.scheduletest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.AppointmentOther;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Appointment_Other_Test
{
    public AppiumDriver driver;
    @Test
    public void main() throws InterruptedException, MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppointmentOther obj1 = new AppointmentOther((AndroidDriver) driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.selectClinicDropdown();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.selectDoctorDropdown();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.Date_selection();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.slot_selection();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.duration_selection();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.Scan_type();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.Scrolling();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.Complete_Address();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.painElements();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.Chief_Note();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        obj1.saveend();
    }
}

package org.Appointment_booking_Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.App_login.App_Login_POM;
import org.Appointment_booking.Appointment_Booking;
import org.Desired_Capabilities.desirecap_POM;
import org.Patient_Search.Patient_Search_POM;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Appointment_booking_Test
{
    public AppiumDriver driver;
    @Test
    public void main() throws InterruptedException, MalformedURLException, MalformedURLException
    {
        DesiredCapabilities caps = desirecap_POM.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        App_Login_POM obj = new App_Login_POM((AndroidDriver) driver);
        obj.Logins();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Appointment_Booking obj1 = new Appointment_Booking((AndroidDriver) driver);
        obj1.selectClinicDropdown();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        obj1.selectDoctorDropdown();
        obj1.Date_selection();
        obj1.slot_selection();
        obj1.duration_selection();
        obj1.Scrolling();
        obj1.painElements();
        obj1.Chief_Note();
//        obj1.saveend();
    }
}

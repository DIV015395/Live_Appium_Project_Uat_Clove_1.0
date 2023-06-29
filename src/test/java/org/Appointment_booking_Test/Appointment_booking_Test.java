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
        Thread.sleep(20000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Thread.sleep(4000);
        App_Login_POM obj = new App_Login_POM((AndroidDriver) driver);
        obj.Logins();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        Appointment_Booking obj1 = new Appointment_Booking((AndroidDriver) driver);
        obj1.selectClinicDropdown();
        Thread.sleep(3000);
        obj1.selectDoctorDropdown();
        obj1.Patient_Dashboard();

    }
}

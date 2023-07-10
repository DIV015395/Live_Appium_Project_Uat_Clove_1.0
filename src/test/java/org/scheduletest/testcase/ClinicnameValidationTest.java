package org.scheduletest.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.Desirecap;
import org.schedule.AppointmentBooking;
import org.schedule.clinicnamevalidation.ClinicnameValidation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ClinicnameValidationTest
{
    public AndroidDriver driver;
    @Test
    public void main() throws IOException, InterruptedException
    {
        DesiredCapabilities caps = Desirecap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        obj.logins();
        AppointmentBooking obj1 = new AppointmentBooking((AndroidDriver) driver);
        obj1.selectClinicDropdown();


    }
}

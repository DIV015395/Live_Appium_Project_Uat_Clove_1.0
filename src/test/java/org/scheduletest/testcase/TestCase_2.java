package org.scheduletest.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.testcase.TestCase2;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase_2
{
    public AndroidDriver driver;
    @Test
    public void main() throws IOException, InterruptedException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin(driver);
        obj.logins();
        TestCase2 obj1 = new TestCase2(driver);
        obj1.homeSchedule();
        String str1 = driver.currentActivity();
        System.out.println(str1);
        obj1.selectClinicDropdown();
        obj1.appointmentPlus();
        String str = driver.currentActivity();
        System.out.println(str);
    }
}

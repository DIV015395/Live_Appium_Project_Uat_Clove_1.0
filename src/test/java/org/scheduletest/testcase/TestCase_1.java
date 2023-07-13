//
package org.scheduletest.testcase;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.Desirecap;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.testcase.TestCase1;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase_1
{
    public AndroidDriver driver;
    @Test
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = Desirecap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        TestCase1 obj1 = new TestCase1((AndroidDriver) driver);
        obj1.homeSchedule();
        obj1.appointmentPlus();
    }
}

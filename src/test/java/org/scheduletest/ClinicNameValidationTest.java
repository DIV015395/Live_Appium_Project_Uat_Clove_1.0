package org.scheduletest;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.Desirecap;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.schedule.ClinicNameValidation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ClinicNameValidationTest {
    public AndroidDriver driver;
    @Test
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = Desirecap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        obj.logins();
        ClinicNameValidation obj1 = new ClinicNameValidation((AndroidDriver) driver);
        obj1.nameValidation();

    }
}

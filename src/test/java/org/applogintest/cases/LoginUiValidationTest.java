package org.applogintest.cases;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.testcase.LoginUiValidation;
import org.desiredcapabilities.Desirecap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LoginUiValidationTest
{
    public AndroidDriver driver;
    @Test
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = Desirecap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        LoginUiValidation obj = new LoginUiValidation((AndroidDriver) driver);
        obj.logins();
    }
}

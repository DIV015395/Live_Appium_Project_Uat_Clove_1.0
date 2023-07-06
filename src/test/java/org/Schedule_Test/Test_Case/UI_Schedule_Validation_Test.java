package org.Schedule_Test.Test_Case;

import io.appium.java_client.android.AndroidDriver;
import org.App_login.App_Login_POM;
import org.Desired_Capabilities.desirecap_POM;
import org.Schedule.Test_Case.UI_Schedule_Validation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class UI_Schedule_Validation_Test
{
    public AndroidDriver driver;
    @Test
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = desirecap_POM.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        App_Login_POM obj = new App_Login_POM((AndroidDriver) driver);
        obj.Logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        UI_Schedule_Validation obj1 = new UI_Schedule_Validation((AndroidDriver) driver);
        obj1.selectClinicDropdown();

    }
}

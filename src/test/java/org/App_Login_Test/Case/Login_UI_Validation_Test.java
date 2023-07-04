package org.App_Login_Test.Case;

import io.appium.java_client.android.AndroidDriver;
import org.App_login.App_Login_POM;
import org.App_login.Test_Case.Login_UI_Validation;
import org.Desired_Capabilities.desirecap_POM;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login_UI_Validation_Test
{
    public AndroidDriver driver;
    @Test
    public void main() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = desirecap_POM.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Login_UI_Validation obj = new Login_UI_Validation((AndroidDriver) driver);
        obj.Logins();
    }
}

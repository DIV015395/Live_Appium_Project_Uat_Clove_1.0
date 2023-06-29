package org.Patient_Search_Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.App_login.App_Login_POM;
import org.Desired_Capabilities.desirecap_POM;
import org.Patient_Search.Patient_Search_POM;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Patient_Search
{
    public AppiumDriver driver;
    @Test
    public void main() throws InterruptedException, MalformedURLException, MalformedURLException
    {
        DesiredCapabilities caps = desirecap_POM.desire();
        Thread.sleep(20000);
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Thread.sleep(1000);
        App_Login_POM obj = new App_Login_POM((AndroidDriver) driver);
        obj.Logins();
        Patient_Search_POM obj1 = new Patient_Search_POM((AndroidDriver) driver);
        obj1.explore();
        obj1.patientSearch();

    }
}

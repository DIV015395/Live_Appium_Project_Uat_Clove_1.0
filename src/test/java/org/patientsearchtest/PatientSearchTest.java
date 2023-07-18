package org.patientsearchtest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.patientsearch.PatientSearch;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class PatientSearchTest
{
    public AppiumDriver driver;
    @Test
    public void main() throws InterruptedException, MalformedURLException
    {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS) ;
        PatientSearch obj1 = new PatientSearch((AndroidDriver) driver);
        obj1.explore();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj1.patientSearch();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

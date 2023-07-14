package org.scheduletest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.Toast;
import org.desiredcapabilities.Desirecap;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class toasttest {

    public AppiumDriver driver;

    @Test
    public void main() throws InterruptedException, IOException {
        DesiredCapabilities caps = Desirecap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Toast obj = new Toast((AndroidDriver) driver);
        obj.ttt();
    }
}

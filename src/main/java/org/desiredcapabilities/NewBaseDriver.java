package org.desiredcapabilities;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class NewBaseDriver
{

    public static AndroidDriver<AndroidElement> driver;
    ExtentTest test;
    AppiumDriver appiumDriver;
    public NewBaseDriver(AndroidDriver<AndroidElement> driver,ExtentTest test) {
        NewBaseDriver.driver = driver;
        this.test = test;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }
    public void setDriverWaitTenSecond(AppiumDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void setDriverWaitFiveSecond(AppiumDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void setDriverWaitTillThreeSecond()
    {
        try
        {
            Thread.sleep(3000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public void setDriverWaitTenSecond()
    {
        try
        {
            Thread.sleep(10000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

//    public void waitTillElementIsVisible(WebElement element,AppiumDriver driver){
//        Wait wait=new WebDriverWait(driver,TimeUnit.SECONDS.toSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
    public AppiumDriver driverLaunch() {

        try {
            if (appiumDriver == null) {
                DesiredCapabilities caps = DesireCap.desire();
                appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
                test.pass("Drive Launch Successful and Match Server Port and Desirecapibilities");
            }
        } catch (MalformedURLException e) {
            test.fail("Failed to Create the");
        }
        return appiumDriver;
    }
}

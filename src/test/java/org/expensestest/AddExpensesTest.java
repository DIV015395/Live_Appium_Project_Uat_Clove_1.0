package org.expensestest;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.desiredcapabilities.DesireCap;
import org.expenses.AddExpenses;
import org.expenses.Expenses;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AddExpensesTest {


    public AndroidDriver driver;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() throws MalformedURLException {
        DesiredCapabilities caps = DesireCap.desire();
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.logins();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 2)
    public void main() throws InterruptedException {
        AddExpenses obj = new AddExpenses(driver);
        obj.expensesClick();
        obj.nextButton();
        obj.setClinic();
        obj.setAddexpense();
        obj.informationExpenses();

    }

    @AfterClass
    public void driverClose() {
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.quit();
    }
}

package org.expensestest.testcases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.utils.DesireCap;
import org.expenses.testcases.ExpenseAddNotExceedBalance;
import org.extentreport.ExtentManager;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ExpenseAddNotExceedBalanceTest {


    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;

    @BeforeClass
    public void driverLaunch() {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Expense Add Not with Exceed Balance", "Clinic should be a amount for Expense");
        Logger logger = LoggerFactory.getLogger(getClass());
        try {
            DesiredCapabilities caps = DesireCap.desire();
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            test.log(Status.FAIL, "Click function is not working");
        }

    }

    @Test(priority = 1)
    public void loginApp() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        AppLogin obj = new AppLogin((AndroidDriver) driver, test);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.userName();
        obj.userPassword();
        obj.goClickButton();
        obj.permissonAllowed();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test(priority = 2)
    public void expenseAddNotExceedBalance() {
        ExpenseAddNotExceedBalance obj = new ExpenseAddNotExceedBalance((AndroidDriver) driver, test);
        obj.expensesClick();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        obj.nextButton();
        obj.setClinic();
        obj.setAddexpense();
        obj.setName();
        obj.setQuantity();
        obj.setAmount();
        obj.setAttachFiles();
        obj.setPermissionOne();
        obj.setAllowFirstTime();
        obj.setAllowSecondtime();
        obj.setCamera();
        obj.setShutterButton();
        obj.setDoneCapture();
        obj.setActionSave();
        obj.toastMessage();
        obj.toastMassageValidation();
        obj.scrollTo();
        obj.printDetailsForMatchingItems();
        obj.clickActionButtonForItemText();
        obj.setView();
        obj.setRemarksBackArrow();
        obj.clickActionButtonForItemText();
        obj.setEdit();
        obj.setEditName();
        obj.setEditAmount();
        obj.setEditQuantity();
    }

    @AfterClass
    public void driverClose() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.quit();
        extent.flush();
    }
}

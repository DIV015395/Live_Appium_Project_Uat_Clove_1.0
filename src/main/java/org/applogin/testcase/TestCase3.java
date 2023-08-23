//Not fill anythings in username and password and click on Go button.
//you will get toast massage.

package org.applogin.testcase;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.applogin.AppLogin;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase3 extends AppLogin {
    public ExtentTest test;

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    String getmassage;

    public TestCase3(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void testCase() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_login_go.click();
        test.log(Status.PASS, "Clicked on Go button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        permission_allow_button.click();
        test.log(Status.PASS, "Permisson Allowed");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getmassage = massages.getText();
        System.out.println(getmassage);
        test.log(Status.INFO, getmassage);
    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Please enter valid username & password!");
        test.log(Status.PASS, "Toast Message Validated");
    }
}

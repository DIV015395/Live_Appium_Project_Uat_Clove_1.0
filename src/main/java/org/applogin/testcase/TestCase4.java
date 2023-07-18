//try to login with wrong credential in user id and password.
//click on go button
//it should be display toast massage "You are not authorised to access"


package org.applogin.testcase;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.applogin.AppLogin;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase4 extends AppLogin {
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    String getmassage;

    public TestCase4(AndroidDriver driver) {
        super(driver);
    }

    public void testCase() {
        et_login_username.sendKeys("manjeet");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_password.sendKeys("qpalzm2223");

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        tv_login_go.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        permission_allow_button.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        getmassage = massages.getText();
        System.out.println(getmassage);
    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "You are not authorised to access.");
    }
}

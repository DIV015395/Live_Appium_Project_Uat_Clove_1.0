package org.applogin;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppLogin extends BaseDriver {
    public ExtentTest test;

    public AppLogin(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_username")
    public AndroidElement et_login_username;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_password")
    public AndroidElement et_login_password;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    public AndroidElement tv_login_go;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public AndroidElement permission_allow_button;
    public void logins() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("login");
        String userid = resourceBundle.getString("id");
        String password = resourceBundle.getString("pass");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_username.sendKeys(userid);
        test.log(Status.PASS, "Correct User Id Filled");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_password.sendKeys(password);
        test.log(Status.PASS, "Correct Password Filled");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_login_go.click();
        test.log(Status.PASS, "Clicked on Go Button");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        permission_allow_button.click();
        test.log(Status.PASS, "Permisson Allowed");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

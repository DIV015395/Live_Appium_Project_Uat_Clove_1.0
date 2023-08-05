package org.applogin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppLogin extends BaseDriver
{

    public AppLogin(AndroidDriver driver)
    {
        super(driver);
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_login_password.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_login_go.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        permission_allow_button.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

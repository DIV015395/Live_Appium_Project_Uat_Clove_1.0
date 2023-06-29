package org.App_login;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.Desired_Capabilities.BaseDriver;

public class App_Login_POM extends BaseDriver
{
    public App_Login_POM(AndroidDriver driver)
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
    public void Logins() throws InterruptedException
    {
        Thread.sleep(2000);
        et_login_username.sendKeys("manjeet.sharma");
        Thread.sleep(1000);
        et_login_password.sendKeys("qpalzm@#1M");
        Thread.sleep(2000);
        tv_login_go.click();
        Thread.sleep(1000);
        permission_allow_button.click();
        Thread.sleep(1000);
    }
}

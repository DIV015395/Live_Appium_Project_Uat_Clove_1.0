package org.applogin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.concurrent.TimeUnit;

public class Toast extends AppLogin {

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    public AndroidElement tv_login_go;
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massa;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public AndroidElement permission_allow_button;

    public Toast(AndroidDriver driver) {
        super(driver);
    }

    public void ttt() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_login_go.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        permission_allow_button.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mas = massa.getText();
        System.out.println(mas);
    }
}

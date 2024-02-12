package org.applogin;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
public class AppLoginNew extends BaseDriver
{
    private String getToastMassage;
    private final ExtentTest test;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_username")
    private AndroidElement et_login_username;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_login_password")
    private AndroidElement et_login_password;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_login_go")
    private AndroidElement tv_login_go;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement permission_allow_button;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("login");
    private final String userid = resourceBundle.getString("id");
    private final String password = resourceBundle.getString("pass");

    public AppLoginNew(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void userName() {
        et_login_username.sendKeys(userid);
        test.log(Status.PASS, "Correct User Id Filled");
    }
    public void wrongUserName() {
        et_login_username.sendKeys("efefef");
        test.log(Status.PASS, "Correct User Id Filled");
    }
    public void clearUserName()
    {
        et_login_username.clear();
    }
    public void userPassword() {
        et_login_password.sendKeys(password);
        test.log(Status.PASS, "Correct Password Filled");
    }
    public void cleaUserPassword()
    {
    et_login_password.clear();
    }
    public void goClickButton() {
        tv_login_go.click();
        test.log(Status.PASS, "Clicked on Go Button");
    }

    public void permissonAllowed() {
        permission_allow_button.click();
        test.log(Status.PASS, "Permisson Allowed");
    }
    String bothBlank = "Please enter valid username & password!";
    String onlyUserNameFill = "Please enter password!";
    String onlyPasswordFill = "Please enter username!";
    String unauthorisedToast = "You are not authorised to access!";
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastMessages;


    public void bothBlankToastMessage()
    {
        customSoftAssert(toastMessages.getText(),bothBlank);
    }
    public void onlyUserNameFill()
    {
        customSoftAssert(toastMessages.getText(),onlyUserNameFill);
    }
    public void onlyPasswordFillToast()
    {
        customSoftAssert(toastMessages.getText(),onlyPasswordFill);
    }
    public void unauthorisedToast()
    {
        customSoftAssert(toastMessages.getText(),unauthorisedToast);
    }
    public void customSoftAssert(String Actual, String Expected)
    {

        if(Actual.equals(Expected))
        {
            test.log(Status.PASS,"Actual: "+ Actual+ " matches Expected: "+ Expected);
        }
        else
        {
            test.log(Status.FAIL,"Actual: "+ Actual+ " does not match Expected: "+ Expected);
        }

    }


}

package org.applogin;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;
import java.util.ResourceBundle;
public class AppLoginNew extends NewBaseDriver
{
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
        super(driver,test);
        this.test = test;
    }
    public void userName()
    {
        try
        {   setDriverWaitTenSecond(driver);
                et_login_username.sendKeys(userid);
                test.log(Status.PASS, "Correct User Id Filled");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to fill UserName ");
            }

    }
    public void wrongUserName()
    {
        et_login_username.sendKeys("Manjeet.sharmassss");
        test.log(Status.PASS, "Correct User Id Filled");
    }
    public void clearUserName()
    {
        et_login_username.clear();
    }
    public void userPassword()
    {

            try
            {
                setDriverWaitTenSecond(driver);
                et_login_password.sendKeys(password);
                test.log(Status.PASS, "Correct Password Filled");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to fill UserPassword ");
            }
    }
    public void cleaUserPassword()
    {

        if(et_login_password.isDisplayed())
        {
            try
            {
                et_login_password.clear();
                test.log(Status.PASS,"Text clear in User Password Filled");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to fill clear UserPassword ");
            }
        }
        else
        {
            test.log(Status.FAIL,"Failed to identify the locator for userPassword for Clear");
        }
    }
    public void goClickButton()
    {
            try
            {
                setDriverWaitTenSecond(driver);
                tv_login_go.click();
                test.log(Status.PASS, "Clicked on Go Button");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to Click on Go Button");
            }
    }


    public void permissionAllowed() {
          try
            {
                setDriverWaitTenSecond(driver);
                permission_allow_button.click();
                test.log(Status.PASS, "Permission Allowed");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to click on Allow Button");
            }
    }
    String bothBlank = "Please enter valid username & password!";
    String onlyUserNameFill = "Please enter password!";
    String onlyPasswordFill = "Please enter username!";
    String unauthorisedToast = "You are not authorised to access!";
    String authorisedToast = "Please wait, your contacts are being updated!";


    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastMessages;
    public void bothBlankToastMessage()
    {
        customSoftAssert(toastMessages.getText(),bothBlank);
        setDriverWaitTillThreeSecond();
    }
    public void onlyUserNameFill()
    {
        customSoftAssert(toastMessages.getText(),onlyUserNameFill);
        setDriverWaitTillThreeSecond();
    }
    public void onlyPasswordFillToast()
    {
        customSoftAssert(toastMessages.getText(),onlyPasswordFill);
        setDriverWaitTillThreeSecond();
    }
    public void unAuthorisedToast()
    {
        setDriverWaitTillThreeSecond();
        customSoftAssert(toastMessages.getText(),unauthorisedToast);
        setDriverWaitTillThreeSecond();
    }
    public void authorisedToast()
    {
        setDriverWaitTenSecond(driver);
        customSoftAssert(toastMessages.getText(),authorisedToast);
        setDriverWaitTillThreeSecond();
    }
    public void customSoftAssert(String Actual, String Expected)
    {

        if(Actual.equals(Expected))
        {
            test.log(Status.PASS,"Actual: "+ Actual+ " : matches Expected: "+ Expected);
        }
        else
        {
            test.log(Status.FAIL,"Actual: "+ Actual+ " : does not match Expected: "+ Expected);
        }
    }
    public void loginPositiveScenario()
    {
         userName();
         userPassword();
         goClickButton();
        permissionAllowed();
        authorisedToast();
    }

}

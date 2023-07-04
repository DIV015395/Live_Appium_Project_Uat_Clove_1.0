package org.App_login.Test_Case;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.App_login.App_Login_POM;
import org.Desired_Capabilities.BaseDriver;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class Login_UI_Validation extends App_Login_POM
{
    public Login_UI_Validation(AndroidDriver<AndroidElement> driver)
    {
        super(driver);
    }
    @Override
    public void Logins() throws InterruptedException
    {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try
        {
            et_login_username.sendKeys("manjeet.sharma");
            System.out.println("Pass -> User ID");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Webelement not found for send the User ID , Please write correct Webelement");
            System.out.println("Navigation");
            System.out.println("Install the App => Go on Login Page => Fill the User id => This is Problems ");
            System.out.println("Please resolve");
        }

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       try
       {
           et_login_password.sendKeys("qpalzm@#1M");
           System.out.println("Pass -> User Password");
       }
       catch (NoSuchElementException e)
       {
           System.out.println("Webelement not found for send the User ID , Please write correct Webelement");
           System.out.println("Navigation");
           System.out.println("Install the App => Go on Login Page => Fill the User id => After =>Fill the Password => This is Problems");
           System.out.println("Please resolve");

       }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            tv_login_go.click();
            System.out.println("Pass -> login button");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Click option is not working on Click Buttons After filling the User id and Password");
            System.out.println("Navigation");
            System.out.println("Install the App => Go on Login Page => Fill the User id => After =>Fill the Password => Then Click on Button");
            System.out.println(" => This is Problems");
            System.out.println("Please resolve");

        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try {
            permission_allow_button.click();
            System.out.println("Pass -> Allow button");
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Allow button is Not working After click on Login button");
            System.out.println("Navigation");
            System.out.println("Install the App => Go on Login Page => Fill the User id => After =>Fill the Password => Then Click on Button");
            System.out.println(" => This is Problems");
            System.out.println("Please resolve");

        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}

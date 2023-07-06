package org.applogin.testcase;

import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLogin;
import org.openqa.selenium.NoSuchElementException;

import java.util.concurrent.TimeUnit;

public class LoginUiValidation extends AppLogin
{
    public LoginUiValidation(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void logins() throws InterruptedException
    {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        try
        {
            et_login_username.sendKeys("manjeet.sharma");
            System.out.println("Pass -> User ID");
        }
        catch (NoSuchElementException e)
        {
//            Log.error("Report Category button element is not found");

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

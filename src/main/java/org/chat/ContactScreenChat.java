package org.chat;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.ResourceBundle;

public class ContactScreenChat extends NewBaseDriver {
    ExtentTest test;


    public ContactScreenChat(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_contact")
    private AndroidElement contactButton;
    public void contactButton()
    {
        try {
            NewBaseDriver.setDriverWaitTenSecond(driver);
            contactButton.click();
            test.log(Status.PASS,"Click on Contact Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on Contact Button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_userName")
    private List<AndroidElement> userName;


    private ResourceBundle resourceBundle = ResourceBundle.getBundle("chatSearchUser");
    private String userNameClick = resourceBundle.getString("userNameClick");
    public void userNameClick()
    {
        String type = userNameClick;
        for (WebElement option : userName) {
            if (option.getText().equals(type))
            {
                NewBaseDriver.setDriverWaitTenSecond(driver);
                option.click();
                test.log(Status.PASS, "Click on User for Chating ");
                break;
            }
        }

    }
}

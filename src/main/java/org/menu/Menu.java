package org.menu;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;

public class Menu extends BaseDriver
{
    ExtentTest test;
    public Menu(AndroidDriver driver, ExtentTest test)
    {
        super(driver);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/openDrawer")
    private AndroidElement menuButtonOpenDrawer;
    public void menuButtonOpenDrawer()
    {
        try {
            menuButtonOpenDrawer.click();
            test.pass("Menu Button means Three line Button is Working, It is Clickable");
        }
        catch (Exception e)
        {
            test.fail("Not click on Menu Button");
        }
    }
}

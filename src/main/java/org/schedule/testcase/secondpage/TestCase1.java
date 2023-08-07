//simple click on save button

package org.schedule.testcase.secondpage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase1 extends AppointmentPage {
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    String getmassage;

    public TestCase1(AndroidDriver driver) {
        super(driver);
    }

    public void scrolling() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    @Override
    public void submitButton() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Please enter patient mobile number!");
    }
}

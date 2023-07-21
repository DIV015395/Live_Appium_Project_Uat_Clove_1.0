//check mobile number field validation in Appointment page

package org.schedule.testcase.secondpage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentPage;

import java.util.concurrent.TimeUnit;

public class TestCase5 extends AppointmentPage {

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    String getmassage;

    public TestCase5(AndroidDriver driver) {
        super(driver);
    }

    public void mobileNumberNineDigit() {
        et_contact.sendKeys("701113149");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void scrolling() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    @Override
    public void saveend() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
    }


    public void mobileNumberElevenDigit() {
        et_contact.sendKeys("70111314981");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }


}

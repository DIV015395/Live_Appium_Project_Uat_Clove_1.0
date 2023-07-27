//fill both name and phone no everythings then click on save button

package org.schedule.testcase.secondpage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase4 extends AppointmentPage {
    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    String getmassage;

    public TestCase4(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public void detailsPatient() {
        et_contact.sendKeys("7011131498");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_name.sendKeys("ManjeetSharma");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Override
    public void scrolling() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    @Override
    public void saveend() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
    }

    public void toastMassageValidation() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(getmassage, "Appointment added successfully!");
    }
}

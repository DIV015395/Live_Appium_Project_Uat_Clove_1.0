//Do not select clinic
//Doctor will be default name
//click on appointmentPlus button
//it generate some massage for user.

package org.schedule.testcase.firstpage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.SchedulePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestCase1 extends SchedulePage {

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massagess;
    String getmassage;

    public TestCase1(AndroidDriver driver) {
        super(driver);
    }

    public void toastMassage() {
        getmassage = massagess.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Please select a valid clinic!");
    }
}

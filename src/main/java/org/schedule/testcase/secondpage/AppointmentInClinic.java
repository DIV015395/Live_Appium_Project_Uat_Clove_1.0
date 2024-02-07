package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.schedule.AppointmentPage;
import org.testng.Assert;

public class AppointmentInClinic extends AppointmentPage {
    ExtentTest test;
    public AppointmentInClinic(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement messages;
    private String mobileNumber = "Please enter patient mobile number!";

    public void numberToastValidation() {
        Assert.assertEquals(mobileNumber, messages.getText());
        test.log(Status.PASS,"Toast Message :- "+mobileNumber);
    }
    private String nameGetMessage = "Please enter patient name!";
    public void nameToastValidation()
    {
        Assert.assertEquals(nameGetMessage, messages.getText());
    }

    private String  mobileNoInvalidToast = "Enter 10 digit mobile no!";
    public void mobileNoInvalidToast()
    {
        Assert.assertEquals(mobileNoInvalidToast, "Enter 10 digit mobile no!");
    }
}

package org.schedule.uivalidation.secondpage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

public class ValidationAppointmentPage extends BaseDriver {
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentAddEdit_patientPhone_title")
    public WebElement mobile;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentAddEdit_patientName_title")
    public WebElement name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]")
    public WebElement duration;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")
    public WebElement dentist;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notesTitle")
    public WebElement notes;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView")

    public WebElement cheifcomplain;
    @AndroidFindBy(id = "com.clove.clover.uat:id/save_text")
    public WebElement save;

    public ValidationAppointmentPage(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void uiValidation() {
        System.out.println(mobile.getText());
        System.out.println("mobile no field => " + et_contact.getText());
        System.out.println(name.getText());
        System.out.println("name field => " + et_name.getText());
        System.out.println(duration.getText());
        System.out.println(dentist.getText());
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
        System.out.println(notes.getText());
        System.out.println(cheifcomplain.getText());
        System.out.println(save.getText());
    }
}

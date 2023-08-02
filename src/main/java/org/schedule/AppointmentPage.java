package org.schedule;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppointmentPage extends BaseDriver {
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"04 August 2023\"]")
    public WebElement Date;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDateSelect")
    public WebElement Dates;
    //    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_next_month_arrow")
//    public WebElement Next_month;
    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    public WebElement Dateok;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_timeSlots")
    public WebElement rv_timeSlots;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlot")
    public List<WebElement> tv_timeSlot;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDuration")
    public WebElement tv_appointmentDuration;

    //Till  Date is okkk
    @AndroidFindBy(id = "com.clove.clover.uat:id/np_appointmentDuration")
    public List<WebElement> np_appointmentDuration;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlotPicker_actionButtonDone")
    public WebElement duration_Ok;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notesTitle")
    public WebElement tv_notesTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    public WebElement et_text;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDone")
    public WebElement iv_actionDone;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_save")
    public WebElement iv_save;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_chiefComplaintList")
    private WebElement painElement;

    public AppointmentPage(AndroidDriver driver) {
        super(driver);
    }

    public void detailsPatient() {
        et_contact.sendKeys("7011131498");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_name.sendKeys("ManjeetSharma");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void dateSelection() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Dates.click();
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        Next_month.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Date.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Dateok.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void slot_selection() {
        rv_timeSlots.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredslot = "10:00";
        for (WebElement option : tv_timeSlot) {
            if (option.getText().equals(desiredslot)) {
                option.click();
                break;
            }
        }
    }

    public void duration_selection() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_appointmentDuration.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        duration_Ok.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //Scroll down perform karna hai is jagah par;
    public void scrolling() {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }

    public void painElements() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        painElement.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void Chief_Note() {
        tv_notesTitle.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        et_text.sendKeys("Very hard pain");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_actionDone.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void saveend() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        iv_save.click();
    }
}

package org.Appointment_booking;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.Desired_Capabilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.touch.TouchActions;

import static java.awt.FileDialog.SAVE;


public class Appointment_Booking extends BaseDriver {
    public Appointment_Booking(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule")
    public WebElement tv_home_schedule;

    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    public WebElement layout_clinicSelect;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> tv_itemTitle;

    public void selectClinicDropdown() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tv_home_schedule.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Amanora";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }


    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    public WebElement layout_doctorSelect;


    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    public WebElement fab_newAppointment;

    public void selectDoctorDropdown() throws InterruptedException {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Amit Bhatia";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        fab_newAppointment.click();
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_contact")
    public WebElement et_contact;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_name")
    public WebElement et_name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDateSelect")
    public WebElement Dates;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_next_month_arrow")
    public WebElement Next_month;
    @AndroidFindBy(xpath = "//android.view.View[@content-desc=\"01 July 2023\"]")
    public WebElement Date;
    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    public WebElement Dateok;

    public void Date_selection() {
        et_contact.sendKeys("7011131498");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        et_name.sendKeys("ManjeetSharma");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Dates.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Next_month.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Date.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Dateok.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Till  Date is okkk

    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_timeSlots")
    public WebElement rv_timeSlots;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlot")
    public List<WebElement> tv_timeSlot;
    public void slot_selection() throws InterruptedException {
        rv_timeSlots.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredslot = "10:00";
        for (WebElement option : tv_timeSlot) {
            if (option.getText().equals(desiredslot)) {
                option.click();
                break;
            }
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentDuration")
    public WebElement tv_appointmentDuration;
    @AndroidFindBy(id = "com.clove.clover.uat:id/np_appointmentDuration")
    public List<WebElement> np_appointmentDuration;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_timeSlotPicker_actionButtonDone")
    public WebElement duration_Ok;

    public void duration_selection()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tv_appointmentDuration.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        duration_Ok.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //Scroll down perform karna hai is jagah par;
    public void Scrolling()
    {
        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"SAVE\"));"));
    }
    //scroll down perfomance




    @AndroidFindBy(id = "com.clove.clover.uat:id/rv_chiefComplaintList")
    private WebElement painElement;
    public void painElements()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        painElement.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }







    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notesTitle")
    public WebElement tv_notesTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    public WebElement et_text;

    @AndroidFindBy(id ="com.clove.clover.uat:id/iv_actionDone")
    public WebElement iv_actionDone;
    public void Chief_Note() throws InterruptedException {
        tv_notesTitle.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        et_text.sendKeys("Very hard pain");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        iv_actionDone.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AndroidFindBy(id ="com.clove.clover.uat:id/iv_save")
    public WebElement iv_save;
    public void saveend()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        iv_save.click();
    }


}



package org.schedule;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SchedulePage extends BaseDriver {
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule")
    public WebElement tv_home_schedule;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    public WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> tv_itemTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_doctorSelect")
    public WebElement layout_doctorSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/fab_newAppointment")
    public WebElement fab_newAppointment;

    public SchedulePage(AndroidDriver driver) {
        super(driver);
    }

    public void homeSchedule() {

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        tv_home_schedule.click();
    }

    public void selectClinicDropdown() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Developer West";

        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void selectDoctorDropdown() {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Manjeet Sharma";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void appointmentPlus() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fab_newAppointment.click();
    }


}

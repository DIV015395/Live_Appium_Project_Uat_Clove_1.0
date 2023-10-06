package org.schedule;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class SchedulePageTemp extends SchedulePage {
    private final ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_schedule")
    private WebElement tv_home_schedule;

    public SchedulePageTemp(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }


    ResourceBundle resourceBundle = ResourceBundle.getBundle("tempschedule");
    String doctorName = resourceBundle.getString("doctorName");
    String doctorName1 = resourceBundle.getString("doctorName1");
    String clinicName = resourceBundle.getString("clinicName");
    String clinicName1 = resourceBundle.getString("clinicName1");

    @Override
    public void homeSchedule() {

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        tv_home_schedule.click();
    }

    @Override
    public void selectClinicDropdown() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = clinicName;

        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void selectClinicDropdownOne() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = clinicName1;

        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    @Override
    public void selectDoctorDropdown() {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text ""
        String desiredOptionText = doctorName;
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void selectDoctorDropdownOne() {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // Assuming you want to select the option with text ""
        String desiredOptionText = doctorName1;
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    @Override
    public void appointmentPlus() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        fab_newAppointment.click();
    }
}

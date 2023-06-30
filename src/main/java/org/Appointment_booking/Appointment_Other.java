package org.Appointment_booking;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class Appointment_Other extends Appointment_Booking
{
    public Appointment_Other(AndroidDriver driver) {
        super(driver);
    }
    @Override
    public void selectClinicDropdown() throws InterruptedException
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tv_home_schedule.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Bodakdev";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }
    @Override
    public void selectDoctorDropdown() throws InterruptedException {
        layout_doctorSelect.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Manjeet Sharma";
        for (WebElement option : tv_itemTitle) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        fab_newAppointment.click();
    }
    @Override
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
    @Override
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
    @Override
    public void duration_selection()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tv_appointmentDuration.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        duration_Ok.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scan_type")
    public WebElement tv_scan_type;

   @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView")
   public WebElement home_type;
    public void Scan_type()
    {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        tv_scan_type.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        home_type.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_address")
    public WebElement et_address;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_city")
    public WebElement et_city;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_pin_codes")
    public WebElement et_pin_codes;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_state")
    public WebElement et_state;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[10]/android.widget.TextView")
    public WebElement state_delhi;
    public void Complete_Address()
    {
        et_address.sendKeys("Tilpat Near Canara Bank");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        et_city.sendKeys("Faridabad");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        et_pin_codes.sendKeys("110066");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        et_state.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        state_delhi.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}

package org.schedule.testcase.secondpage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppointmentScanBookNextDay extends AppointmentPage {



    ResourceBundle resourceBundleScanNextDay = ResourceBundle.getBundle("scanAppointmentDataForNextDay");
    String patientNameScan = resourceBundleScanNextDay.getString("namePatient");
    String patientMobileNumberScan = resourceBundleScanNextDay.getString("mobileNumber");
    //Please the date
    @AndroidFindBy(xpath ="//android.view.View[@content-desc=\"09 February 2024\"]")
    public WebElement nextDate;
    ExtentTest test;
    public AppointmentScanBookNextDay(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test =test;
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> tv_itemTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layout_clinicSelect;
    public void selectClinicDropdown() {
        try {
            layout_clinicSelect.click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Assuming you want to select the option with text "Bodakdev"
            String desiredOptionText = "ExtSC-Pune";
            for (WebElement option : tv_itemTitle) {
                if (option.getText().equals(desiredOptionText)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Doctor is selected from dropdown");
        } catch (Exception e) {
            test.log(Status.FAIL, "Doctor is selected from dropdown -> Failed");
        }
    }

    public void selectNextDate() {
        if(nextDate.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                nextDate.click();
                test.log(Status.PASS, "Date selected from calender");
            } catch (Exception e) {
                test.log(Status.FAIL, "Date selected from calender -> Not Working");
            }
        }
        else {
            test.log(Status.FAIL, "Failed to Identify Next Date ");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_address")
    private WebElement address;
    String scanAddress = resourceBundleScanNextDay.getString("scanAddress");

    @Override
    public void address()
    {
        if (address.isDisplayed())
        {
            try {
                address.sendKeys(scanAddress);
                test.log(Status.PASS,"Send address in address element");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed = Send address in address element");
            }
        }
        else
        {
            test.log(Status.FAIL,"Identify Failed = Send address in address element");
        }
    }
    public void clearAddress()
    {
        webElementClear(address);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_city")
    private WebElement city;

    String scanCity = resourceBundleScanNextDay.getString("scanCity");
    @Override
    public void city()
    {
        if (city.isDisplayed())
        {
            try {
                city.sendKeys(scanCity);
                test.log(Status.PASS,"Send city in address element");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed = Send city in address element");
            }
        }
        else
        {
            test.log(Status.FAIL,"Identify Failed = Send city in address element");
        }
    }
    public void clearCity()
    {
        webElementClear(city);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_pin_code")
    private WebElement pinCode;

    String scanPinCode = resourceBundleScanNextDay.getString("scanPinCode");
    @Override
    public void pinCode()
    {
        if (pinCode.isDisplayed())
        {
            try {
                pinCode.sendKeys(scanPinCode);
                test.log(Status.PASS,"Send pinCode in address element");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed = Send pinCode in address element");
            }
        }
        else
        {
            test.log(Status.FAIL,"Identify Failed = Send pinCode in address element");
        }
    }
    public void clearPinCode()
    {
        webElementClear(pinCode);
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_state")
    private WebElement selectState;
    @Override
    public void selectState()
    {
        if (selectState.isDisplayed())
        {
            try {
                selectState.click();
                test.log(Status.PASS,"Click on select State");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed = Click on select State");
            }
        }
        else
        {
            test.log(Status.FAIL,"Identify Failed = Click on select State");
        }
    }
    String scanState = resourceBundleScanNextDay.getString("scanState");
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> itemTitle;
    @Override
    public void itemTitleSate() {
        try {
            for (WebElement option : itemTitle)
            {
                if (option.getText().equals(scanState)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Doctor is selected from dropdown");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL, "Doctor is selected from dropdown -> Failed");
        }
    }


    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_nextDate")
    private WebElement iv_nextDate;

    public void nextDateButtonInListing()
    {
        if (iv_nextDate.isDisplayed())
        {
            try {
                iv_nextDate.click();
                test.log(Status.PASS,"Click on Next Date in Listing");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to Click on Next date in Listing");
            }
        }
        else
        {
            test.log(Status.FAIL,"Failed to Identify on Next date in Listing");
        }
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
    private AndroidElement scanListingFirstName;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView")
    private AndroidElement scanListingPhoneNumber;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    private AndroidElement scanListingAppointmentType;
    //Validating This data at Listing
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.TextView[3]")
    private AndroidElement scanAppointmentStatus;
    //Validating
    String appointmentType = "Scan";
    String appointmentStatus = "Active";

    public void dataValidationScanListing()
    {
        test.log(Status.PASS,"-------Listing Scan Data Validation-----------");
        Assert.assertEquals(scanListingFirstName.getText(), patientNameScan);
        test.log(Status.INFO,scanListingFirstName.getText()+" ====="+patientNameScan);
        Assert.assertEquals(scanListingPhoneNumber.getText(), patientMobileNumberScan);
        test.log(Status.INFO,scanListingPhoneNumber.getText()+" ====="+patientMobileNumberScan);
        Assert.assertEquals(scanListingAppointmentType.getText(),appointmentType);
        test.log(Status.INFO,scanListingAppointmentType.getText()+" ====="+appointmentType);
        Assert.assertEquals(scanAppointmentStatus.getText(),appointmentStatus);
        test.log(Status.INFO,scanAppointmentStatus.getText()+" ====="+appointmentStatus);

    }
}

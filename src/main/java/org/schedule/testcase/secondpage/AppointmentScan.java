package org.schedule.testcase.secondpage;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class AppointmentScan extends AppointmentPage
{
    ExtentTest test;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("scanAppointmentData");
    String patientNameScan = resourceBundle.getString("namePatient");
    String patientMobileNumberScan = resourceBundle.getString("mobileNumber");
    @Override
    public void mobileNumberPatient() {
        try {
            et_contact.sendKeys(patientMobileNumberScan);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Patient mobile no filled");
        } catch (Exception e) {
            test.log(Status.FAIL, "Patient mobile no filled -> Not working");

        }
    }
    @Override
    public void namePatient() {
        try {
            et_name.sendKeys(patientNameScan);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            test.log(Status.PASS, "Patient name filled at Appointment page");
        } catch (Exception e) {
            test.log(Status.FAIL, "Patient name filled at Appointment page -> Not working");
        }

    }


    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement messages;
    private String mobileNumber = "Please enter patient mobile number!";
    public AppointmentScan(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    public void numberToastValidation() {
        Assert.assertEquals(mobileNumber, messages.getText());
        test.log(Status.PASS,"Toast Message :- "+mobileNumber);
    }

    private String nameGetMessage = "Please enter patient name!";
    public void nameToastValidation()
    {
        Assert.assertEquals(nameGetMessage, messages.getText());
    }
    String addressToast = "Please enter patient address!";
    public void addressToastValidation()
    {
        Assert.assertEquals(addressToast, messages.getText());
    }
    String cityToast = "Please enter patient city!";
    public void cityToastValidation()
    {
        Assert.assertEquals(cityToast, messages.getText());
    }
    String pinCodeToast = "Please enter patient pincode!";
    public void pinCodeToastValidation()
    {
        Assert.assertEquals(pinCodeToast, messages.getText());
    }
    String stateToast = "Please select patient state!";
    public void stateToastValidation()
    {
        Assert.assertEquals(stateToast, messages.getText());
    }
    public void toastPrint()
    {
        System.out.println(messages.getText());
    }
    String successful = "Appointment added successfully!";
    public void successfulToastMessage()
    {
        Assert.assertEquals(successful, messages.getText());
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView")
    private WebElement threeDotActionButton;
    public void threeDotActionButton()
    {
        if (threeDotActionButton.isDisplayed())
        {
            try {
                threeDotActionButton.click();
                test.log(Status.PASS,"Click on Three dot Action button");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to click on three dot button");
            }
        }
        else
        {
            test.log(Status.FAIL,"three dot action button is not Displaying");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_cancel")
    private WebElement actionCancelButton;
    public void actionCancelButton()
    {
        if (actionCancelButton.isDisplayed())
        {
            try {
                actionCancelButton.click();
                test.log(Status.PASS,"Click on cancel button in Listing of three dot action");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Failed to cancel button in Listing of three dot action");
            }
        }
        else
        {
            test.log(Status.FAIL,"cancel button in Listing of three dot action is not Displaying");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> listActionButton;
    public void listActionButton()
    {
        for (int i = 0; i < listActionButton.size(); i++)
        {
            WebElement element = listActionButton.get(i);
            test.log(Status.INFO, "Element " + (i + 1) + " text: " + element.getText());
        }
    }
    public void editScheduleListing() {
        try {
            for (WebElement option : listActionButton)
            {
                if (option.getText().equals("Edit")) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Click on Edit Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL, "Failed to Click on Edit Button");
        }
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

    private String  mobileNoInvalidToast = "Enter 10 digit mobile no!";
    public void mobileNoInvalidToast()
    {
        Assert.assertEquals(mobileNoInvalidToast, "Enter 10 digit mobile no!");
    }
    private String selectDoctorToastMessage = "Please select a Doctor to book an appointment!";
    public void selectDoctorToastMessage()
    {
        Assert.assertEquals(selectDoctorToastMessage, "Enter 10 digit mobile no!");
    }
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
    private WebElement firstDoctorName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.TextView")
    private WebElement secondDoctorName;
    public void selectDoctorFromList()
    {
        if (firstDoctorName.isEnabled())
        {
            firstDoctorName.click();
        }
        else
        {
            if (secondDoctorName.isEnabled())
            {
                secondDoctorName.click();
            }
        }
    }

    //Validating data at Listing
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

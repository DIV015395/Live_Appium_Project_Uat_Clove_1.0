package org.schedule.testcase.secondpage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.algorithm.FirstNameExtractor;
import org.openqa.selenium.WebElement;
import org.schedule.AppointmentPage;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class TestCase7 extends AppointmentPage {

    @AndroidFindBy(xpath = "//android.widget.Toast")
    public AndroidElement massages;
    String getmassage;

    public TestCase7(AndroidDriver driver) {
        super(driver);
    }

    public void toastMassageValidation() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(getmassage, "Appointment added successfully!");
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_duration")
    public AndroidElement ListingDuration;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_patientName")
    public AndroidElement ListingpatientName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_patientId")
    public AndroidElement Listingpatientid;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_contactNo")
    public AndroidElement Listingcontactno;


    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_clinic")
    public AndroidElement Listingclinic;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentType")
    public AndroidElement appointmentType;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("appointment");
    String patientName = resourceBundle.getString("namePatient");
    String patientMobileNumber = resourceBundle.getString("mobileNumber");
    ResourceBundle resourceBundle1 = ResourceBundle.getBundle("tempschedule");
    String doctorName = resourceBundle1.getString("doctorName");
    String clinicName = resourceBundle1.getString("clinicName");
    String doctorNames = resourceBundle1.getString("doctorName");
    String firstName = FirstNameExtractor.extractFirstName(doctorNames);

    public void validatePatientDetails() {
        Assert.assertEquals(ListingpatientName.getText(), patientName);
        Assert.assertEquals(Listingcontactno.getText(), patientMobileNumber);
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_doctor")
    public AndroidElement Listingdoctor;

    public void validateClinicName() {
        Assert.assertEquals(Listingclinic.getText(), clinicName);
    }

    public void validateAppointmentType() {
        Assert.assertEquals(appointmentType.getText(), "in-Clinic");
    }

    public void validateDoctorName() {
        Assert.assertEquals(Listingdoctor.getText(), firstName);
    }


    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_scheduleListing_actionButtons")
    public AndroidElement actionButtons;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofAction;


//    com.clove.clover.uat:id/value_appointment_notes_value
//    com.clove.clover.uat:id/iv_close_dialog

    public void printName() {
        System.out.println(ListingDuration.getText());
        System.out.println(appointmentType.getText());
        System.out.println(Listingclinic.getText());
        System.out.println(ListingpatientName.getText());
        System.out.println(Listingpatientid.getText());
        System.out.println(Listingcontactno.getText());
    }

    public void printListItems() {
        actionButtons.click();

        for (WebElement element : listofAction) {
            System.out.println(element.getText());
        }
    }


}

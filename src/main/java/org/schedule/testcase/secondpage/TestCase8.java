package org.schedule.testcase.secondpage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase8 extends BaseDriver {

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_duration")
    public AndroidElement ListingDuration;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_appointmentType")
    public AndroidElement appointmentType;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_clinic")
    public AndroidElement Listingclinic;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_patientName")
    public AndroidElement ListingpatientName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_patientId")
    public AndroidElement Listingpatientid;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_contactNo")
    public AndroidElement Listingcontactno;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_scheduleListing_doctor")
    public AndroidElement Listingdoctor;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_scheduleListing_actionButtons")
    public AndroidElement actionButtons;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofAction;

    public TestCase8(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    public void printName() {
        System.out.println(ListingDuration.getText());
        System.out.println(appointmentType.getText());
        System.out.println(Listingclinic.getText());
        System.out.println(ListingpatientName.getText());
        System.out.println(Listingpatientid.getText());
        System.out.println(Listingcontactno.getText());

        actionButtons.click();
    }

    public void printListItems() {
        for (WebElement element : listofAction) {
            System.out.println(element.getText());
        }
    }
}

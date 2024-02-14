package org.patientsearch;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class PatientSearch extends BaseDriver
{
    public ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    private WebElement ListClinic;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_home_patient_search")
    private WebElement home_patient_search;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<WebElement> clinicname;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_next")
    private WebElement tv_next;
    @AndroidFindBy(id = "com.clove.clover.uat:id/btn_explore_schedule")
    private WebElement btn_explore_schedule;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearchBy")
    public WebElement patientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofpatientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    public WebElement iv_search;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_searchQuery")
    public AndroidElement searchQuery;

    ResourceBundle resourceBundle = ResourceBundle.getBundle("patientsearch");
    //All for search listing verify patient search
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_contactNo")
    private AndroidElement listingContactNo;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientName")
    private AndroidElement listingPatientName;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientId")
    private AndroidElement listingPatientId;
    private final String patientId = resourceBundle.getString("patientId");
    private final String patientPhone = resourceBundle.getString("patientPhone");
    private final String patientName = resourceBundle.getString("patientName");

    public void setListingPatientId() {
        System.out.println(listingPatientId.getText());
        Assert.assertEquals(listingPatientId.getText(), patientId);
    }

    public void setListingContactNo() {
        System.out.println(listingContactNo.getText());
        Assert.assertEquals(listingContactNo.getText(), patientPhone);
    }

    public void setListingPatientName() {
        System.out.println(listingPatientName.getText());
        Assert.assertEquals(listingPatientName.getText(), patientName);
    }

    //ALl for patient listing verified


    public PatientSearch(AndroidDriver driver, ExtentTest test) {
        super(driver);
        this.test = test;
    }

    public void homePatientSearch()
    {
        if(home_patient_search.isDisplayed())
        {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            home_patient_search.click();
            test.log(Status.PASS, "Home Patient Action working fine.");
        }
        else
        {
            test.log(Status.FAIL,"Failed to Identify the Home Patient Search Android Element");
        }
    }

    public void explore() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        tv_next.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        btn_explore_schedule.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        test.log(Status.PASS, "Explore Action working fine.");
    }

    public void patientSearchByValue()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                searchQuery.sendKeys("1111");
                test.log(Status.PASS, "Input Field fill successfully ");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL, "Input Field fill = Failed ");
            }
        }
        else
        {
            test.log(Status.FAIL,"Failed to Identify the Locator SearchQuery");
        }
    }
    public void selectClinic() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        ListClinic.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        // Assuming you want to select the option with text "Bodakdev"
        String desiredOptionText = "Developer West";

        for (WebElement option : clinicname) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
        test.log(Status.PASS, "Clinic selected from clinic list.");
    }


    public void patientSearchByOption()
    {
        String desiredOptionText = "Mobile";
        if (patientSearchBy.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                patientSearchBy.click();
                test.log(Status.PASS, "Dropdown  'List of Patient Search by' is Working Fine");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL,"Dropdown  'List of Patient Search by' is not Working");
            }
        }
        else
        {
            test.log(Status.FAIL,"Failed to Identify the Locator Patient SearchBy");
        }
        // Assuming you want to select the option with text "Bodakdev"
        for (WebElement option : listofpatientSearchBy)
        {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                test.log(Status.PASS, "Dropdown selected  = " + desiredOptionText);
                break;
            }
        }

    }
    public void searchButton()
    {
        if (iv_search.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                iv_search.click();
                test.log(Status.PASS, "Search Button is Working Fine.");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL, "Search Button is Not Working");
            }
        }
        else
        {
            test.log(Status.FAIL, "Failed to Identify the Search Button");
        }

    }
}

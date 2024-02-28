package org.patientsearch;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.NewBaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class NewPatientSeach extends NewBaseDriver {

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
    private final String patientEmail = resourceBundle.getString("patientEmail");

    public NewPatientSeach(AndroidDriver<AndroidElement> driver, ExtentTest test)
    {
        super(driver, test);
        this.test = test;
    }

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

    public void patientSearchByValuePatientPhone()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                setDriverWaitTenSecond(driver);
                searchQuery.sendKeys(patientPhone);
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

    public void patientSearchByValuePatientId()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                setDriverWaitTenSecond(driver);
                searchQuery.sendKeys(patientId);
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
    public void patientSearchByValueEmail()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                setDriverWaitTenSecond(driver);
                searchQuery.sendKeys(patientEmail);
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

    public void patientSearchByValueName()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                setDriverWaitTenSecond(driver);
                searchQuery.sendKeys(patientName);
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
    public void clearPatientSearchByValue()
    {
        if (searchQuery.isDisplayed())
        {
            try {
                driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
                searchQuery.clear();
                test.log(Status.PASS, "Clear data from Patient search Value");
            }
            catch (Exception e)
            {
                test.log(Status.FAIL, "Failed to Clear data from Patient search Value");
            }
        }
        else
        {
            test.log(Status.FAIL,"Failed to Identify the Locator Patient search Value");
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


    public void patientSearchByOptionMobile()
    {
        String desiredOptionText = "Mobile";

        if (patientSearchBy.isDisplayed())
        {
            try {
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

    public void patientSearchByOptionEmail()
    {
        String desiredOptionText = "Email";

        if (patientSearchBy.isDisplayed())
        {
            try {
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
    public void patientSearchByOptionName()
    {
        String desiredOptionText = "Name";

        if (patientSearchBy.isDisplayed())
        {
            try {
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

    public void patientSearchByOptionPatientId()
    {
        String desiredOptionText = "Patient Id";

        if (patientSearchBy.isDisplayed())
        {
            try {
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
    public void customSoftAssert(String Actual, String Expected)
    {
        if(Actual.equals(Expected))
        {
            test.log(Status.PASS,"Actual: "+ Actual+ " : matches Expected: "+ Expected);
        }
        else
        {
            test.log(Status.FAIL,"Actual: "+ Actual+ " : does not match Expected: "+ Expected);
        }
    }

    public void customSoftAssertScreenTitle(String Actual, String Expected)
    {
        if(Actual.equals(Expected))
        {
            test.log(Status.PASS,"Actual Screen Title : "+ Actual+ " : matches Expected Screen Title: "+ Expected);
        }
        else
        {
            test.log(Status.FAIL,"Actual Screen Title: "+ Actual+ " : does not match Expected Screen Title: "+ Expected);
        }
    }
    ////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientName")
    private WebElement getPatientNameFromList;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_contactNo")
    private WebElement getPatientContactNumberFromList;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_patientId")
    private WebElement getPatientIdFromList;
     @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearch_clinicName")
     private WebElement getPatientClinicNameFromList;

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void patientNameFromListValidation()
    {
        customSoftAssert(getPatientNameFromList.getText(),patientName);
    }
    public void patientContactNumberFromListValidation()
    {
        customSoftAssert(getPatientContactNumberFromList.getText(), patientPhone);
    }
    public void patientIdFromListValidation()
    {
        customSoftAssert(getPatientIdFromList.getText(),patientId);
    }
    public void patientClinicNameFromListValidation()
    {
        customSoftAssert(getPatientClinicNameFromList.getText(), "Developer West");
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_patientRow_action")
    public WebElement threeDotButton;
    //Add Files
    //Add Appointment
    //View Files
    //Work Done
    //Cancel
    public void threeDotButton()
    {
        try
        {
            threeDotButton.click();
            test.log(Status.PASS,"Click on three dot Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on three dot action button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listOfAction;
    public void selectAddFile()
    {
        String addFiles = "Add Files";
        for (WebElement option : listOfAction) {
            if (option.getText().equals(addFiles)) {
                option.click();
                test.log(Status.PASS,"Click on Add files ");
                break;
            }
        }
    }
    ///////////////////////////////////////
    //////////////////////////Add file all page

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    private WebElement oralImages;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    private WebElement pastDoc;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    private WebElement xRays;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
    private WebElement profile;
    public void oralImages()
    {
        try {
            oralImages.click();
            test.log(Status.PASS,"Click on oral images");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed click on oral images");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/save_text")
    private WebElement saveButton;
    public void saveButton()
    {
        try {
            saveButton.click();
            test.log(Status.PASS,"Click on Save Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to click on save button");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_fileTitle")
    private WebElement fileTitleField;
    public void fileTitleField()
    {
        try {
            fileTitleField.sendKeys("File title");
            test.log(Status.PASS,"send text in  file title");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to send text in  file title");
        }
    }
    // Toast message element
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastMessage;
    String titleToast = "Please enter file title!";
    String uploadToast = "Please select file for upload!";

    public void titleToastMessageValidation()
    {
        customSoftAssert(toastMessage.getText(),titleToast);
        setDriverWaitTillThreeSecond();
    }
    public void uploadToastMessageValidation()
    {
        customSoftAssert(toastMessage.getText(),uploadToast);
        setDriverWaitTillThreeSecond();
    }
    public void printToastMessage()
    {
        System.out.println(toastMessage.getText());
    }
    //
    //all Toast Message //

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private WebElement permissionButton;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private WebElement permissionAllowButton;

    public void allowPermission()
    {
        try {
            setDriverWaitTenSecond(driver);
            permissionButton.click();
            setDriverWaitTenSecond(driver);
            permissionAllowButton.click();
            setDriverWaitTenSecond(driver);
            permissionAllowButton.click();
            setDriverWaitTenSecond(driver);
            test.log(Status.PASS,"All Permission given for upload files");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Give All Permission given for upload files");
        }

    }

    //
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_imagePickerOption_camera")
    private AndroidElement cameraPicker;
    public void setCameraPicker()
    {
        try{
            cameraPicker.click();
            test.log(Status.PASS,"Click on Camera ");
        }
        catch (Exception e)
        {
            test.log(Status.PASS,"Failed to Click on Camera ");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_imagePickerOption_gallery")
    private AndroidElement galleryPicker;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_imagePickerOption_file")
    private AndroidElement filePicker;


    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_camera")
    private AndroidElement Camera;

    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
    private AndroidElement shutterButton;

    @AndroidFindBy(id = "com.android.camera2:id/done_button")
    private AndroidElement doneCapture;

    public void setCamera() {

        try {
            setDriverWaitTenSecond(driver);
            Camera.click();
            test.log(Status.PASS, "Click on Camera button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Camera button.  Not Working");
        }
    }
    public void setShutterButton() {


        try {
            setDriverWaitTenSecond(driver);
            shutterButton.click();
            test.log(Status.PASS, "Click on Camera Capture button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Camera Capture button.  Not Working");
        }
    }
    public void setDoneCapture() {

        try {
            setDriverWaitTenSecond(driver);
            doneCapture.click();
            test.log(Status.PASS, "Click on Capture Right button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Capture Right button.  Not Working");
        }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_attachFiles")
    private AndroidElement attachFiles;
    public void setAttachFiles() {

        try {
            setDriverWaitTenSecond(driver);
            attachFiles.click();
            test.log(Status.PASS, "Click on Attach file button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Attach file button.  Not Working");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_attachedFile_title")
    private AndroidElement attachFileTitle;
    public void attachFileTitleValidation()
    {
       if (attachFileTitle.getText()!=null)
       {
           test.log(Status.PASS,"File Path name : "+attachFileTitle.getText());
       }
       else
       {
           test.log(Status.FAIL,"Failed to show the file path at screen after capture");
       }
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_attachedFile_cancel")
    private AndroidElement attachFilesCancel;
    public void attachFilesCancel()
    {
        try {
            attachFilesCancel.click();
            test.log(Status.PASS,"Click on AttachFile Cancel Button");
        }
        catch (Exception e)
        {
            test.log(Status.FAIL,"Failed to Click on AttachFile Cancel Button");
        }
    }




}

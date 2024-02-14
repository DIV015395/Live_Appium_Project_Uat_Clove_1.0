package org.expenses;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.NewBaseDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
public class NewExpenseClass extends NewBaseDriver
{
    //Soft custom assert
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
    //Soft custom assert
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_home_expense")
    public AndroidElement expense;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    public AndroidElement cliniclist;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> clinics;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_next")
    public AndroidElement nextbutton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_next")
    public AndroidElement explore;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_next")
    public AndroidElement next;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_noRecords")
    private AndroidElement noRecords;

    //three dot action button option
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
    private AndroidElement copy;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
    private AndroidElement edit;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
    private AndroidElement view;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
    private AndroidElement delete;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button")
    private AndroidElement cancel;
    //three dot action button option

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_action_dots")
    private List<AndroidElement> actionDots;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("addexpensedetails");
    String expenseAddName = resourceBundle.getString("name");
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemdetail")
    private List<WebElement> itemDetail;

    public NewExpenseClass(AndroidDriver driver, ExtentTest test)
    {
        super(driver,test);
        this.test = test;
    }
    public void expensesClick()
    {
        try {
            setDriverWaitTenSecond(driver);
            expense.click();
            test.log(Status.PASS, "Click on Expense menu button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Expense button. Not Working");
        }
    }
    public void setClinic()
    {
        try {
            setDriverWaitTenSecond(driver);
            cliniclist.click();
            setDriverWaitTenSecond(driver);
            String desiredOptionText = "Developer West";
            for (WebElement option : clinics) {
                if (option.getText().equals(desiredOptionText)) {
                    option.click();
                    break;
                }
            }
            test.log(Status.PASS, "Click on Clinic selected from dropdown. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Clinic selected from dropdown. Not Working");
        }

    }
    public void nextButton() {
        try {
            setDriverWaitTenSecond(driver);
            nextbutton.click();
            setDriverWaitTenSecond(driver);
            explore.click();
            setDriverWaitTenSecond(driver);
            next.click();
            setDriverWaitTenSecond(driver);
            explore.click();
            setDriverWaitTenSecond(driver);
            test.log(Status.PASS, "Click on Explore button. Working");

        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Explore button. Not Working");
        }
    }


    public void setNoRecords() {
        try {
            setDriverWaitTenSecond(driver);
            Assert.assertEquals(noRecords.getText(), "No records found!");
            setDriverWaitTenSecond(driver);
            test.log(Status.PASS, "Check No Records text display. Working");
        } catch (Exception e) {
            setDriverWaitTenSecond(driver);
            test.log(Status.FAIL, "Check No Records text display. Not Working");
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        }
    }

    public void setListCount() {
        try {
            if (actionDots.size() == 0) {
                test.log(Status.PASS, noRecords.getText());
            } else {
                test.log(Status.PASS, "There is no of Items = " + actionDots.size());
            }
        } catch (Exception e) {
            test.log(Status.FAIL, "Items Listing Not working");
        }
    }

    public void setView() {
        try
        {
            view.click();
            test.log(Status.PASS, "Click on view button : working ");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on view button : not working ");
        }
    }

    public void setCancel()
    {
        try {
            cancel.click();
            test.log(Status.PASS, "click on cancel button : working");
        } catch (Exception e) {
            test.log(Status.FAIL, "click on cancel button : not working");
        }
    }

    public void setCopy() {
        try {
            copy.click();
            test.log(Status.PASS, "click on copy button :  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "click on copy button : Not working");
        }
    }
    public void setEdit() {

        try {
            edit.click();
            test.log(Status.PASS, "click on Edit button :  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "click on Edit button : Not working");
        }
    }
    public void setDelete() {
        try {
            delete.click();
            test.log(Status.PASS, "click on delete button :  working");
        } catch (Exception e) {
            test.log(Status.FAIL, "click on delete button : Not working");
        }

    }




    @AndroidFindBy(id = "com.clove.clover.uat:id/add_expense")
    private AndroidElement addexpense;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_calender")
    private AndroidElement calenderButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_cancel")
    private AndroidElement calenderCancel;

    @AndroidFindBy(id = "com.clove.clover.uat:id/mdtp_ok")
    private AndroidElement calenderOk;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_name")
    private AndroidElement name;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_quantity")
    private AndroidElement quantity;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_item_amount")
    private AndroidElement amount;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_notesAddEdit")
    private AndroidElement remarksButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/et_text")
    private AndroidElement remarksTextSend;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDone")
    private AndroidElement remarkDone;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_actionDelete")
    private AndroidElement remarksDelete;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    private AndroidElement remarksBackArrow;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_attachFiles")
    private AndroidElement attachFiles;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    private AndroidElement permissionOne;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement allowFirstTime;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private AndroidElement allowSecondtime;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_camera")
    private AndroidElement Camera;

    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
    private AndroidElement shutterButton;

    @AndroidFindBy(id = "com.android.camera2:id/done_button")
    private AndroidElement doneCapture;
    @AndroidFindBy(id = "com.clove.clover.uat:id/rl_actionSave")
    private AndroidElement actionSave;

//Expense Add
    ResourceBundle resourceBundles = ResourceBundle.getBundle("addexpensedetails");
    private final String expenseAddNames = resourceBundles.getString("name");
    private final String expenseAddAmount = resourceBundles.getString("Amount");
    private final String expenseAddQuantity = resourceBundles.getString("Quantity");
    private final String expenseEditAddName = resourceBundles.getString("editname");
    private final String expenseEditAddAmount = resourceBundles.getString("editAmount");
    private final String expenseEditAddQuantity = resourceBundles.getString("editQuantity");
    public void setAddexpense()
    {
        try {
            setDriverWaitTenSecond(driver);
            addexpense.click();
            test.log(Status.PASS, "Click on Expense button. Working");

        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Expense button. Not Working");
        }

    }
    public void setCalenderButton()
    {
        try {
            setDriverWaitTenSecond(driver);
            calenderButton.click();
            test.log(Status.PASS, "Click on Calender button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender button. Not Working");
        }

    }

    public void setCalenderOk() {
        try {

            setDriverWaitTenSecond(driver);
            calenderOk.click();
            test.log(Status.PASS, "Click on Calender ok button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender ok button. Not Working");
        }
    }

    public void setCalenderCancel() {
        try {

            setDriverWaitTenSecond(driver);
            calenderCancel.click();
            test.log(Status.PASS, "Click on Calender Cancel button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Calender Cancel button. Not Working");
        }
    }

    public void setName() {
        try {
            setDriverWaitTenSecond(driver);
            name.sendKeys(expenseAddNames);
            test.log(Status.PASS, "Click on Name send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Name send in Text field. Not Working");
        }

    }

    public void setEditName() {
        try {
            setDriverWaitTenSecond(driver);
            name.sendKeys(expenseEditAddName);
            test.log(Status.PASS, "Click on Name send in Text field in Edit . Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Name send in Text field in Edit. Not Working");
        }

    }

    public void setQuantity() {


        try {
            setDriverWaitTenSecond(driver);
            quantity.sendKeys(expenseAddQuantity);
            test.log(Status.PASS, "Click on Quantity send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Quantity send in Text field. Not Working");
        }

    }


    public void setEditQuantity() {


        try {
            setDriverWaitTenSecond(driver);
            quantity.sendKeys(expenseEditAddQuantity);
            test.log(Status.PASS, "Click on Quantity send in Text field in Edit. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Quantity send in Text field in Edit. Not Working");
        }

    }

    public void setAmount() {

        try {
            setDriverWaitTenSecond(driver);
            amount.sendKeys(expenseAddAmount);
            test.log(Status.PASS, "Click on Amount send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Amount send in Text field. Not Working");
        }
    }


    public void setEditAmount() {

        try {
            setDriverWaitTenSecond(driver);
            amount.sendKeys(expenseEditAddAmount);
            test.log(Status.PASS, "Click on Amount send in Text field in Edit. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Amount send in Text field in Edit. Not Working");
        }
    }

    public void setRemarksButton() {

        try {
            setDriverWaitTenSecond(driver);
            remarksButton.click();
            test.log(Status.PASS, "Click on Remarks button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks button. Not Working");
        }


    }

    public void setRemarksTextSend() {

        try {
            setDriverWaitTenSecond(driver);
            remarksTextSend.sendKeys("Expense Added");
            test.log(Status.PASS, "Click on Remarks send in Text field. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks send in Text field. Not Working");
        }
    }

    public void setRemarkDone() {


        try {
            setDriverWaitTenSecond(driver);
            remarkDone.click();
            test.log(Status.PASS, "Click on Remarks done button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks done button.  Not Working");
        }
    }

    public void setRemarksDelete() {


        try {
            setDriverWaitTenSecond(driver);
            remarksDelete.click();
            test.log(Status.PASS, "Click on Remarks Delete button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks Delete button.  Not Working");
        }
    }

    public void setRemarksBackArrow() {

        try {
            setDriverWaitTenSecond(driver);
            remarksBackArrow.click();
            test.log(Status.PASS, "Click on Remarks Back Arrow button. Working");
        }

        catch (Exception e) {
            test.log(Status.FAIL, "Click on Remarks Back Arrow button.  Not Working");
        }
    }


    public void setPermissionOne() {


        try {
            setDriverWaitTenSecond(driver);
            permissionOne.click();
            test.log(Status.PASS, "Click on Permission button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Permission button.  Not Working");
        }
    }

    public void setAllowFirstTime() {


        try {
            setDriverWaitTenSecond(driver);
            allowFirstTime.click();
            test.log(Status.PASS, "Click on Allow button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Allow button.  Not Working");
        }
    }

    public void setAllowSecondtime() {


        try {
            setDriverWaitTenSecond(driver);
            allowSecondtime.click();
            test.log(Status.PASS, "Click on Allow Second button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Allow Second button.  Not Working");
        }
    }

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
    public void setAttachFiles() {

        try {
            setDriverWaitTenSecond(driver);
            attachFiles.click();
            test.log(Status.PASS, "Click on Attach file button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Attach file button.  Not Working");
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

    public void setActionSave() {

        try {
            setDriverWaitTenSecond(driver);
            actionSave.click();
            test.log(Status.PASS, "Click on Action Save button. Working");
        } catch (Exception e) {
            test.log(Status.FAIL, "Click on Action Save button.  Not Working");
        }
    }
//Expense Add

    //Toast Message
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement toastMessage;
    //
    //all Toast Message //
    String itemToastMessage = "Please enter Item!";
    String amountToastMessage = "Please enter Amount!";
    String quantityToastMessage = "Please enter Quantity!";
    String imageToastMessage = "Please upload expense receipt before saving!";
    public void printToastMessage()
    {
        System.out.println(toastMessage.getText());
    }
    public void itemToastMessage()
    {
        customSoftAssert(toastMessage.getText(),itemToastMessage);
        setDriverWaitTillThreeSecond();
    }
    public void amountToastMessage()
    {
        customSoftAssert(toastMessage.getText(),amountToastMessage);
        setDriverWaitTillThreeSecond();
    }
    public void quantityToastMessage()
    {
        customSoftAssert(toastMessage.getText(),quantityToastMessage);
        setDriverWaitTillThreeSecond();
    }
    public void imageToastMessage()
    {
        customSoftAssert(toastMessage.getText(),imageToastMessage);
        setDriverWaitTillThreeSecond();
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_notes")
    private WebElement notes;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    private AndroidElement expenseScreenTitle;
    public void getAddedNotesValidation()
    {
            customSoftAssert(notes.getText(), "Expense Added");
        setDriverWaitTillOneSecond();

    }
    public void getNotAddedNotes()
    {
        customSoftAssert(notes.getText(), "add remarks");
        setDriverWaitTillOneSecond();
    }
    public void addExpenseScreenTitle()
    {
        customSoftAssertScreenTitle(expenseScreenTitle.getText(),"Add Expense");
        setDriverWaitTillThreeSecond();
    }
}

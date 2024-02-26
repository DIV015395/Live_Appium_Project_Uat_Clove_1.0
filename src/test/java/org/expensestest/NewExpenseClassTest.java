package org.expensestest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.applogin.AppLoginNew;
import org.desiredcapabilities.NewBaseDriver;
import org.expenses.ExpensesListing;
import org.expenses.NewExpenseClass;
import org.extentreport.ExtentManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewExpenseClassTest {

    public AppiumDriver driver;
    public ExtentReports extent;
    public ExtentTest test;
    @BeforeClass
    public void driverLaunch()
    {
        extent = ExtentManager.getInstance();
        test = extent.createTest("Test Case 1", "Description of Test Case 1");
        NewBaseDriver newBaseDriver = new NewBaseDriver((AndroidDriver) driver, test);
        driver = newBaseDriver.driverLaunch();
    }
    @Test(priority = 1)
    public void loginApp() {
        AppLoginNew appLoginNew = new AppLoginNew((AndroidDriver) driver,test);
        appLoginNew.loginPositiveScenario();
    }
    @Test(priority = 2)
    public void expenseNegativeScenario()
    {
        NewExpenseClass newExpenseClass = new NewExpenseClass((AndroidDriver) driver,test);
        //One Scenario Toast Message T
        newExpenseClass.expensesClick();
        newExpenseClass.nextButton();
        //
        newExpenseClass.setAddexpense();
        //Redirect to expense add screen;
        newExpenseClass.setActionSave();
        newExpenseClass.itemToastMessage();
//        //
        newExpenseClass.setName();
        newExpenseClass.setActionSave();
        newExpenseClass.quantityToastMessage();
        //
        newExpenseClass.setQuantity();
        newExpenseClass.setActionSave();
        newExpenseClass.amountToastMessage();
        //
        newExpenseClass.setAmount();
        newExpenseClass.setActionSave();
        newExpenseClass.imageToastMessage();
        //Notes Validation

        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksTextSend();
        newExpenseClass.setRemarkDone();
        newExpenseClass.getAddedNotesValidation();
        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksBackArrow();
        newExpenseClass.addExpenseScreenTitle();
        //
        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksTextSend();
        newExpenseClass.setRemarkDone();
        newExpenseClass.getNotes();
        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksBackArrow();
        newExpenseClass.getNotes();
        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksDelete();
        newExpenseClass.getNotes();
        newExpenseClass.setRemarksButton();
        newExpenseClass.setRemarksBackArrow();
        //
        //Camera click Functionality
        newExpenseClass.setAttachFiles();
        newExpenseClass.setPermissionOne();
        newExpenseClass.setAllowFirstTime();
        newExpenseClass.setAllowSecondtime();
        newExpenseClass.setCamera();
        newExpenseClass.setShutterButton();
        newExpenseClass.setDoneCapture();
        newExpenseClass.attachFileTitleValidation();

        //Cancel the images
        newExpenseClass.attachFilesCancel();
        newExpenseClass.setActionSave();
        newExpenseClass.expenseAddedSuccessfulToast();
        //click on save button

        ExpensesListing expensesListing = new ExpensesListing((AndroidDriver) driver,test);
        expensesListing.setActionDots();
        expensesListing.setCopy();
        newExpenseClass.getTextName();
        newExpenseClass.getTextQuantity();
        newExpenseClass.getTextAmount();

        newExpenseClass.setRemarksBackArrow();

        expensesListing.setActionDots();
        expensesListing.setView();
        newExpenseClass.getTextName();
        newExpenseClass.getTextQuantity();
        newExpenseClass.getTextAmount();

        newExpenseClass.setRemarksBackArrow();

        expensesListing.setActionDots();
        expensesListing.setEdit();
        newExpenseClass.clearName();
        newExpenseClass.clearAmount();
        newExpenseClass.clearQuantity();









//        newExpenseClass.setName();
//        newExpenseClass.setQuantity();
//        newExpenseClass.setAmount();
//        newExpenseClass.setAttachFiles();
//        newExpenseClass.setPermissionOne();
//        newExpenseClass.setAllowFirstTime();
//        newExpenseClass.setAllowSecondtime();
//        newExpenseClass.setCamera();
//        newExpenseClass.setShutterButton();
//        newExpenseClass.setDoneCapture();
//        newExpenseClass.setActionSave();
//        newExpenseClass.toastMessage();
//        newExpenseClass.toastMassageValidation();
//        newExpenseClass.scrollTo();
//        newExpenseClass.printDetailsForMatchingItems();
//        newExpenseClass.clickActionButtonForItemText();
//        newExpenseClass.setView();
//        newExpenseClass.setRemarksBackArrow();
//        newExpenseClass.clickActionButtonForItemText();
//        newExpenseClass.setEdit();
//        newExpenseClass.setEditName();
//        newExpenseClass.setEditAmount();
//        newExpenseClass.setEditQuantity();


    }
    @AfterClass
    public void driverClose() {
//        driver.quit();
        extent.flush();
    }
}

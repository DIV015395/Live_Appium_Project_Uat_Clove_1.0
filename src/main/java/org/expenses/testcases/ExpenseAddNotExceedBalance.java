package org.expenses.testcases;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.expenses.ExpensesAdd;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class ExpenseAddNotExceedBalance extends ExpensesAdd {
    ExtentTest test;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("ExpenseNotExceedAmountClinic");
    private final String desiredOptionText = resourceBundle.getString("clinic");
    private final String actualOutput = "Expense already added! Duplicate request has been ignored.";
    private final String actualSecondOutput = "Expense details added Successfully!";
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;

    public ExpenseAddNotExceedBalance(AndroidDriver driver, ExtentTest test) {

        super(driver, test);
        this.test = test;
    }

    @Override
    public void setClinic() {

        try {
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            cliniclist.click();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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

    public void toastMessage() {

        try {
            getmassage = massages.getText();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            System.out.println(getmassage);
            test.log(Status.PASS, "Toast Message => " + getmassage);
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed to Display the Toast message in Report");
        }
    }

    public void toastMassageValidation() {
        try {
            if (getmassage.equals(actualOutput)) {
                Assert.assertEquals(getmassage, actualOutput);
            } else {
                Assert.assertEquals(getmassage, actualSecondOutput);
            }
            test.log(Status.PASS, "Toast message is Validated");
        } catch (Exception e) {
            test.log(Status.FAIL, "Failed toast message Validation");

        }
    }

    ResourceBundle resourceBundles = ResourceBundle.getBundle("addexpensedetails");
    String expenseAddName = resourceBundles.getString("name");
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_action_dots")
    private List<AndroidElement> actionDots;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemdetail")
    private List<WebElement> itemDetail;

    public void scrollTo() {
        boolean elementFound = false;
        while (!elementFound) {
            driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + expenseAddName + "\"));"));
            for (WebElement element : itemDetail) {
                if (element.getText().equals("ABCDEFG")) {
                    if (element.isDisplayed()) {
                        element.click();
                        elementFound = true;
                        System.out.println("mil gya wo items");
                        break;
                    }
                }
            }
        }
    }

    public void clickActionButtonForItemText() {
        for (int i = 0; i < itemDetail.size(); i++) {
            if (itemDetail.get(i).getText().equals(expenseAddName)) {
                actionDots.get(i).click();
                break;
            }
        }
    }
}

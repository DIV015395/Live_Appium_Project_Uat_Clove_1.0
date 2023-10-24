package org.expenses.testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.expenses.ExpensesAdd;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

public class ExpenseAddExceedBalance extends ExpensesAdd {
    ResourceBundle resourceBundle = ResourceBundle.getBundle("ExpenseExceedAmountClinic");
    private final String desiredOptionText = resourceBundle.getString("clinic");
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;
    public ExpenseAddExceedBalance(AndroidDriver driver) {
        super(driver);
    }

    @Override
    public void setClinic() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        cliniclist.click();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        for (WebElement option : clinics) {
            if (option.getText().equals(desiredOptionText)) {
                option.click();
                break;
            }
        }
    }

    public void toastMessage() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);

    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Expense for clinic can not exceed balance / limit available!");
    }

}

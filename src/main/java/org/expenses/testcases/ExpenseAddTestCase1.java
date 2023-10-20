package org.expenses.testcases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.expenses.ExpensesAdd;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class ExpenseAddTestCase1 extends ExpensesAdd {
    @AndroidFindBy(xpath = "//android.widget.Toast")
    private AndroidElement massages;
    private String getmassage;

    public ExpenseAddTestCase1(AndroidDriver driver) {
        super(driver);
    }

    public void toastMessage() {
        getmassage = massages.getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(getmassage);

    }

    public void toastMassageValidation() {
        Assert.assertEquals(getmassage, "Please enter Item!");
    }


}

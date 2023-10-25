package org.expenses;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class ExpenseFilter extends Expenses {
    ExtentTest test;
    String searchButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/search_expense")
    private AndroidElement searchExpenseButton;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    private AndroidElement ivSearchButton;

    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_filter_expense")
    private AndroidElement ivFilterExpense;

    public ExpenseFilter(AndroidDriver driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }

    public void setSearchExpenseButton() {
        try {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            searchExpenseButton.click();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.PASS, "Click on search Expense button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on search Expense button. Not Working");
        }
    }

    public void setIvSearchButton() {
        try {
            ivSearchButton.click();
            test.log(Status.PASS, "Click on search Expense filter button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on search Expense filter button. Not Working");
        }
        searchButton = ivSearchButton.getText();
    }

    public void setIvFilterExpense() {
        try {
            ivFilterExpense.click();
            test.log(Status.PASS, "Click on Expense filter button. Working");
        } catch (Exception e) {
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            test.log(Status.FAIL, "Click on Expense filter button. Not Working");
        }
    }

    public void setIvSearchButtonDisabled() {
        System.out.println(searchButton);
        JButton button = new JButton(searchButton);
        boolean isButtonEnabled = button.isEnabled();
        System.out.println(isButtonEnabled);
    }

    public void setIvSearchButtonDisabled1() {
        boolean isDisabled = !ivSearchButton.isEnabled();
        if (isDisabled) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }


}

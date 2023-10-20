package org.expenses;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ExpenseAddInfo extends Expenses {
    public ExpenseAddInfo(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    public AndroidElement screenTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_back_arrow")
    public AndroidElement backArrow;


    @AndroidFindBy(id = "com.clove.clover.uat:id/add_info")
    public AndroidElement addInfo;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_expenseLimit")
    public AndroidElement expenseLimit;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_expenseLimitValue")
    public AndroidElement expenseLimitAmount;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_mtdExpense")
    public AndroidElement mtdExpense;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_mtdExpenseValue")
    public AndroidElement mtdExpenseValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_amountAvailable")
    public AndroidElement amountAvailable;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_amountAvailableValue")
    public AndroidElement amountAvailableValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_rejectedBalance")
    public AndroidElement rejectBalance;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_rejectedBalanceValue")
    public AndroidElement rejectedBalanceValue;


    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_approvedBalance")
    public AndroidElement approveBalance;


    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_approvedBalanceValue")
    public AndroidElement approvedBalanceValue;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_pendingApproval")
    public AndroidElement pendingApproval;

    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_pendingApprovalValue")
    public AndroidElement pendingApprovalValue;


}

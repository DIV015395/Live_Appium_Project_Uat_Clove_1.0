//package orguivalidation.expense;
//
//import com.aventstack.extentreports.ExtentTest;
//import io.appium.java_client.android.AndroidElement;
//import io.appium.java_client.pagefactory.AndroidFindBy;
//import org.algorithm.DateManipulator;
//import org.testng.Assert;
//
//public class ExpenseAddScreen {
//    ExtentTest  test;
//
//    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
//    private AndroidElement expenseAddScreenTitle;
//    public void expenseScreenTitle()
//    {
//        if (expenseAddScreenTitle.isDisplayed())
//        {
//            if (expenseAddScreenTitle.getText() != null)
//            {
//                Assert.assertEquals(expenseAddScreenTitle.getText(), ExpenseAddText.expenseAddScreenTitle());
//                test.info(expenseAddScreenTitle.getText());
//                test.pass("Assert Method Verified");
//            }
//            else
//            {
//                test.fail("Failed Login Title Text Validation");
//            }
//        }
//        else
//        {
//            test.fail("Failed to Identify the Android Element!");
//        }
//    }
//    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_date")
//    private AndroidElement expenseAddDate;
//    public void expenseAddDate()
//    {
//
//        if (expenseAddDate.isDisplayed())
//        {
//            if (expenseAddDate.getText() != null)
//            {
//                Assert.assertEquals(expenseAddDate.getText(), DateManipulator.currentDate());
//                test.info(expenseAddDate.getText());
//                test.pass("Assert Method Verified");
//            }
//            else
//            {
//                test.fail("Failed Login Title Text Validation");
//            }
//        }
//        else
//        {
//            test.fail("Failed to Identify the Android Element!");
//        }
//    }
//    //
//    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_calender")
//    private AndroidElement expenseAddCalenderIcon;
//    //
//    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_info")
//    private AndroidElement expenseAddInfo;
//    public void expenseAddInfo()
//    {
//        if (expenseAddInfo.isDisplayed())
//        {
//            if (expenseAddInfo.getText() != null)
//            {
//                Assert.assertEquals(expenseAddInfo.getText(), ExpenseAddText.expenseAddInfo());
//                test.info(expenseAddInfo.getText());
//                test.pass("Assert Method Verified");
//            }
//            else
//            {
//                test.fail("Failed Login Title Text Validation");
//            }
//        }
//        else
//        {
//            test.fail("Failed to Identify the Android Element!");
//        }
//    }
//
//    }
//
//    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_item_name")
//    private AndroidElement expenseAddItemName;
//    public void expenseAddItemName()
//    {
//        if (expenseAddItemName.isDisplayed())
//        {
//            if (expenseAddItemName.getText() != null)
//            {
//                Assert.assertEquals(expenseAddItemName.getText(), ExpenseAddText.expenseAddItemName());
//                test.info(expenseAddItemName.getText());
//                test.pass("Assert Method Verified");
//            }
//            else
//            {
//                test.fail("Failed Login Title Text Validation");
//            }
//        }
//        else
//        {
//            test.fail("Failed to Identify the Android Element!");
//        }
//    }
//
//}

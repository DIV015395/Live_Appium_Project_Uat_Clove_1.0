package orguivalidation.expense;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.desiredcapabilities.BaseDriver;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class ExpenseScreen extends BaseDriver {
    ExtentTest test;
    public ExpenseScreen(AndroidDriver driver,ExtentTest test)
    {
        super(driver);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_screen_title")
    private AndroidElement expenseScreenTitle;
    public void expenseScreenTitle()
    {
        if (expenseScreenTitle.isDisplayed())
        {
                if (expenseScreenTitle.getText() != null)
                {
                    Assert.assertEquals(expenseScreenTitle.getText(), ExpenseText.expenseScreenTitle());
                    test.info(expenseScreenTitle.getText());
                    test.pass("Assert Method Verified");
                }
                else
                {
                    test.fail("Failed Login Title Text Validation");
                }
        }
        else
        {
            test.fail("Failed to Identify the Android Element!");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_expense")
    private AndroidElement expenseAddExpenseIcon;
    public void expenseAddExpenseIcon()
    {
        if (expenseAddExpenseIcon.isDisplayed())
        {
            try {
                File screenshotFile = expenseAddExpenseIcon.getScreenshotAs(OutputType.FILE);
                BufferedImage image = ImageIO.read(screenshotFile);
                File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\expenseAddExpenseIcon.png");
                ImageIO.write(image, "png", outputFile);
                test.pass("Extract Expense Add Expense Icon", MediaEntityBuilder.createScreenCaptureFromPath("expenseAddExpenseIcon.png").build());
            }
            catch (IOException e)
            {
                e.printStackTrace();
                test.fail("Failed to extract Expense Add Expense Icon" + e.getMessage());
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element!");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/add_info")
    private AndroidElement expenseAddInfoIcon;
    public void expenseAddInfoIcon()
    {
        if (expenseAddInfoIcon.isDisplayed())
        {
            try {
                File screenshotFile = expenseAddInfoIcon.getScreenshotAs(OutputType.FILE);
                BufferedImage image = ImageIO.read(screenshotFile);
                File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\expenseAddInfoIcon.png");
                ImageIO.write(image, "png", outputFile);
                test.pass("Extract Expense Add Info Icon", MediaEntityBuilder.createScreenCaptureFromPath("expenseAddInfoIcon.png").build());
            } catch (IOException e) {
                e.printStackTrace();
                test.fail("Failed to Expense Add Info Icon" + e.getMessage());
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : expenseAddInfoIcon");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/search_expense")
    private AndroidElement expenseSearchExpenseIcon;
    public void expenseSearchExpenseIcon()
    {
        if (expenseSearchExpenseIcon.isDisplayed())
        {
            try {
                File screenshotFile = expenseSearchExpenseIcon.getScreenshotAs(OutputType.FILE);
                BufferedImage image = ImageIO.read(screenshotFile);
                File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\expenseSearchExpenseIcon.png");
                ImageIO.write(image, "png", outputFile);
                test.pass("Extract Expense Search Expense Icon", MediaEntityBuilder.createScreenCaptureFromPath("expenseSearchExpenseIcon.png").build());
            }
            catch (IOException e) {
                e.printStackTrace();
                test.fail("Failed to Expense Search Expense Icon" + e.getMessage());
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : expenseSearchExpenseIcon");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    private AndroidElement expenseSelectedItemText;
    public void expenseSelectedItemText()
    {
        if(expenseSelectedItemText.isDisplayed())
        {
            if (expenseSelectedItemText.getText() != null)
            {
                Assert.assertEquals(expenseSelectedItemText.getText(), ExpenseText.expenseSelectedItemText());
                test.info(expenseSelectedItemText.getText());
                test.pass("Assert Method Verified");
            }
            else
            {
                test.fail("Failed Expense Selected Item Text");
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : expenseSelectedItemText");
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_changeSelectedItem")
    private AndroidElement expenseChangeSelectedItemIcon;
    public void expenseChangeSelectedItemIcon()
    {
        if (expenseChangeSelectedItemIcon.isDisplayed())
        {
            try {
                File screenshotFile = expenseChangeSelectedItemIcon.getScreenshotAs(OutputType.FILE);
                BufferedImage image = ImageIO.read(screenshotFile);
                File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\expenseChangeSelectedItemIcon.png");
                ImageIO.write(image, "png", outputFile);
                test.pass("Extract Expense Change Selected Item Icon", MediaEntityBuilder.createScreenCaptureFromPath("expenseChangeSelectedItemIcon.png").build());
            }
            catch (IOException e) {
                e.printStackTrace();
                test.fail("Failed to Expense Change Selected Item Icon" + e.getMessage());
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : expenseChangeSelectedItemIcon");
        }
    }

}

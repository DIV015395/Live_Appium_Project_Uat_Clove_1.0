package orguivalidation.patientsearch;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.utils.BaseDriver;
import org.openqa.selenium.OutputType;
import org.testng.Assert;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class PatientSearchScreen extends BaseDriver
{
    ExtentTest test;
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_title")
    private AndroidElement patientSearchTitle;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_selectedItem")
    private AndroidElement patientSelectItem;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_changeSelectedItem")
    private AndroidElement patientChangeSelectedItem;
    @AndroidFindBy(id = "com.clove.clover.uat:id/et_searchQuery")
    private AndroidElement patientSearchQuery;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_patientSearchBy")
    private AndroidElement patientPatientSearchBy;
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_search")
    private AndroidElement patientIvSearchIcon;
    public PatientSearchScreen(AndroidDriver driver,ExtentTest test)
    {
        super(driver);
        this.test = test;
    }
    public void validationText(AndroidElement element,String Actual)
    {
        if (element.isDisplayed())
        {
            if (element.getText() != null)
            {
                System.out.println(element.getText());
                System.out.println(Actual);
                Assert.assertEquals(element.getText(), Actual);
                test.info(element.getText());
                test.pass("Title Verified : "+Actual);
            }
            else
            {
                test.fail("Failed Login Title Text Validation");
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : "+element);
        }
    }
    public void validationIcon(AndroidElement ImageElement,String ImageName)
    {
        if (ImageElement.isDisplayed())
        {
            try
            {
                File screenshotFile = ImageElement.getScreenshotAs(OutputType.FILE);
                BufferedImage image = ImageIO.read(screenshotFile);
                File outputFile = new File("C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove_1.0\\screenshotscreen\\"+ImageName);
                ImageIO.write(image, "png", outputFile);
                test.pass("Extract  "+ImageElement, MediaEntityBuilder.createScreenCaptureFromPath(ImageName).build());
            }
            catch (IOException e)
            {
                e.printStackTrace();
                test.fail("Failed to Expense Search Expense Icon" + e.getMessage());
            }
        }
        else
        {
            test.fail("Failed to Identify the Android Element! : "+ImageElement);
        }
    }
    public void patientSearchTitle()
    {
        validationText(patientSearchTitle,"Patients");
    }
    public void patientIvSearchIcon()
    {
        validationIcon(patientIvSearchIcon,"patientSearchIcon.png");
    }

}

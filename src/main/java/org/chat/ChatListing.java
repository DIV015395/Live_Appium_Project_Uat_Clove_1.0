package org.chat;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.utils.NewBaseDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ResourceBundle;
public class ChatListing extends NewBaseDriver
{
    ExtentTest test;
    public ChatListing(AndroidDriver<AndroidElement> driver, ExtentTest test) {
        super(driver, test);
        this.test = test;
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_title")
    private List<AndroidElement> listingTitleName;
    private ResourceBundle resourceBundle = ResourceBundle.getBundle("chatSearchUser");
    private String listingName = resourceBundle.getString("listingName");
    public void listingUserNameClick()
    {
        String type = listingName;
        for (WebElement option : listingTitleName) {
            if (option.getText().equals(type))
            {
                NewBaseDriver.setDriverWaitTenSecond(driver);
                option.click();
                test.log(Status.PASS, "Click on User for Chating ");
                break;
            }
        }
    }
    @AndroidFindBy(id = "com.clove.clover.uat:id/textViewMessage")
    private List<AndroidElement> textViewMessage;
    public void textViewMessage()
    {

        NewBaseDriver.setDriverWaitTenSecond(driver);
        TouchAction touchAction = new TouchAction(driver);

        String type = "Hello Sir What are you doing";
        for (WebElement option : textViewMessage) {
            if (option.getText().equals(type))
            {
                NewBaseDriver.setDriverWaitTenSecond(driver);
                touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(option))).release().perform();
                test.log(Status.PASS, "Click on User for Chating");
                break;
            }
        }
    }
    public void textViewMessageChatFound()
    {
        String type = "Hello Sir What are you doing";
        for (WebElement option : textViewMessage) {
            if (option.getText().equals(type))
            {
               System.out.println(option.getText());
                test.log(Status.PASS, "Click on User for Chating");
                break;
            }
        }
    }

}

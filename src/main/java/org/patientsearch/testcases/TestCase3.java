//Print list of Three dot button option
//validate all option
package org.patientsearch.testcases;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase3 {
    @AndroidFindBy(id = "com.clove.clover.uat:id/iv_patientRow_action")
    public WebElement Threedotbutton;
    //Add Files
    //Add Appointment
    //View Files
    //Work Done
    //Cancel
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    public List<WebElement> listofaction;
}

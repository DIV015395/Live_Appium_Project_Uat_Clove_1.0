package org.schedule.uivalidation.firstpage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.schedule.SchedulePage;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ValidationClinicName extends SchedulePage {
    @AndroidFindBy(id = "com.clove.clover.uat:id/layout_clinicSelect")
    private WebElement layoutClinicSelect;
    @AndroidFindBy(id = "com.clove.clover.uat:id/tv_itemTitle")
    private List<AndroidElement> tvItemTitleList;

    public ValidationClinicName(AndroidDriver driver) {
        super(driver);
    }

    public Set<String> scrollAndFindClinicsByAlphabet() {
        Set<String> uniqueStrings = new TreeSet<>();

        // Click the clinic select layout to open the list
        layoutClinicSelect.click();

        // Wait for the list of clinics to load
        // You may need to add appropriate waits here if needed

        // Define the list of letters in alphabetical order
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (char letter : alphabet.toCharArray()) {
            // Loop through the list to find clinic names starting with the specified letter
            for (AndroidElement element : tvItemTitleList) {
                String clinicName = element.getText();
                if (clinicName.startsWith(String.valueOf(letter)) || clinicName.startsWith(String.valueOf(Character.toLowerCase(letter)))) {
                    uniqueStrings.add(clinicName);
                    System.out.println("Found clinic starting with letter " + letter + ": " + clinicName);
                    break; // Move to the next letter
                }
            }

            // If a name starting with the specified letter is not found, scroll the list
            while (true) {
                AndroidElement lastElement = tvItemTitleList.get(tvItemTitleList.size() - 1);
                String lastClinicName = lastElement.getText();
                if (lastClinicName.startsWith(String.valueOf(letter)) || lastClinicName.startsWith(String.valueOf(Character.toLowerCase(letter)))) {
                    uniqueStrings.add(lastClinicName);
                    System.out.println("Found clinic starting with letter " + letter + ": " + lastClinicName);
                    break;
                }

                // Scroll the list
                driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));

                // Wait for the list to load (add appropriate waits if needed)
                //...

                // Add clinic names starting with the current letter to the set
                for (AndroidElement element : tvItemTitleList) {
                    String clinicName = element.getText();
                    if (clinicName.startsWith(String.valueOf(letter)) || clinicName.startsWith(String.valueOf(Character.toLowerCase(letter)))) {
                        uniqueStrings.add(clinicName);
                        System.out.println("Found clinic starting with letter " + letter + ": " + clinicName);
                        break; // Move to the next letter
                    }
                }
            }
        }

        // Click the clinic select layout again to close the list (if needed)
        layoutClinicSelect.click();

        // Return the unique clinic names in sorted order (TreeSet for sorting)
        return uniqueStrings;
    }
}

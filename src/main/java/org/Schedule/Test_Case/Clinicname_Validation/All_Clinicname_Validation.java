package org.Schedule.Test_Case.Clinicname_Validation;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.Schedule.Appointment_Booking;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class All_Clinicname_Validation extends Appointment_Booking
{
    public All_Clinicname_Validation(AndroidDriver driver)
    {
        super(driver);
    }
    public static void dataReadTest() {
            // Set the path to your Excel file
            String excelFilePath = "C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove\\src\\main\\java\\org\\Schedule\\Test_Case\\Clinicname_Validation\\Clinic_Name.xlsx";

            // Set the sheet name in the Excel file where your clinic names are stored
            String sheetName = "Sheet1";

            try {
                // Read the Excel file
                FileInputStream fis = new FileInputStream(excelFilePath);
                Workbook workbook = new XSSFWorkbook(fis);

                // Get the desired sheet from the Excel file
                Sheet sheet = workbook.getSheet(sheetName);

                // Iterate over the rows in the sheet
                for (Row row : sheet)
                {
                    // Get the cell value from the "clinic_Name" column (e.g., column index 0)
                    Cell cell = row.getCell(0);
                    String clinicName = cell.getStringCellValue();

                    // Print the clinic name
                    System.out.println(clinicName);
                }
                // Close the workbook and input stream
                workbook.close();
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    public void selectClinicDropdown() throws InterruptedException
    {
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        tv_home_schedule.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        layout_clinicSelect.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Wakad\"));"));
        System.out.println(tv_itemTitle.size());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(15000);
        for(int i=0;i<tv_itemTitle.size();i++)
        {
            System.out.println(tv_itemTitle.get(i).getText());
        }
        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}

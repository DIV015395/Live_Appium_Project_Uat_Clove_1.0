package org.schedule.clinicnamevalidation;

import io.appium.java_client.android.AndroidDriver;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.schedule.AppointmentBooking;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ClinicNameValidation extends AppointmentBooking {
    public ClinicNameValidation(AndroidDriver driver) {
        super(driver);
    }

    String excelFilePath = "C:\\Users\\ManjeetSharma\\IdeaProjects\\Live_Appium_Project_Uat_Clove\\src\\main\\java\\org\\Schedule\\Test_Case\\Clinicname_Validation\\ClinicName.xlsx";
    String sheetName = "Sheet1";

    public void selectClinicDropdown() throws InterruptedException, IOException {


        //Exel file reader code
        FileInputStream fis = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheet(sheetName);
        // Iterate over the rows in the sheet
        //Exel file Reader from exel //
        // Get the desired sheet from the Excel file
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
        for (Row row : sheet)
        {
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Cell cell = row.getCell(0);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            String AllClinic = cell.getStringCellValue();

            System.out.println(AllClinic);

            for (int i = 0; i < tv_itemTitle.size(); i++)
            {
                System.out.println(tv_itemTitle.get(i).getText());
                Assert.assertEquals(AllClinic,tv_itemTitle.get(i).getText());

            }
        }

        Thread.sleep(15000);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

}

package org.scheduletest.testcases.secondpage;

import org.testng.annotations.Test;
import org.timeselection.CurrentTimeInIndia;

import java.util.ResourceBundle;


public class tes {

    ResourceBundle resourceBundle = ResourceBundle.getBundle("schedule");
    String doctorName = resourceBundle.getString("doctorName");
    String clinicName = resourceBundle.getString("clinicName");

    @Test
    public void main() {
        String times = CurrentTimeInIndia.getNearestHalfHourTime();
        System.out.println(times);
        System.out.println(doctorName);
        System.out.println(clinicName);

    }


}

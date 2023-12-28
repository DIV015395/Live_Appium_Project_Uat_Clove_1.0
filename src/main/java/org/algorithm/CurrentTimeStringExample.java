package org.algorithm;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentTimeStringExample {
    public static String currentTime() {
        // Get the current time
        LocalTime currentTime = LocalTime.now();

        // Define the desired time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        // Format the current time as a string
        String formattedTime = currentTime.format(formatter);

        // Print the formatted time
        System.out.println("Current Time: " + formattedTime);
        return formattedTime;
    }
}

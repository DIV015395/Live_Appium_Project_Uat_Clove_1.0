package org.algorithm;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class CurrentTimeStringExample {
    public static String currentTime() {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Time: " + formattedTime);
        return formattedTime;
    }
}

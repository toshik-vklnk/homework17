package com.home;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateClass {
    public static void main(String[] args) {
        System.out.println(firstmethod());
        System.out.println(secondmethod());
        System.out.println(thirdmethod());
        System.out.println(fourthmethod());
    }

    public static String firstmethod() {
        LocalDateTime date1 = LocalDateTime.of(2020, 01, 25, 20, 00, 17);
        LocalDateTime date2 = LocalDateTime.of(2020, 01, 28, 22, 10, 54);
        Duration duration = Duration.between(date1, date2);
        long seconds = Math.abs(duration.getSeconds());
        long hours = seconds / 3600;
        seconds -= (hours * 3600);
        long minutes = seconds / 60;
        seconds -= (minutes * 60);
        return (hours + " hours " + minutes + " minutes " + seconds + " seconds");
    }

    public static String secondmethod() {
        LocalDateTime lectionStart = LocalDateTime.of(2020, 01, 25, 20, 00, 23);
        LocalDateTime lectionEnd = LocalDateTime.of(2020, 01, 25, 22, 00, 48);
        Duration d = Duration.between(lectionStart, lectionEnd);
        long seconds2 = Math.abs(d.getSeconds());
        long minutes2 = seconds2 / 60;
        seconds2 -= (minutes2 * 60);
        return (minutes2 + " minutes " + seconds2 + " seconds");
    }

    public static String thirdmethod() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MMM/dd HH:mm:ss", Locale.US);
        LocalDateTime localDateTime = LocalDateTime.parse("1999/Jun/18 07:34:56", formatter);
        return localDateTime.toString();
    }

    public static String fourthmethod() {
        LocalDateTime dateTime1 = LocalDateTime.of(2001, 12, 01, 23, 56);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("HH:mm yyyy/MM/dd");
        String s = dateTime1.format(formatter2);
        return  s;
    }
}

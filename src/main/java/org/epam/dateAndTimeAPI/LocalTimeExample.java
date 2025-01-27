package org.epam.dateAndTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime specificTime = LocalTime.of(14, 30, 0);
        System.out.println(specificTime);

        LocalTime plusHours = now.plusHours(1);
        System.out.println(plusHours);

        LocalTime minusHours = now.minusHours(2);
        System.out.println(minusHours);

        //you can do plus minus hours, mins, secs, nanosecs etc

        int second = now.getSecond();
        System.out.println(second);

    }
}

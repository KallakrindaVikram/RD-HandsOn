package org.epam.dateAndTimeAPI;

import java.time.*;

public class LocalDateExample {
    public static void main(String[] args) {

        //gives LocalDateExample of now
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //get specific date
        LocalDate specificDate = LocalDate.of(2021, 1, 25);
        System.out.println(specificDate);

        //add some days for existing date
        LocalDate addDays = today.plusDays(1);
        System.out.println(addDays);

        //remove some days from existing date
        LocalDate minusDays = today.minusDays(1);
        System.out.println(minusDays);

        //get the day of the date given
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}

package org.epam.dateAndTimeAPI;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        /*LOCAL DATE TIME*/
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-DD-YYYY hh:mm"); //mm - minutes , MM - months
        System.out.println(dateTime.format(formatter));


        //ZONED DATE TIME

        ZonedDateTime zonalDateTime = ZonedDateTime.now();
        System.out.println(zonalDateTime);

        System.out.println(ZonedDateTime.now(ZoneId.of("Europe/London")));


        //Duration - for Time
        LocalTime startTime = LocalTime.of(12,00,00);
        LocalTime endTime = LocalTime.of(16,00,00);
        System.out.println(Duration.between(startTime, endTime));

        //Period - for Dates
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = startDate.plusYears(2);
        System.out.println(Period.between(startDate,endDate));
    }
}

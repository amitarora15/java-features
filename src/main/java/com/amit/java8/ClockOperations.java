package com.amit.java8;

import java.time.*;

public class ClockOperations {

    public static void main(String[] args) {
        Clock utcClock = Clock.systemUTC();
        Clock systemDefaultZoneClock =  Clock.systemDefaultZone();
        Clock indiaClock = Clock.system(ZoneId.of("Asia/Kolkata"));

        System.out.println(utcClock.instant());  //Always in UTC
        System.out.println(systemDefaultZoneClock.instant());  //Always in UTC
        System.out.println(indiaClock.instant());  //Always in UTC

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime utclocalDateTime = LocalDateTime.now(utcClock);
        System.out.println(utclocalDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZonedDateTime utcZonedDateTime = ZonedDateTime.now(utcClock);
        System.out.println(utcZonedDateTime);

        LocalDateTime  from = LocalDateTime.of(2020, Month.FEBRUARY,20, 9, 9);
        LocalDateTime  to = LocalDateTime.of(2021, Month.MARCH,20, 9, 9);
        Duration duration = Duration.between(from, to);
        System.out.println(duration.toDays());
    }

}

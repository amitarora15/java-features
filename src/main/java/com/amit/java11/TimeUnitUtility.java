package com.amit.java11;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TimeUnitUtility {
    public static void main(String[] args) {
        System.out.println(TimeUnit.DAYS.convert(Duration.ofHours(24)));
    }
}

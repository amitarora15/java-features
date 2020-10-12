package com.amit.java12;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collections {

    public static void main(String[] args) {
        double result = Stream.of(1,2,3,4).collect(Collectors.teeing(
                Collectors.summingDouble(i -> i),
                Collectors.counting(),
                (sum, count) -> sum/count
        ));
        System.out.println(result);
    }
}

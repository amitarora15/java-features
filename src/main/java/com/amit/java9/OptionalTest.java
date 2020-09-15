package com.amit.java9;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> validString = Optional.ofNullable("Amit");
        Stream<String> str=  validString.stream();
        str.forEach(System.out::println);
    }

}

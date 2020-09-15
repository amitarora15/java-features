package com.amit.java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> validString = Optional.ofNullable("Amit");
        System.out.println("validString optional present : " + validString.isPresent());
        System.out.println("validString optional else get : " + validString.orElse("Not present"));
        System.out.println("validString optional get lower case or else get : " + validString.map(String::toLowerCase).orElseGet(() -> "Not present"));
        validString.ifPresent(s -> System.out.println("Data present : "+ s));
        try {
            System.out.println("Nullable optional get lower case or else get : " + validString.map(String::toLowerCase).orElseThrow(RuntimeException::new));
        } catch (RuntimeException e){
            e.printStackTrace();
        }

       Optional<String> optionalS = Optional.ofNullable(null);
       System.out.println("Nullable optional present : " + optionalS.isPresent());
       System.out.println("Nullable optional else get : " + optionalS.orElse("Amit"));
       System.out.println("Nullable optional get lower case or else get : " + optionalS.map(String::toLowerCase).orElseGet(() -> "Amit"));

       try {
           System.out.println("Nullable optional get lower case or else get : " + optionalS.map(String::toLowerCase).orElseThrow(RuntimeException::new));
       } catch (RuntimeException e){
           e.printStackTrace();
       }

    }

}

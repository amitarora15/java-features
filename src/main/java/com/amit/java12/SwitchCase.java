package com.amit.java12;

public class SwitchCase {

    public static void main(String[] args) {
        String day = "Monday";
        String result = switch (day){
            case "Monday", "Tuesday" -> "Weekday";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };
        System.out.println(result);
    }
}

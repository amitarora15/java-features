package com.amit.java13;

public class SwitchExpression {

    public static void main(String[] args) {
        String day = "Tuesday";
        String result = switch (day){
            case "Monday", "Tuesday" : yield "Weekday";
            //case "Tuesday" : yield "Weekday2";
            case "Wednesday", "Thursday", "Friday" : yield  "Weekday-3";
            default : yield  "Sunday";
        };
        System.out.println(result);

        result = switch (day){
            case "Monday", "Tuesday" -> "Weekday";
                //case "Tuesday" : yield "Weekday2";
            case "Wednesday", "Thursday", "Friday" ->  "Weekday-3";
            default ->  "Sunday";
        };
        System.out.println(result);
    }
}

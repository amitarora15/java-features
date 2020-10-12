package com.amit.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactFormatter {

    public static void main(String[] args) {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.LONG);
        formatter.setMinimumFractionDigits(1);
        System.out.println(formatter.format(2035663.45));

        formatter = NumberFormat.getCompactNumberInstance(new Locale("en", "US"),
                NumberFormat.Style.SHORT);
        formatter.setMinimumFractionDigits(1);
        System.out.println(formatter.format(2035663.45));

    }
}

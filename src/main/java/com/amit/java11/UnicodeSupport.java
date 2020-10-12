package com.amit.java11;

public class UnicodeSupport {

    public static void main(String[] args) {
        String codepoint = "U+1F92B";   // crazy face
        System.out.println(convertCodePoints(codepoint));
    }

    static char[] convertCodePoints(String codePoint) {
        Integer i = Integer.valueOf(codePoint.substring(2), 16);
        char[] chars = Character.toChars(i);
        return chars;

    }
}
